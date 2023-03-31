import java.util.Scanner;
public class reto1 {
    public static void main(String[] args){
        Scanner captura = new Scanner (System.in);
        int resp,promd=0;        
        System.out.println("¿Cuantas notas va a ingresar?");
        resp=captura.nextInt();
        int [] notas= new int [resp];

        for(int i=1; i<=resp; i++){
            System.out.println("ingrese la nota");
            notas[i]=captura.nextInt();
            promd+= notas[i];
        }
        promd=promd/resp;
        if (promd<30){
            System.out.println("Tu promedio fue: "+promd);
            System.out.println("Reprobaste la materia");
        }
        else if (promd>=40){
                System.out.println("Tu promedio fue: "+promd);
                System.out.println("Aprobaste con buenos resultados");
            }
            else{
                System.out.println("Tu promedio fue: "+promd);
                System.out.println("Aprobaste raspando");
            }captura.close();
        }

;

    } 


