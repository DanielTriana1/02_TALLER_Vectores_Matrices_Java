import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {        
        Scanner captura=new Scanner(System.in);

        
         int[][] Codigo=new int[4][4];  
         int[][] Precio=new int[4][4];                    
         String[][] NombProd=new String[4][4];
      for(int fila=0;fila<Codigo.length;fila++)
        {
            for(int columna=0;columna<Codigo.length;columna++)
            {
            System.out.println("Digite el codigo del producto");
            Codigo[fila][columna]=captura.nextInt(); 
            System.out.println("Digite el nombre del producto");
            NombProd[fila][columna]=captura.next();  
            System.out.println("Digite el precio del producto");
            Precio[fila][columna]=captura.nextInt();         

            }
        }
        for (int filas = 0; filas < Codigo.length; filas++) {
          for (int columnas = 0; columnas < Codigo.length ; columnas++) {
              System.out.print(Codigo[filas][columnas] + "\t");
          }
        System.out.println("");
          for (int columnas = 0; columnas < NombProd.length; columnas++) {
              System.out.print(NombProd[filas][columnas] + "\t");
          }
          System.out.println("");
          for (int columnas = 0; columnas < Precio.length; columnas++) {
            System.out.print(Precio[filas][columnas] + "\t");
          }
          System.out.println(" ");
        }
    captura.close();

    }
    
}
