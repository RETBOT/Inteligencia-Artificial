/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ia;
//  By: RETBOT
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author RETBOT
 */

// Clase Dibujo creada para crear figuras y el tablero 
public class Dibujo {
   
   // Método para dibujar el tablero sobre el componente establecido 
    public static void dibujarTablero(Component componente){
        // Librería Graphics utilizada para crear los dibujos sobre el tablero.
        Graphics hoja = componente.getGraphics();
        
        // Se elimina todo del tablero
        hoja.setColor(componente.getBackground()); // obtenemos el color de fondo
        // y eliminamos todo lo que este desde el inicio, hasta el fin del tamaño del componente
        hoja.fillRect(0, 0, componente.getWidth(), componente.getHeight()); 
        
        // Establecemos el color Negro
        hoja.setColor(Color.BLACK);
        // y dibujamos las casillas del tablero 
        // 50 px * 50 px
        for(int i=50; i<=500; i+=50){
            hoja.drawLine(0, i, componente.getWidth(), i); // líneas horizontales
            hoja.drawLine(i, 0, i, componente.getWidth()); //líneas verticales
        }
        //  By: RETBOT
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(IAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
   
    // metodo para dibujar el robot en el tablero 
    public static void dibujarBOT(int x, int y, Component componente){
        // Librería Graphics utilizada para crear los dibujos sobre el tablero.
        Graphics hoja = componente.getGraphics();
        // Establecemos el color del robot
        hoja.setColor(Color.BLUE); // Cuerpo Relleno 
        hoja.fillRect(x + 15, y + 10, 20, 20); // Cabeza 
        hoja.fillRect(x + 18, y + 30, 14, 12); // Cuerpo 
        hoja.fillOval(x + 19, y + 41, 12, 8); // Rueda 
        hoja.fillRect(x + 7, y + 33, 11, 6); // Brazo <-
        hoja.fillRect(x + 33, y + 33, 11, 6); // Brazo ->
        hoja.fillOval(x + 21, y + 0, 8, 4); // antena
        
        hoja.setColor(Color.WHITE); // Cara Relleno
        hoja.fillOval(x + 17, y + 15, 8, 8); // Ojos <-
        hoja.fillOval(x + 26, y + 15, 8, 8); // Ojos ->
        hoja.fillOval(x + 22, y + 25, 8, 4); // Boca
        
        hoja.setColor(Color.BLACK); // Cara Relleno
        hoja.fillOval(x + 19, y + 17, 5, 5); // Ojos <-
        hoja.fillOval(x + 28, y + 17, 5, 5); // Ojos ->
        
        hoja.setColor(Color.BLACK); // Contorno
        hoja.drawRect(x + 15, y + 10, 20, 20); // Cabeza 
        hoja.drawRect(x + 18, y + 30, 14, 12); // Cuerpo 
        hoja.drawOval(x + 19, y + 41, 12, 8); // Rueda 
        hoja.drawRect(x + 7, y + 33, 11, 6); // Brazo <-
        hoja.drawRect(x + 33, y + 33, 11, 6); // Brazo ->
        hoja.drawOval(x + 17, y + 15, 8, 8); // Ojos <-
        hoja.drawOval(x + 26, y + 15, 8, 8); // Ojos ->
        hoja.drawOval(x + 22, y + 25, 8, 4); // Boca
        hoja.drawLine(x + 25, y + 5, x + 25, y + 10); // antena
        hoja.drawOval(x + 21, y + 0, 8, 4); // antena
        //  By: RETBOT
         try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(IAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    public static void dibujarBOTSinPila(int x, int y, Component componente){
        // Librería Graphics utilizada para crear los dibujos sobre el tablero.
        Graphics hoja = componente.getGraphics();
        // Establecemos el color del robot
        hoja.setColor(Color.BLUE); // Cuerpo Relleno 
        hoja.fillRect(x + 15, y + 10, 20, 20); // Cabeza 
        hoja.fillRect(x + 18, y + 30, 14, 12); // Cuerpo 
        hoja.fillOval(x + 19, y + 41, 12, 8); // Rueda 
        hoja.fillRect(x + 7, y + 33, 11, 6); // Brazo <-
        hoja.fillRect(x + 33, y + 33, 11, 6); // Brazo ->
        hoja.fillOval(x + 21, y + 0, 8, 4); // antena
        
        hoja.setColor(Color.WHITE); // Cara Relleno
        hoja.fillOval(x + 17, y + 15, 8, 8); // Ojos <-
        hoja.fillOval(x + 26, y + 15, 8, 8); // Ojos ->
        hoja.fillOval(x + 22, y + 25, 8, 4); // Boca
        
        hoja.setColor(Color.RED); // Cara Relleno
        hoja.drawLine(x + 18, y + 16, x + 24, y + 22);// Ojos <- XP
        hoja.drawLine(x + 24, y + 16, x + 18, y + 22);
        hoja.drawLine(x + 27, y + 16, x + 33, y + 22);// Ojos ->
        hoja.drawLine(x + 33, y + 16, x + 27, y + 22);
        
        hoja.setColor(Color.BLACK); // Contorno
        hoja.drawRect(x + 15, y + 10, 20, 20); // Cabeza 
        hoja.drawRect(x + 18, y + 30, 14, 12); // Cuerpo 
        hoja.drawOval(x + 19, y + 41, 12, 8); // Rueda 
        hoja.drawRect(x + 7, y + 33, 11, 6); // Brazo <-
        hoja.drawRect(x + 33, y + 33, 11, 6); // Brazo ->
        hoja.drawOval(x + 17, y + 15, 8, 8); // Ojos <-
        hoja.drawOval(x + 26, y + 15, 8, 8); // Ojos ->
        hoja.drawOval(x + 22, y + 25, 8, 4); // Boca
        hoja.drawLine(x + 25, y + 5, x + 25, y + 10); // antena
        hoja.drawOval(x + 21, y + 0, 8, 4); // antena
        
         try {//  By: RETBOT
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            java.util.logging.Logger.getLogger(IAFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    //  Método para dibujar pelota en tablero
    public static void dibujarPelota(int x, int y, Component componente){
        // Librería Graphics utilizada para crear los dibujos sobre el tablero.
        Graphics hoja = componente.getGraphics();
        
        // establecemos el color de la pelota 
        hoja.setColor(Color.blue); 
        // y la dibujamos 
        hoja.fillOval(x + 15, y + 10, 20, 20); 
        
        // establecemos el color del contorno de la pelota 
        hoja.setColor(Color.BLACK); // Contorno
        hoja.drawOval(x + 15, y + 10, 20, 20); // y se dibuja
    }
    
     //  Método para dibujar Pila en tablero
     public static void dibujarPila(int x, int y, Component componente){
        Graphics hoja = componente.getGraphics();

        hoja.setColor(Color.RED); // Seleccionamos el color de relleno
        hoja.fillRect(x + 15, y + 10, 20, 20); // y lo dibujamos 
        
        hoja.setColor(Color.BLACK); // Seleccionamos el color del Contorno
        hoja.drawRect(x + 15, y + 10, 20, 20); // y lo dibujamos  
    }//  By: RETBOT
    
     // dibuja las pelotas en el tablero 
    public static void generarPelotas(int evil[][],int cant,Component componente){        
        for(int i=1;i<cant-1;i++){
            dibujarPelota(evil[i][0], evil[i][1], componente);
        }
    }
   
    
  // Generar numeros aleatorios del 50 al 400(450 limite del panel)
    public static int genRanEnteros(){
        Random azar = new Random(); // Método para generar números aleatorios
        int num = 1; // Inicia en uno, porque si es 0, no se puede dividir
        while(num%50!=0){ // si el numero no es multiplo del 50
           num = azar.nextInt(400)+50; // genera un numero al azar entre el 50 y el 450
        }
        return num; // y lo retorna
    }
    
   // generar numeros distintos 
    public static void aleatorios(int evil[][], int cant) {
        // recordido de la cantidad de los numeros aleatorios 
        for (int i = 0; i < cant; i++) {
            evil[i][0] = genRanEnteros();
            evil[i][1] = genRanEnteros();
        }

        // y después hacemos otro recorrido para validar que las posiciones en el arreglo  
        // para que  no se repitan
        for (int k = 0; k < cant; k++) {
            // Obtenemos X y Y del arreglo
            int auxX = evil[k][0];
            int auxY = evil[k][1];
            //  By: RETBOT
            // recorremos todas las posiciones 
            for (int i = 0; i < cant; i++) {
                // Si k e i son iguales, no hace nada (porque es la misma posición y lo va a modificar)
                if (k != i) {
                    if (evil[i][0] == auxX) { // verifica que X sea diferente a auxX
                        // si son iguales, entra a verificar que la Y sea difetente a auxY
                        if (evil[i][1] == auxY) {
                            // si son iguales, entonces cambia la posición de auxY,
                            //  para que no estén en la misma coordenada 
                            evil[i][1] = genRanEnteros();
                        }
                    }
                    if (evil[i][1] == auxY) { // verifica que Y sea diferente a auxY
                        // si son iguales, entra a verificar que la X sea difetente a auxY
                        if (evil[i][0] == auxX) {
                            // si son iguales, entonces cambia la posición de auxX,
                            //  para que no estén en la misma coordenada
                            evil[i][0] = genRanEnteros();
                        }
                    }
                }
            }
        }
    }
    
     // Método para dibujar todas las piezas del tablero
     public static void dibujarComponentes(Color color, Node<Point> node, int TILE_SIZE ,Component componente){
        // Librería Graphics utilizada para crear los dibujos sobre el tablero.
        Graphics hoja = componente.getGraphics();
        
        hoja.setColor(color);// Seleccionamos el color
        int rx = node.getObj().x; // Obtenemos la posición x 
        int ry = node.getObj().y; // Obtenemos la posición y
        hoja.fillRect(rx, ry, TILE_SIZE, TILE_SIZE); // dibujamos el relleno de la casilla 
        hoja.setColor(Color.BLACK); // Seleccionamos el color
        hoja.drawRect(rx, ry, TILE_SIZE, TILE_SIZE);// dibujamos el contorno de la casilla 
        
        // Y seleccionamos el personaje, según el color establecido 
        if(color.equals(Color.BLUE)){ // si es verde, es la casilla de salida 
            dibujarBOT(rx, ry, componente); // y se dibuja
        }else if(color.equals(Color.RED)){// si es rojo, es la casilla de llegada 
            dibujarPelota(rx, ry, componente);
        }//  By: RETBOT
        else if (color.equals(Color.PINK)) {
            dibujarPila(rx, ry, componente);// y se dibuja
        }
        else if (color.equals(Color.YELLOW)) {
             dibujarPelota(rx, ry, componente);
        }
     }
}
       
    //  By: RETBOT
 

