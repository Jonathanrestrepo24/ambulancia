
/**
 * Write a description of class Ambulancias here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Ambulancias
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[50];
        String[] codigo = new String[50];
        double[] mesuno = new double[50];
        double[] mesdos = new double[50];
        double[] mestres = new double[50];
        
        int numeroConductores;
        String identificacion, nombre, codigoSDS;
        double mes1, mes2, mes3;
        double promedio = 0;
        System.out.println("Digite la cantidad de ambulancias: ");
        numeroConductores = sc.nextInt();
        for(int i = 0; i < numeroConductores; i++){
            System.out.println("Digite la identificacion del Conductor: ");
            identificacion = sc.next();
            System.out.println("Digite el nombre del Conductor: ");
            nombre = sc.next();
            System.out.println("Digite el codigo SDS de la ambulancia: ");
            codigoSDS = sc.next();
            System.out.println("Digite los traslados del mes 1: ");
            mes1 = sc.nextDouble();
            System.out.println("Digite los traslados del mes 2: ");
            mes2 = sc.nextDouble();
            System.out.println("Digite los traslados del mes 3: ");
            mes3 = sc.nextDouble();
            identificaciones[i] = identificacion;
            nombres[i] = nombre;
            codigo[i] = codigoSDS;
            mesuno[i] = mes1;
            mesdos[i] = mes2;
            mestres[i] = mes3;
        }
        for(int i = 0; i < numeroConductores; i++){
            promedio = promedio + ((mesuno[i] + mesdos[i] + mestres[i]) / 3) / numeroConductores;
        }
        
        double sum_1 = promedio + ((mesuno[0] + mesdos[0] + mestres[0]) / 3) / numeroConductores;
         System.out.println("El promedio de traslados de la primer ambulancia es: " + promedio);
         System.out.println("El promedio de los traslados de la segunda ambulancia es: " + sum_1);
    }
}