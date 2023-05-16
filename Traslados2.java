
/**
 * Write a description of class Traslados2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Traslados2
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroConductores;
        Traslados [] losConductores = new Traslados[50];
        String identificacion, nombre, codigoSDS;
        double mes1,mes2, mes3;
        double promedio = 0;
        System.out.println("Digite la cantidad de Ambulancias: ");
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
            Traslados unConductor = new Traslados();
            unConductor.identificacion = identificacion;
            unConductor.nombre = nombre;
            unConductor.codigoSSD = codigoSDS;
            unConductor.mesuno = mes1;
            unConductor.mesdos = mes2;
            unConductor.mestres = mes3;
            losConductores[i] = unConductor;
        }
        
        for(int i = 0; i < numeroConductores; i++){
            double sum = (losConductores[i].mesuno + losConductores[i].mesdos + losConductores[i].mestres)/3;
            promedio = promedio + sum ;
        }
        
        double sum_1 = (losConductores[0].mesuno + losConductores[0].mesdos + losConductores[0].mestres)/3;
        System.out.println("El promedio de traslados de la primer ambulancia es: " + promedio);
        System.out.println("El promedio de los traslados de la segunda ambulancia es: " + sum_1);
    }    
}