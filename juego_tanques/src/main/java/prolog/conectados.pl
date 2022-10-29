ruta(Inicio, Solucion) :-
    consult('src/main/java/prolog/bdc_conectado.pl'),
    consult('src/main/java/prolog/bdc_encontrar.pl'),
    busqueda_anchura([[Inicio]], Lista_ruta),
    reverse(Lista_ruta,Solucion),!.

busqueda_anchura([[Nodo | Ruta] |_], [Nodo | Ruta]) :-
    encontrar(Nodo).

busqueda_anchura([[Nodo | Ruta] | Rutas], Solucion) :-
    bagof([M,Nodo|Ruta],
    (conectado(Nodo, M),
     \+ member(M, [Nodo | Ruta])), Nueva_ruta),
    append(Rutas, Nueva_ruta, Rutas1), !,
    busqueda_anchura(Rutas1, Solucion);
    busqueda_anchura(Rutas, Solucion).

borrar_conectados :- dynamic(conectado/2),
          consult('src/main/java/prolog/bdc_conectado.pl'),
          retractall(conectado(_,_)),
          tell('src/main/java/prolog/bdc_conectado.pl'),
          told.

borrar_encontrar :- dynamic(encontrar/1),
          consult('src/main/java/prolog/bdc_encontrar.pl'),
          retractall(encontrar(_)),
          tell('src/main/java/prolog/bdc_encontrar.pl'),
          told.

insertar_conectado(X,Y) :- dynamic(conectado/2),
          consult('src/main/java/prolog/bdc_conectado.pl'),
          assert(conectado(X,Y)),
          tell('src/main/java/prolog/bdc_conectado.pl'),
          listing(conectado),
          told.

insertar_encontrar(X) :- dynamic(encontrar/1),
          consult('src/main/java/prolog/bdc_encontrar.pl'),
          assert(encontrar(X)),
          tell('src/main/java/prolog/bdc_encontrar.pl'),
          listing(encontrar),
          told.


