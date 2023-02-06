
/**
 *
 * @author Manuel Polania<manuel.dev1402@gmail.com>
 */
import java.util.Scanner;

public class EjercicioIfElse {
    public static void main(String[] args) {
        //Crear un programa que al proporcionar el numero del mes me diga la 
        //estación en la que se encuetra (Verano, Invierno, Otoño o primavera
        
        //Creación de variables
        Scanner lector = new Scanner(System.in);
        int mes;
        String estacion = "Estación desconocida";
        //Pidiendo el dato del mes
        System.out.println("Ingrese el numero de mes a consultar: ");
        mes = lector.nextInt();
        //El dato ingresado será evaluado en la estructura if-else if
        if (mes == 1 || mes == 2 || mes == 12 ) {
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otono";
        } 
        System.out.println("estacion = " + estacion);
    }
}
