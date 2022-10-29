package movimiento;

import java.awt.Color;
import java.awt.Frame;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import prolog.Conexion;
import ventana.Inicio;
import ventana.Juego2;
import ventana.Juego3;
import ventana.NivelTerminado;

public class Funcion{
    public static String [][] matrizOriginal ={{"a1", "b1","c1","d1","e1", "f1", "g1","h1", "i1", "j1"},
                                {"a2", "b2","c2","d2","e2", "f2", "g2","h2", "i2", "j2"},
                                {"a3", "b3","c3","d3","e3", "f3", "g3","h3", "i3", "j3"},
                                {"a4", "b4","c4","d4","e4", "f4", "g4","h4", "i4", "j4"},
                                {"a5", "b5","c5","d5","e5", "f5", "g5","h5", "i5", "j5"}};
    
    public static String matrizCeros(String[][] matriz, String nombreT1, String nombreT2, String nombreT3){
        String resultado;
        resultado="";
        int i, j;
        for (i = 0; i < matriz.length; i++) { 
           for (j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j]=="X") || (matriz[i][j]=="t") || (matriz[i][j]==nombreT1) || 
                        (matriz[i][j]==nombreT2) || (matriz[i][j]==nombreT3) || (matriz[i][j]=="f")|| 
                        (matriz[i][j]=="g")|| (matriz[i][j]=="h")){
                    resultado+=matriz[i][j] + " ";
                }else{
                    resultado+="0" + " ";
                }
            }
           resultado+="\n";
       }
        return resultado;
    }
    
    public static int contarObjetos(String[][] matriz, String primerObjeto, String segundoObjeto, String tercerObjeto){
        int resultado=0;
        int i, j;
        for (i = 0; i < matriz.length; i++) { 
           for (j = 0; j < matriz[i].length; j++) {
               if ((matriz[i][j]==primerObjeto)|| (matriz[i][j]==segundoObjeto) || (matriz[i][j]==tercerObjeto)){
                   resultado+=1;
            }
       }
    }
    return resultado;
    }
    
    public static void matrizBotones(String[][] matriz, JButton[][] matrizBoton, JPanel panel, String nombreT1, String nombreT2, String nombreT3){
        if (panel.getComponentCount() > 0){
            removerBotonesPanel(matriz, matrizBoton, panel);
        }
        int i, j;
        for (i = 0; i < matriz.length; i++) { 
           for (j = 0; j < matriz[i].length; j++) {
               if (matriz[i][j]=="X"){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.red);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if (matriz[i][j]=="t"){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.GREEN);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if (matriz[i][j]==nombreT1){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.gray);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if (matriz[i][j]==nombreT2){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.ORANGE);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if (matriz[i][j]==nombreT3){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.MAGENTA);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if (matriz[i][j]=="f"){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.blue);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if (matriz[i][j]=="g"){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.blue);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if (matriz[i][j]=="h"){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.blue);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
               continue;
               }
               if ((matriz[i][j]!="X") || (matriz[i][j]!="t") || (matriz[i][j]!=nombreT1) || 
                    (matriz[i][j]!=nombreT2) || (matriz[i][j]!=nombreT3) || (matriz[i][j]!="f")|| 
                    (matriz[i][j]!="g")|| (matriz[i][j]!="h")){
               matrizBoton[i][j]=new JButton();
               matrizBoton[i][j].setBackground(Color.white);
               matrizBoton[i][j].setSize(5,5);
               matrizBoton[i][j].setEnabled(false);

               panel.add(matrizBoton[i][j]);
                    
               }
            }
       }
    }
    
    public static void removerBotonesPanel(String[][] matriz, JButton[][] matrizBoton, JPanel panel){
        int i, j;
        for (i = 0; i < matriz.length; i++) { 
           for (j = 0; j < matriz[i].length; j++) {
               panel.remove(matrizBoton[i][j]);
            }
       }
    }
    
    public static String imprimirMatriz(String[][] matriz){
        String resultado="";
        int i, j;
        for (i = 0; i < matriz.length; i++) { 
           for (j = 0; j < matriz[i].length; j++) {
            resultado+=matriz[i][j] + " ";
            }
           resultado+="\n";
       }
        return resultado;
    }
    
    public static void revisarMovimientosValidosBotones(String [][] matriz, String posicion, 
            JButton botonAbajo,JButton botonArriba,JButton 
                    botonDerecha,JButton botonIzquierda,String nombreT1, String nombreT2,String nombreT3){
        
        int posicionFila=Funcion.buscarFilaColumnaPosicion(matriz, 0,posicion);
        int posicionColumna=Funcion.buscarFilaColumnaPosicion(matriz, 1,posicion);
        
        if ((posicionFila+1 >= 0)&& (posicionFila+1 < matriz.length) &&(matriz[posicionFila+1][posicionColumna]!="X")&&
                (matriz[posicionFila+1][posicionColumna]!=nombreT1)&&
                (matriz[posicionFila+1][posicionColumna]!=nombreT2)&&(matriz[posicionFila+1][posicionColumna]!=nombreT3)&&
                (matriz[posicionFila+1][posicionColumna]!="f")&&(matriz[posicionFila+1][posicionColumna]!="g")&&
                (matriz[posicionFila+1][posicionColumna]!="h")){
            botonAbajo.setEnabled(true);
        }
        if ((posicionFila-1 >= 0)&& (posicionFila-1 < matriz.length) &&(matriz[posicionFila-1][posicionColumna]!="X")&&
                (matriz[posicionFila-1][posicionColumna]!=nombreT1)&&
                (matriz[posicionFila-1][posicionColumna]!=nombreT2)&&(matriz[posicionFila-1][posicionColumna]!=nombreT3)&&
                (matriz[posicionFila-1][posicionColumna]!="f")&&(matriz[posicionFila-1][posicionColumna]!="g")&&
                (matriz[posicionFila-1][posicionColumna]!="h")){
            botonArriba.setEnabled(true);
        }
        if ((posicionColumna+1 >= 0)&& (posicionColumna+1 < matriz[0].length)&&(matriz[posicionFila][posicionColumna+1]!="X")&&
                (matriz[posicionFila][posicionColumna+1]!=nombreT1)&&
                (matriz[posicionFila][posicionColumna+1]!=nombreT2)&&(matriz[posicionFila][posicionColumna+1]!=nombreT3)&&
                (matriz[posicionFila][posicionColumna+1]!="f")&&(matriz[posicionFila][posicionColumna+1]!="g")&&
                (matriz[posicionFila][posicionColumna+1]!="h")){
            botonDerecha.setEnabled(true);
        }
        if ((posicionColumna-1 >= 0)&& (posicionColumna-1 < matriz[0].length)&&(matriz[posicionFila][posicionColumna-1]!="X")&&
                (matriz[posicionFila][posicionColumna-1]!=nombreT1)&&
                (matriz[posicionFila][posicionColumna-1]!=nombreT2)&&(matriz[posicionFila][posicionColumna-1]!=nombreT3)&&
                (matriz[posicionFila][posicionColumna-1]!="f")&&(matriz[posicionFila][posicionColumna-1]!="g")&&
                (matriz[posicionFila][posicionColumna-1]!="h")){
            botonIzquierda.setEnabled(true);
        }
    }
    
    public static void revisarDisparosValidosBotones(String [][] matriz, String posicion, 
            JButton botonAbajo,JButton botonArriba,JButton 
                    botonDerecha,JButton botonIzquierda,String nombreT1, String nombreT2,String nombreT3){
        
        int posicionFila=Funcion.buscarFilaColumnaPosicion(matriz, 0,posicion);
        int posicionColumna=Funcion.buscarFilaColumnaPosicion(matriz, 1,posicion);
        
        if ((posicionFila+1 >= 0)&& (posicionFila+1 < matriz.length) &&(matriz[posicionFila+1][posicionColumna]!="X")){
            if ((matriz[posicionFila+1][posicionColumna]==nombreT1)||
                (matriz[posicionFila+1][posicionColumna]==nombreT2)||(matriz[posicionFila+1][posicionColumna]==nombreT3)||
                (matriz[posicionFila+1][posicionColumna]=="f")||(matriz[posicionFila+1][posicionColumna]=="g")||
                (matriz[posicionFila+1][posicionColumna]=="h")){
                botonAbajo.setEnabled(true);    
            }
        }
        if ((posicionFila-1 >= 0)&& (posicionFila-1 < matriz.length) &&(matriz[posicionFila-1][posicionColumna]!="X")){
            if ((matriz[posicionFila-1][posicionColumna]==nombreT1)||
                (matriz[posicionFila-1][posicionColumna]==nombreT2)||(matriz[posicionFila-1][posicionColumna]==nombreT3)||
                (matriz[posicionFila-1][posicionColumna]=="f")||(matriz[posicionFila-1][posicionColumna]=="g")||
                (matriz[posicionFila-1][posicionColumna]=="h")){
                botonArriba.setEnabled(true);    
            }
        }
        
        if ((posicionColumna+1 >= 0)&& (posicionColumna+1 < matriz[0].length)&&(matriz[posicionFila][posicionColumna+1]!="X")){
            if ((matriz[posicionFila][posicionColumna+1]==nombreT1)||
                (matriz[posicionFila][posicionColumna+1]==nombreT2)||(matriz[posicionFila][posicionColumna+1]==nombreT3)||
                (matriz[posicionFila][posicionColumna+1]=="f")||(matriz[posicionFila][posicionColumna+1]=="g")||
                (matriz[posicionFila][posicionColumna+1]=="h")){
                botonDerecha.setEnabled(true);    
            }
        }
        if ((posicionColumna-1 >= 0)&& (posicionColumna-1 < matriz[0].length)&&(matriz[posicionFila][posicionColumna-1]!="X")){
            if ((matriz[posicionFila][posicionColumna-1]==nombreT1)||
                (matriz[posicionFila][posicionColumna-1]==nombreT2)||(matriz[posicionFila][posicionColumna-1]==nombreT3)||
                (matriz[posicionFila][posicionColumna-1]=="f")||(matriz[posicionFila][posicionColumna-1]=="g")||
                (matriz[posicionFila][posicionColumna-1]=="h")){
                botonIzquierda.setEnabled(true);    
            }
        }
    }
    
    public static void desactivarBotones(JButton botonAbajo,JButton botonArriba,JButton botonDerecha,JButton botonIzquierda){
        botonAbajo.setEnabled(false);
        botonArriba.setEnabled(false);
        botonDerecha.setEnabled(false);
        botonIzquierda.setEnabled(false);
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void realizarMovimientoBotones(String [][] matriz, String posicion, int opcion,JButton botonAbajo,JButton botonArriba,
            JButton botonIzquierda,JButton botonDerecha,String nombreT1, String nombreT2, String nombreT3){
        
        desactivarBotones(botonAbajo,botonArriba,botonIzquierda,botonDerecha);
        int posicionFila=Funcion.buscarFilaColumnaPosicion(matriz, 0,posicion);
        int posicionColumna=Funcion.buscarFilaColumnaPosicion(matriz, 1,posicion);
        if (opcion==1){//Abajo
            matriz[posicionFila+1][posicionColumna]=posicion;
        }
        if (opcion==2){//Arriba
            matriz[posicionFila-1][posicionColumna]=posicion;
        }
        if (opcion==3){//Derecha
            matriz[posicionFila][posicionColumna+1]=posicion;
        }
        if (opcion==4){//Izquierda
            matriz[posicionFila][posicionColumna-1]=posicion;
        }
        String antiguaPosicion=matrizOriginal[posicionFila][posicionColumna];
        matriz[posicionFila][posicionColumna]=antiguaPosicion;
        
        revisarMovimientosValidosBotones(matriz,posicion,botonAbajo,botonArriba,
                botonIzquierda,botonDerecha,nombreT1,nombreT2,nombreT3);
        
    }
    
    public static void realizarDisparoBotones(String [][] matriz, String posicion, int opcion, JButton botonAbajo,JButton botonArriba,
            JButton botonIzquierda,JButton botonDerecha,String nombreT1, String nombreT2, String nombreT3){
        
        desactivarBotones(botonAbajo,botonArriba,botonIzquierda,botonDerecha);
        int posicionFila=Funcion.buscarFilaColumnaPosicion(matriz, 0,posicion);
        int posicionColumna=Funcion.buscarFilaColumnaPosicion(matriz, 1,posicion);
        if (opcion==1){//Abajo
            String antiguaPosicion=matrizOriginal[posicionFila+1][posicionColumna];
            matriz[posicionFila+1][posicionColumna]=antiguaPosicion;
        }
        if (opcion==2){//Arriba
            String antiguaPosicion=matrizOriginal[posicionFila-1][posicionColumna];
            matriz[posicionFila-1][posicionColumna]=antiguaPosicion;
        }
        if (opcion==3){//Derecha
            String antiguaPosicion=matrizOriginal[posicionFila][posicionColumna+1];
            matriz[posicionFila][posicionColumna+1]=antiguaPosicion;
        }
        if (opcion==4){//Izquierda
            String antiguaPosicion=matrizOriginal[posicionFila][posicionColumna-1];
            matriz[posicionFila][posicionColumna-1]=antiguaPosicion;
        }
        
        revisarDisparosValidosBotones(matriz,posicion,botonAbajo,botonArriba,
                botonIzquierda,botonDerecha,nombreT1,nombreT2,nombreT3);
        
    }
    
    public static int buscarFilaColumnaPosicion(String [][] matriz, int opcion, String posicion){
        int i, j;
        for (i = 0; i < matriz.length; i++) { 
            for (j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j]==posicion) && (opcion==0)){
                    return i;
                }
                if ((matriz[i][j]==posicion) && (opcion==1)){
                    return j;
                }
            }
        }
        return -1;
    }
    
    //////////////////////////////
    public static int buscarFilaColumnaCantidad(String [][] matriz, int opcion){
        int i, j = 0;
        for (i = 0; i < matriz.length; i++) { 
            for (j = 0; j < matriz[i].length; j++) {
            }
        }
        if (opcion==0){
            return i;
                }
        if (opcion==1){
            return j;
        }
        return 0;
    }
        
    ///////////////////////////////
    
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
    
    public static void actualizarLabelMovimientoArmada (String[][] matriz, String[][] matrizSinTanques,String tanque1, String tanque2, String tanque3,
            int cantidadMovimientoTanque1, int cantidadMovimientoTanque2, 
            int cantidadMovimientoTanque3,
            JLabel textoEdificiosDestruidos, 
            JLabel textoEdificiosRestantes, JLabel textoMovimientosArmada, 
            JLabel textoCantidadTanquesRestantes, JLabel textoVida, int opcion, int numeroJuego, JInternalFrame ventanaJuego){
        if (opcion==0){
        
            int resultadoEdificios=contarObjetos(matriz,"f","g","h");
            int resultadoTanques=contarObjetos(matriz,tanque1,tanque2,tanque3);

            if(resultadoEdificios!=parseInt(textoEdificiosRestantes.getText())){
                textoEdificiosRestantes.setText(String.valueOf(resultadoEdificios));

                int cantidadEdificiosDestruidos=parseInt(textoEdificiosDestruidos.getText());
                textoEdificiosDestruidos.setText(String.valueOf(cantidadEdificiosDestruidos+1));
            }
                
            if(resultadoTanques!=parseInt(textoCantidadTanquesRestantes.getText())){
                textoCantidadTanquesRestantes.setText(String.valueOf(resultadoTanques));
                
            if (resultadoTanques==0){
            textoMovimientosArmada.setText(String.valueOf(resultadoTanques));
            }
        }
            if (parseInt(textoEdificiosRestantes.getText())==0){
                if(numeroJuego==1){
                    int cantidadVidasRestantes=parseInt(textoVida.getText())+3;
                    NivelTerminado aviso = new NivelTerminado((Frame) javax.swing.SwingUtilities.getWindowAncestor(ventanaJuego),true);
                    NivelTerminado.nuevoTextoEdificiosDestruidos(textoEdificiosDestruidos.getText());
                    NivelTerminado.nuevoTextoNivel("1");
                    NivelTerminado.nuevoTextoVida(textoVida.getText());
                    aviso.setVisible(true);
                    
                    ventanaJuego.dispose();
                    Juego2 juego2 = new Juego2();
                    juego2.nuevoTextoEdificiosDestruidos(textoEdificiosDestruidos.getText());
                    
                    juego2.nuevoTextoVida(String.valueOf(cantidadVidasRestantes));
                    Inicio.agregarEnEscritorio(juego2);
                }
                if(numeroJuego==2){
                    int cantidadVidasRestantes=parseInt(textoVida.getText())+3;
                    NivelTerminado aviso = new NivelTerminado((Frame) javax.swing.SwingUtilities.getWindowAncestor(ventanaJuego),true);
                    NivelTerminado.nuevoTextoEdificiosDestruidos(textoEdificiosDestruidos.getText());
                    NivelTerminado.nuevoTextoNivel("2");
                    NivelTerminado.nuevoTextoVida(textoVida.getText());
                    aviso.setVisible(true);
                    
                    ventanaJuego.dispose();
                    Juego3 juego3 = new Juego3();
                    juego3.nuevoTextoEdificiosDestruidos(textoEdificiosDestruidos.getText());
                    
                    juego3.nuevoTextoVida(String.valueOf(cantidadVidasRestantes));
                    Inicio.agregarEnEscritorio(juego3);
                }
                if(numeroJuego==3){
                    NivelTerminado aviso = new NivelTerminado((Frame) javax.swing.SwingUtilities.getWindowAncestor(ventanaJuego),true);
                    NivelTerminado.textoTerminar();
                    NivelTerminado.nuevoTextoEdificiosDestruidos(textoEdificiosDestruidos.getText());
                    NivelTerminado.nuevoTextoNivel("3");
                    NivelTerminado.nuevoTextoVida(textoVida.getText());
                    aviso.setVisible(true);
                    
                    ventanaJuego.dispose();
                    Inicio.activarBoton();
                }
            }
        }
        
        if (opcion==1){
            int movimientos=parseInt(textoMovimientosArmada.getText());
            int resultadoTanques=contarObjetos(matriz,tanque1,tanque2,tanque3);
            
            if (resultadoTanques!=0){
            textoMovimientosArmada.setText(String.valueOf(movimientos-1));
            movimientos-=1;
            }
            
            if (resultadoTanques==0){
            textoMovimientosArmada.setText(String.valueOf(0));
            }
            
            if((movimientos==0)&&(resultadoTanques!=0)){
                Conexion.moverArmada(matriz, matrizSinTanques, textoVida,tanque1,tanque2,tanque3,cantidadMovimientoTanque1,cantidadMovimientoTanque2,cantidadMovimientoTanque3);
                textoMovimientosArmada.setText(String.valueOf(3));
            }
            
            if(parseInt(textoVida.getText())==-1){
                textoVida.setText("0");
                NivelTerminado aviso = new NivelTerminado((Frame) javax.swing.SwingUtilities.getWindowAncestor(ventanaJuego),true);
                NivelTerminado.textoTerminar();
                NivelTerminado.nuevoTextoEdificiosDestruidos(textoEdificiosDestruidos.getText());
                NivelTerminado.nuevoTextoNivel(String.valueOf(numeroJuego));
                NivelTerminado.textoVida();
                NivelTerminado.nuevoTextoTerminar("SIN VIDAS");
                aviso.setVisible(true);

                ventanaJuego.dispose();
                Inicio.activarBoton();
            }
        }
    }  
}
