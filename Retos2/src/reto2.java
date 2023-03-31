import java.util.Scanner;
public class reto2 {
    public static void main(String[] args){
        Scanner captura = new Scanner (System.in);
        int resp,n=1;        
        Double [] tiempo= new Double [10];
        String [] nomb= new String [10];
        System.out.println("¿Cuantas competidores va a ingresar?");
        resp=captura.nextInt();
    
        for(int i=1; i<=resp; i++){
            System.out.println("nombre del competidor");
            nomb[n]=captura.next();
            System.out.println("tiempo del competidor");
            tiempo[i]=captura.nextDouble();
            n++;
        }
        Double menor = tiempo[1];
        for (int c=1; c<=resp; c++){
            System.out.println("Competidor: "+nomb[0+c]+", Tiempo: "+ tiempo[0+c]);
        }
        
        for (int j=1; j<=resp;j++){
            if (tiempo[j]<menor){
                menor = tiempo[j];  
            }
        }
        System.out.println("Mejor tiempo "+menor);
captura.close();
    }
}
