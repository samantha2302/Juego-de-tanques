package prolog;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;
import movimiento.Funcion;
import org.jpl7.Query;

public class Conexion {
    public static List movimientosPrologMatriz(String [][] matriz, int posicionX, int posicionY ){
            List<String> listaPosibles = new ArrayList<String>();
            if ((posicionX+1 >= 0)&& (posicionX+1 < matriz.length) && (matriz[posicionX+1][posicionY] != "X")){
                listaPosibles.add(matriz[posicionX+1][posicionY]);
            }
                
            if ((posicionX-1 >= 0)&& (posicionX-1 < matriz.length) && (matriz[posicionX-1][posicionY] != "X")){
                listaPosibles.add(matriz[posicionX-1][posicionY]);
            }
                
            if ((posicionY+1 >= 0)&& (posicionY+1 < matriz[0].length) && (matriz[posicionX][posicionY+1] != "X")){
                listaPosibles.add(matriz[posicionX][posicionY+1]);
            }
                
            if ((posicionY-1 >= 0)&& (posicionY-1 < matriz[0].length) && (matriz[posicionX][posicionY-1] != "X")){
                listaPosibles.add(matriz[posicionX][posicionY-1]);
            }
            return listaPosibles;
        
    }
    
    public static void crearConectadosProlog(String[][] matriz){
        String t1="consult('src/main/java/prolog/conectados.pl')";
        Query conexion = new Query (t1);
        System.out.println(conexion.hasSolution()?"conexion exitosa":" error");
        Query borrar=new Query("borrar_conectados");
        System.out.println(borrar.hasSolution()?"borrar conectados":" error");
        int i, j, k;
        for (i = 0; i < matriz.length; i++) { 
           for (j = 0; j < matriz[i].length; j++) {
               k=0;
               if (matriz[i][j] != "X"){
               List movimientosPosibles=movimientosPrologMatriz(matriz, i, j);
               for (k=0;k<movimientosPosibles.size();k++) {
                Query insertar=new Query("insertar_conectado("+matriz[i][j]+","+movimientosPosibles.get(k)+")");
                System.out.println(insertar.hasSolution()?"agregar conectado":" error");
               }
               }
            }
       }
    }
    
    public static int revisarPosicionJugador(String [][] matrizJuego, String[][] matrizSinTanques, int posicionFila, int posicionColumna){
        if ((posicionFila+1 >= 0)&& (posicionFila+1 < matrizJuego.length) &&(matrizJuego[posicionFila+1][posicionColumna]=="t")){
                int posicionFilaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,"t");
                int posicionColumnaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,"t");
                
                String antiguaPosicion=matrizSinTanques[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua];
                matrizJuego[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua]=antiguaPosicion;
                
