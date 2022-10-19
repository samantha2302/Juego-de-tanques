
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sam
 */
public class NewMain {
    
    /*
        Esto es una prueba
        Si es 6 derecha
        Si es 4 izquierda
        Si es 8 arriba
        Si es 2 abajo
    */
    
        public static List movimientosPosiblesMatriz(String [][] matriz, int posicionX, int posicionY ){
            List<String> listaPosibles = new ArrayList<String>();
            if ((posicionX+1 >= 0)&& (posicionX+1 < matriz.length)){
                listaPosibles.add(matriz[posicionX+1][posicionY]);
            }
                
            if ((posicionX-1 >= 0)&& (posicionX-1 < matriz.length)){
                listaPosibles.add(matriz[posicionX-1][posicionY]);
            }
                
            if ((posicionY+1 >= 0)&& (posicionY+1 < matriz[0].length)){
                listaPosibles.add(matriz[posicionX][posicionY+1]);
            }
                
            if ((posicionY-1 >= 0)&& (posicionY-1 < matriz[0].length)){
                listaPosibles.add(matriz[posicionX][posicionY-1]);
            }
            return listaPosibles;
        
    }
    
    public static void movimientoMatriz(String [][] matriz){
        // Posicion del tanque principal
        System.out.println("Tanque principal");
        int posicionX = 5; // Fila
        int posicionY = 4; // Columna 
        String tanque;
        System.out.println(matriz[5][4]);
        Scanner sn = new Scanner(System.in);
        int direccion;
        while(true){
            
            System.out.println("Ingrese la direcion que desee: ");
            direccion = sn.nextInt();
            if (direccion == 6){
                String tanqueDerecha = matriz[posicionX+1][posicionY];
                tanque = tanqueDerecha;
                System.out.println(tanqueDerecha);
                posicionX++;
            }else if(direccion == 4){
                String tanqueIzquierda = matriz[posicionX-1][posicionY];
                System.out.println(tanqueIzquierda);
                posicionX--;
                
            }else if(direccion == 8){
                String tanqueArriba = matriz[posicionX][posicionY+1];
                System.out.println(tanqueArriba);
                tanque = tanqueArriba;
                posicionY++;
                
            }else if(direccion == 2){
                String tanqueAbajo = matriz[posicionX][posicionY-1];
                System.out.println(tanqueAbajo);
                posicionY--;
            }else {
                break;
            }
        }
        
    }
    public static void imprimirMatriz(String [][] matrizMapa){
        for (int i = 0; i < matrizMapa.length; i++) { 
            for (int j = 0; j < matrizMapa[i].length; j++) {
                System.out.print(matrizMapa[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
       // Matriz del campo de juegos. 
        String [][] matrizMapa =    {{"a1", "b1","c1","d1","e1", "f1", "g1","h1", "i1", "j1"},
                                    {"a2", "b2","c2","d2","e2", "f2", "g2","h2", "i2", "j2"},
                                    {"a3", "b3","c3","d3","e3", "f3", "g3","h3", "i3", "j3"},
                                    {"a4", "b4","c4","d4","e4", "f4", "g4","h4", "i4", "j4"},
                                    {"a5", "b5","c5","d5","e5", "f5", "g5","h5", "i5", "j5"},
                                    {"a6", "b6","c6","d6","e6", "f6", "g6","h6", "i6", "j6"},
                                    {"a7", "b7","c7","d7","e7", "f7", "g7","h7", "i7", "j7"},
                                    {"a8", "b8","c8","d8","e8", "f8", "g8","h8", "i8", "j8"},
                                    {"a9", "b9","c9","d9","e9", "f9", "g9","h9", "i9", "j9"}, 
                                    {"a10", "b10","c10","d10","e10", "f10", "g10","h10", "i10", "j10"}};
        
       
    
    
       
        System.out.println("Valores introducidos:");
        for (int i = 0; i < matrizMapa.length; i++) { 
            for (int j = 0; j < matrizMapa[i].length; j++) {
                System.out.print(matrizMapa[i][j] + " ");
            }
            System.out.println();
        }
        
        movimientoMatriz(matrizMapa);
        

    }
    
}
