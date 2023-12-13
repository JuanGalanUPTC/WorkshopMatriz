package test;

import java.util.Random;

/**
 * Clase que gestiona una matriz de valores numéricos
 */
public class HandlingMatriz {
    //Arreglo bidimensional
    private int[][] matriz;

    public HandlingMatriz(int rows, int cols ) {
        matriz = new int[ rows][cols];
        loadValues();
    }

    public HandlingMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    /**
     * Método que genera los valores para la matriz
     */
    public void loadValues(){
        for( int i = 0 ; i < matriz.length ; i++ ){
            for( int j = 0 ; j < matriz[i].length ; j++ ){
                matriz[i][j] = new Random().nextInt(99) + 1;
            }
        }
    }

    /**
     * Método que retorna un String con los elementos de la matriz en forma matricial
     * @return String
     */
    public String showMatriz(){
        StringBuilder sb = new StringBuilder();

        for( int i = 0 ; i < matriz.length ; i++ ){
            for( int j = 0 ; j < matriz[i].length ; j++ ){
                sb.append( matriz[i][j] + "\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    /**
     * Método que valida si la matriz es mágica
     * @return true si es mágica, false si no es mágica
     * @throws Exception Lanza la excepción cuando no se puede validar (rows != cols)
     * Responsable ACERO MORALES SERGIO SANTIAGO
     */
    public boolean isMagic()throws Exception{

        if( matriz.length == matriz[0].length ){
            //TODO Validar matriz

            return false;

        }else{
            throw new Exception("No se puede Validar");
        }
    }

    /**
     * Método que calcula la suma de una fila
     * @param row El número de fila a sumar
     * @return la suma de los elementos de la fila
     * @throws Exception cuando el número de fila no es válido
     * Responsable: CARO SANCHEZ CESAR RICARDO
     */

    public int sumRow ( int row ) throws Exception{
        //TODO implementar el método

        return 0;
    }

    /**
     * Método que calcula la suma de una COLUMNA
     * @param col El número de columna a sumar
     * @return la suma de los elementos de la columna
     * @throws Exception cuando el número de columna no es válido
     * Responsable: CUJABAN CORREDOR HERMAN ALEJANDRO
     */
        public int sumCol ( int col ) throws Exception{
        //TODO implementar el método

        return 0;
    }

    /**
     * Método que retorna los elementos de la diagonal principal
     * @return arreglo de enteros con los elementos de la diagonal principal
     * Responsable: FIGUEREDO MOLANO MARIA CAMILA
     */
    public int[ ] getMainDiag(){

        return null;
    }

    /**
     * Método que retorna los elementos de la diagonal secundaria
     * @return arreglo de enteros con los elementos de la diagonal secundaria
     * Responsable: GALÁN ECHEVERRI JUAN ESTEBAN
     */
    public int[ ] getSecDiag(int[][] matriz){
        int[] diagonal = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
           diagonal[i] = matriz[i][matriz.length - i - 1];
        }
       return diagonal;
    }

    /**
     * Método que calcula la multiplicación de dos matrices
     * @param mat segunda matriz
     * @return matriz con los elementos de la multiplicación, o null si no se puede
     * Responsable: GONZALEZ MERCHAN JAHYR
     */
    public int[][] multMatriz( int[][] mat ){

        return null;
    }

    /**
     * Método que calcula la transpuesta de la matriz
     * @return matriz con los elementos de la trasnpuesta
     * Responsable: HERNANDEZ BOTÍA GERMÁN CAMILO
     */
    public int[][] getTranspuesta(){

        return null;
    }

    /**
     * Método que calcula la suma de dos matrices
     * @param mat la segunda matriz
     * @return una matriz con los elementos de la suma
     * Responsable: LADINO FERNANDEZ LINA XIOMARA
     */
    public int[][] sumMatriz(int[][] mat){

        return null;
    }

    /**
     * Método que calcula la inversa de la matriz
     * @return matriz con los elementos de la inversa
     * Responsable: MESA ACEVEDO JULIÁN FELIPE
     */
    public int[][] invertMatriz(){

        return null;
    }

    public void generateMagic(){
        if( matriz.length == matriz[0].length ){
            if( matriz.length % 2 == 0 ){
                magicPair();
            }

            magicOdd();
        }
    }

    /**
     * Método que genera una matriz mágica de orden impar
     * @return elementos de la matriz mágica
     * Responsable: MONGUI TORRES ANDRES FELIPE
     */
    private int[][] magicOdd() {

        return null;
    }

    /**
     * Método que genera una matriz mágica de orden par
     * @return elementos de la matriz mágica
     * Responsable: NAUSA ACOSTA LUIS ALEJANDRO
     */
    private int[][] magicPair() {

        return null;
    }

    /**
     * Método que retorna los elementos que se encuentran por debajo de la diagonal principal
     * @return Un vector con los elementos
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: PATINO ZAMBRANO BRAYAN ESNEIDER
     */
    public int[] getElementsBelow() throws Exception{

        return null;
    }

    /**
     * Método que retorna los elementos que se encuentran sobre la diagonal principal
     * @return vector con los elementos
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: PÉREZ CASTAÑEDA ANDRÉS DAVID
     */
    public int[] getElementsOver( ) throws Exception{

        return null;
    }


    /**
     * Método que vertifica si una matriz es triangular superior.
     * @return verdadero si es triangular o falso si no es
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: RICAURTE GARCÍA EIMY XIOMARA
     * Una matriz es triangular cuando todas las entradas bajo la diagonal principal son iguales a cero
     */
    public boolean isTriangular()throws Exception{

        return false;
    }

    /**
     * Método que verifica si una matriz es diagonal
     * @return true si la matriz es diagonal, o false si no es
     * @throws Exception Se lanza cuando no es una matriz cuadrada (n x n)
     * Responsable: SÁNCHEZ JAIME CAMILO ANDRÉS
     * Una matriz cuadrada es diagonal si todos los elementos no diagonales son ceros
     */
    public boolean isDiagonal()throws Exception{

        return false;

    }


}