                int i, j;
                for (i = 0; i < matrizJuego.length; i++) { 
                    for (j = 0; j < matrizJuego[i].length; j++) {
                }
                
                matrizJuego[matrizJuego.length-1][matrizJuego[i].length-1]="t";
                return 1;
            }
        }
        
        
        if ((posicionFila-1 >= 0)&& (posicionFila-1 < matrizJuego.length) &&(matrizJuego[posicionFila-1][posicionColumna]=="t")){
                int posicionFilaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,"t");
                int posicionColumnaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,"t");
                
                String antiguaPosicion=matrizSinTanques[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua];
                matrizJuego[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua]=antiguaPosicion;
                
                int i, j;
                for (i = 0; i < matrizJuego.length; i++) { 
                    for (j = 0; j < matrizJuego[i].length; j++) {
                }
                
                matrizJuego[matrizJuego.length-1][matrizJuego[i].length-1]="t";
                return 1;
            }
        }
        
        if ((posicionColumna+1 >= 0)&& (posicionColumna+1 < matrizJuego[0].length) &&(matrizJuego[posicionFila][posicionColumna+1]=="t")){
                int posicionFilaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,"t");
                int posicionColumnaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,"t");
                
                String antiguaPosicion=matrizSinTanques[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua];
                matrizJuego[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua]=antiguaPosicion;
                
                int i, j;
                for (i = 0; i < matrizJuego.length; i++) { 
                    for (j = 0; j < matrizJuego[i].length; j++) {
                }
                
                matrizJuego[matrizJuego.length-1][matrizJuego[i].length-1]="t";
                return 1;  
            }
        }
        
        if ((posicionColumna-1 >= 0)&& (posicionColumna-1 < matrizJuego[0].length) &&(matrizJuego[posicionFila][posicionColumna-1]=="t")){
                int posicionFilaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,"t");
                int posicionColumnaJugadorAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,"t");
                
                String antiguaPosicion=matrizSinTanques[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua];
                matrizJuego[posicionFilaJugadorAntigua][posicionColumnaJugadorAntigua]=antiguaPosicion;
                
                int i, j;
                for (i = 0; i < matrizJuego.length; i++) { 
                    for (j = 0; j < matrizJuego[i].length; j++) {
                }
                
                matrizJuego[matrizJuego.length-1][matrizJuego[i].length-1]="t";
                return 1;  
            }
        }
        return 0;
    }
    
    public static List rutaMovimientoArmada(String tanqueBuscado, String tanque2, String tanque3, String encontrar){
       String consultar="consult('src/main/java/prolog/conectados.pl')";
       Query conexion = new Query (consultar);
       System.out.println(conexion.hasSolution()?"conexion exitosa":" error");
       
       String consulta="ruta("+tanqueBuscado+",X)";
       
       Query resultado=new Query(consulta);
       
       String resultadoProlog=String.valueOf(resultado.oneSolution().get("X"));
       String reemplazar = resultadoProlog.replace("[","");
       String reemplazar1 = reemplazar.replace("]","");
       String reemplazar2 = reemplazar1.replace(" ","");
       List<String> listaRuta = new ArrayList<String>(Arrays.asList(reemplazar2.split(",")));
       
       listaRuta.remove(tanqueBuscado);
       listaRuta.remove(tanque2);    
       listaRuta.remove(tanque3);    
       listaRuta.remove(encontrar);      
       return listaRuta;
    }
    
    public static int realizarMovimientoArmada(String [][] matrizJuego, String[][] matrizSinTanques,
            String tanque, String ruta, int resultado){
        int posicionFilaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque);
        int posicionColumnaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque);

        String antiguaPosicion=matrizSinTanques[posicionFilaTanqueAntigua][posicionColumnaTanqueAntigua];
        matrizJuego[posicionFilaTanqueAntigua][posicionColumnaTanqueAntigua]=antiguaPosicion;
        
        int posicionFilaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 0,ruta);
        int posicionColumnaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 1,ruta);
       
        
        matrizJuego[posicionFilaTanqueMov][posicionColumnaTanqueMov]=tanque;
        
        
        if (resultado==0){
        return revisarPosicionJugador(matrizJuego, matrizSinTanques, posicionFilaTanqueMov, posicionColumnaTanqueMov);
        }
        return 0;
    }
    
    public static void moverArmada(String[][] matrizJuego, String[][] matrizSinTanques, JLabel textoVida, String tanque1, 
            String tanque2, String tanque3, int cantidadMovimientoTanque1, int cantidadMovimientoTanque2, 
            int cantidadMovimientoTanque3){
        
        int posicionFilaJugador=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,"t");
        int posicionColumnaJugador=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,"t");
        
        String posicionOriginalJugador=matrizSinTanques[posicionFilaJugador][posicionColumnaJugador];
        
        String consultar="consult('src/main/java/prolog/conectados.pl')";
        Query conexion = new Query (consultar);
        System.out.println(conexion.hasSolution()?"conexion exitosa":" error");
        
        Query eliminarEncontrar=new Query("borrar_encontrar");
        System.out.println(eliminarEncontrar.hasSolution()?"borrar encontrar":" error");
        
        Query insertarEncontrar=new Query("insertar_encontrar("+posicionOriginalJugador+")");
        System.out.println(insertarEncontrar.hasSolution()?"agregar encontrar":" error");
        
        int posicionFilaTanque1A=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque1);
        int posicionColumnaTanque1A=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque1);
        
        String posicionOriginalTanque1A="";
        
        if ((posicionFilaTanque1A!=-1) && (posicionColumnaTanque1A!=-1)){
            posicionOriginalTanque1A=matrizSinTanques[posicionFilaTanque1A][posicionColumnaTanque1A];
        }
        
        int posicionFilaTanque2A=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque2);
        int posicionColumnaTanque2A=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque2);
        
        String posicionOriginalTanque2A="";
        
        if ((posicionFilaTanque2A!=-1) && (posicionColumnaTanque2A!=-1)){
            posicionOriginalTanque2A=matrizSinTanques[posicionFilaTanque2A][posicionColumnaTanque2A];
        }
        
        int posicionFilaTanque3A=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque3);
        int posicionColumnaTanque3A=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque3);
        
        String posicionOriginalTanque3A="";
        
        if ((posicionFilaTanque3A!=-1) && (posicionColumnaTanque3A!=-1)){
            posicionOriginalTanque3A=matrizSinTanques[posicionFilaTanque3A][posicionColumnaTanque3A];
        }
        
        int verificar=0;
        
        int bandera=2;
        
        if ((posicionFilaTanque1A!=-1) && (posicionColumnaTanque1A!=-1)){
            List<String> listaRutaTanque1 = rutaMovimientoArmada(posicionOriginalTanque1A, posicionOriginalTanque2A, posicionOriginalTanque3A, posicionOriginalJugador);
            for (int i=0;i<bandera;i++) {
                if (listaRutaTanque1.size() >= cantidadMovimientoTanque1){
                    int resultado= realizarMovimientoArmada(matrizJuego, matrizSinTanques, tanque1, listaRutaTanque1.get(i).intern(), verificar);
                    if (resultado==1){
                        int cantidadVida=parseInt(textoVida.getText());
                        textoVida.setText(String.valueOf(cantidadVida-resultado));
                        verificar=1;
                    }
                    break;
                }
                if (listaRutaTanque1.size() <= cantidadMovimientoTanque1){
                int posicionFilaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque1);
                int posicionColumnaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque1);

                String antiguaPosicion=matrizSinTanques[posicionFilaTanqueAntigua][posicionColumnaTanqueAntigua];

                int posicionFilaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 0,antiguaPosicion);
                int posicionColumnaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 1,antiguaPosicion);
                int resultado= revisarPosicionJugador(matrizJuego, matrizSinTanques, posicionFilaTanqueMov, posicionColumnaTanqueMov);
                if (resultado==1){
                    int cantidadVida=parseInt(textoVida.getText());
                    textoVida.setText(String.valueOf(cantidadVida-resultado));
                    verificar=1;
                }
                break;
            }
            }    
        }
        
        int posicionFilaTanque1B=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque1);
        int posicionColumnaTanque1B=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque1);
        
        String posicionOriginalTanque1B="";
        
        if ((posicionFilaTanque1B!=-1) && (posicionColumnaTanque1B!=-1)){
            posicionOriginalTanque1B=matrizSinTanques[posicionFilaTanque1B][posicionColumnaTanque1B];
        }
        
        int posicionFilaTanque2B=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque2);
        int posicionColumnaTanque2B=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque2);
        
        String posicionOriginalTanque2B="";
        
        if ((posicionFilaTanque2B!=-1) && (posicionColumnaTanque2B!=-1)){
            posicionOriginalTanque2B=matrizSinTanques[posicionFilaTanque2B][posicionColumnaTanque2B];
        }
        
        int posicionFilaTanque3B=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque3);
        int posicionColumnaTanque3B=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque3);
        
        String posicionOriginalTanque3B="";
        
        if ((posicionFilaTanque3B!=-1) && (posicionColumnaTanque3B!=-1)){
            posicionOriginalTanque3B=matrizSinTanques[posicionFilaTanque3B][posicionColumnaTanque3B];
        }
        
        if ((posicionFilaTanque2B!=-1) && (posicionColumnaTanque2B!=-1)){
            List<String> listaRutaTanque2 = rutaMovimientoArmada(posicionOriginalTanque2B, posicionOriginalTanque3B, posicionOriginalTanque1B, posicionOriginalJugador);
            for (int i=0;i<bandera;i++) {
                if (listaRutaTanque2.size() >= cantidadMovimientoTanque2){
                    int resultado= realizarMovimientoArmada(matrizJuego, matrizSinTanques, tanque2, listaRutaTanque2.get(cantidadMovimientoTanque2-1).intern(),verificar);
                    if (resultado==1){
                        int cantidadVida=parseInt(textoVida.getText());
                        textoVida.setText(String.valueOf(cantidadVida-resultado));
                        verificar=1;
                    }
                    break;
                }
                if (listaRutaTanque2.size() >= cantidadMovimientoTanque2-1){
                    int resultado= realizarMovimientoArmada(matrizJuego, matrizSinTanques, tanque2, listaRutaTanque2.get(i).intern(),verificar);
                    if (resultado==1){
                        int cantidadVida=parseInt(textoVida.getText());
                        textoVida.setText(String.valueOf(cantidadVida-resultado));
                        verificar=1;
                    }
                    break;
                }
            
                if (listaRutaTanque2.size() <= cantidadMovimientoTanque2-1){
                int posicionFilaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque2);
                int posicionColumnaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque2);

                String antiguaPosicion=matrizSinTanques[posicionFilaTanqueAntigua][posicionColumnaTanqueAntigua];

                int posicionFilaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 0,antiguaPosicion);
                int posicionColumnaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 1,antiguaPosicion);
                int resultado= revisarPosicionJugador(matrizJuego, matrizSinTanques, posicionFilaTanqueMov, posicionColumnaTanqueMov);
                if (resultado==1){
                    int cantidadVida=parseInt(textoVida.getText());
                    textoVida.setText(String.valueOf(cantidadVida-resultado));
                    verificar=1;
                }
                break;
            }
            }
        }
        
        int posicionFilaTanque1C=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque1);
        int posicionColumnaTanque1C=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque1);
        
        String posicionOriginalTanque1C="";
        
        if ((posicionFilaTanque1C!=-1) && (posicionColumnaTanque1C!=-1)){
            posicionOriginalTanque1C=matrizSinTanques[posicionFilaTanque1C][posicionColumnaTanque1C];
        }
        
        int posicionFilaTanque2C=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque2);
        int posicionColumnaTanque2C=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque2);
        
        String posicionOriginalTanque2C="";
        
        if ((posicionFilaTanque2C!=-1) && (posicionColumnaTanque2C!=-1)){
            posicionOriginalTanque2C=matrizSinTanques[posicionFilaTanque2C][posicionColumnaTanque2C];
        }
        
        int posicionFilaTanque3C=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque3);
        int posicionColumnaTanque3C=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque3);
        
        String posicionOriginalTanque3C="";
        
        if ((posicionFilaTanque3C!=-1) && (posicionColumnaTanque3C!=-1)){
            posicionOriginalTanque3C=matrizSinTanques[posicionFilaTanque3C][posicionColumnaTanque3C];
        }
        
        if ((posicionFilaTanque3C!=-1) && (posicionColumnaTanque3C!=-1)){
            List<String> listaRutaTanque3 = rutaMovimientoArmada(posicionOriginalTanque3C, posicionOriginalTanque2C, posicionOriginalTanque1C, posicionOriginalJugador);
            for (int i=0;i<bandera;i++) {
                if (listaRutaTanque3.size() >= cantidadMovimientoTanque3){
                    int resultado= realizarMovimientoArmada(matrizJuego, matrizSinTanques, tanque3, listaRutaTanque3.get(cantidadMovimientoTanque3-1).intern(),verificar);
                    if (resultado==1){
                        int cantidadVida=parseInt(textoVida.getText());
                        textoVida.setText(String.valueOf(cantidadVida-resultado));
                        verificar=1;
                    }
                    break;
                }
                if (listaRutaTanque3.size() >= cantidadMovimientoTanque3-1){
                    int resultado= realizarMovimientoArmada(matrizJuego, matrizSinTanques, tanque3, listaRutaTanque3.get(cantidadMovimientoTanque3-2).intern(),verificar);
                    if (resultado==1){
                        int cantidadVida=parseInt(textoVida.getText());
                        textoVida.setText(String.valueOf(cantidadVida-resultado));
                        verificar=1;
                    }
                    break;
                }

                if (listaRutaTanque3.size() >= cantidadMovimientoTanque3-2){
                    int resultado= realizarMovimientoArmada(matrizJuego, matrizSinTanques, tanque3, listaRutaTanque3.get(i).intern(),verificar);
                    if (resultado==1){
                        int cantidadVida=parseInt(textoVida.getText());
                        textoVida.setText(String.valueOf(cantidadVida-resultado));
                        verificar=1;
                    }
                    break;
                }
                if (listaRutaTanque3.size() <= cantidadMovimientoTanque3-1){
                int posicionFilaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 0,tanque3);
                int posicionColumnaTanqueAntigua=Funcion.buscarFilaColumnaPosicion(matrizJuego, 1,tanque3);

                String antiguaPosicion=matrizSinTanques[posicionFilaTanqueAntigua][posicionColumnaTanqueAntigua];

                int posicionFilaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 0,antiguaPosicion);
                int posicionColumnaTanqueMov=Funcion.buscarFilaColumnaPosicion(matrizSinTanques, 1,antiguaPosicion);
                int resultado= revisarPosicionJugador(matrizJuego, matrizSinTanques, posicionFilaTanqueMov, posicionColumnaTanqueMov);
                if (resultado==1){
                    int cantidadVida=parseInt(textoVida.getText());
                    textoVida.setText(String.valueOf(cantidadVida-resultado));
                    verificar=1;
                }
                break;
            }
            }
        }
    }
    
}
