package ejemplo9;

public class SopaLetras {
    //Atributos
    private char[][] sopa;
    private int filas, columnas;
    //Constructor
    public SopaLetras(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }
    //Getters y Setters
    public char[][] getSopa() {
        return sopa;
    }
    public int getFilas() {
        return filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public void setSopa(char[][] sopa) {
        this.sopa = sopa;
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    //Métodos Custom
    public void imprimirSopa() {  //Imprimir la sopa de letras
        for (int i = 0; i < filas; i++) { //Recorre las filas de la sopa
            for (int j = 0; j < columnas; j++) {  //Recorre las columnas de la sopa
                System.out.print(sopa[i][j] + " ");  //Imprime los caracteres de la sopa.
            }
            System.out.println(); //Salto de linea
        }
    }
    public void encontrarPalabra(String palabra) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) { // Recorre las letras de la columna.
                char letra = palabra.charAt(j);  // Indica la posicion de la letra de la palabra.
                if (j == letra) {
                    System.out.print(sopa[i][j]);
                } else {
                    System.out.println("No encontrado");
                }
            }
        }
    }
}