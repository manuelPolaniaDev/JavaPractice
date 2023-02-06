
/**
 *
 * @author Manuel Polania<manuel.dev1402@gmail.com>
 */
public class EstructuraIfElse {

    public static void main(String[] args) {
        /*
        La estructura primeramente se pregunta una expresión
        
        -Si le valor booleano es verdadero se ejecutaran las setenias dentro
        del bloque if
        
        -Si el valor booleano es fallso se ejecutaran las sentencias dentro del
        bloque else
        
        finalmente una vez ejecutadas las sentencias, terminará la ejecución 
        del bloque if else
        */
        
        //PRACTICA
        //Inicializamos variables con un valor booleano 
        var ejmCondicion = false;
        var ejmCondicion2 = true; 
        
        //if-else prieramente verifica o se pregunta si la expresión es
        //verdadera
        
        if (ejmCondicion) {
            System.out.println("Es verdadero");
        } 
        //En este caso se ejecutará el bloque else, ya que el valor de la variable es falso
        else{
            System.out.println("Es falso"); 
        }
        
        //En este caso se ejecutará el bloque if, ya que el valor de la variable es verdadero
        if (ejmCondicion2) {
            System.out.println("Es verdadero");
        } else{
            System.out.println("Es falso");
        }
        
        //Ejemplo
        //Convertir un numero a letra, es decir si proporcionamos 1, se imprimirá
        // "Uno"
        
        //Creamos variables
        //Variable que almacena el numero elegido
        var numero = 2;
        var numeroTexto = "Numero Desconocido";
        
        //Para hacer varias validaciones se utiliza if-else if
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if(numero == 2){
            numeroTexto = "Numero dos";
        } else if(numero == 3){
            numeroTexto = "Numero tres";
        } else if (numero == 4){
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        //De esta manera vamos a conseguir que se almacene la respuesta correcta
        //En la variable para despues imprimirla 
        System.out.println(numeroTexto);
        
        
    }
    
}
