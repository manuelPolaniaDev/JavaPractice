

import java.util.Scanner;

/**
 *
 * @author Manuel Polania<manuel.dev1402@gmail.com>
 */
public class EjercicioSwitch {
    public static void main(String[] args) {
        /*
        Realizaremos el ejercicio anterior con la estructura Switch
        (Crear un programa que al proporcionar el numero del mes me diga la 
        estación en la que se encuetra (Verano, Invierno, Otoño o primavera)
        */
        //Creación de variables
        Scanner lector = new Scanner(System.in);
        int mes;
        String estacion;
        
        //Obtencion del numero del mes
        System.out.println("Ingrese el numero de mes a consultar ");
        mes = lector.nextInt();
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break; 
            case 6: case 7: case 8:
                estacion = "Verano";
                break;  
            case 9: case 10: case 11:
                estacion = "Otono";
                break;    
            default:
                estacion = "Numero de mes incorrecto";
        }
        System.out.println("estacion = " + estacion);
    }
}
