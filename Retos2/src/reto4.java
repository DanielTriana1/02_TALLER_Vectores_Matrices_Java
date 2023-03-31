import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        Scanner captura=new Scanner(System.in);
        int filas,columnas;
        System.out.println("Por favor digite la cantidad de filas para el concentrece");
        filas= captura.nextInt(); 
        System.out.println("Por favor digite la cantidad de columnas para el concentrece");
        columnas= captura.nextInt();       
         int[][] Caritas=new int[filas][columnas];                 
      for(int fila=0;fila<filas;fila++)
        {
            for(int columna=0;columna<columnas;columna++)
            {
            System.out.println("Ingrese el primer valor para el concentrese");
            Caritas[fila][columna]=captura.nextInt();
            
            }
        }
        for (int fila=0; fila<filas ; fila++) {
            for (int columna=0 ; columna<columnas ; columna++) {

                System.out.print(Caritas[fila][columna]+"\t");

            }
        }
    captura.close();

    }
    
}