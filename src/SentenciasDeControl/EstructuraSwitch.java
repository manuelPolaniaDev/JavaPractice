
/**
 *
 * @author Manuel Polania<manuel.dev1402@gmail.com>
 */
public class EstructuraSwitch {

    public static void main(String[] args) {
        /*Primeramente se evalua la expresión, que no tiene que ser necesariamente
        de tipo boolean, pueden ser de tipo numerico o String 
        La estructura Switch es recomendada para la creacón de menus
        
        Realizaremos el ejercicio anterior con la estructura Switch 
        (Convertir un numero a letra, es decir si proporcionamos 1, se imprimirá "Uno")
         */

        var numero = 2;
        String numeroTexto;

        switch (numero) {
            case 1:
                numeroTexto = "Numero Uno";
                break;
            case 2:
                numeroTexto = "Numero Dos";
                break;
            case 3:
                numeroTexto = "Numero Tres";
                break;
            case 4:
                numeroTexto = "Numero Cuatro";
                break;
            default:
                numeroTexto = "Valor no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
