
import Ejercicio_01_sing.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.StackGeneric;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(" EJERCICIO 1 ");
        System.out.println();
        String ejemplo1 = "([]){}";
        String ejemplo2 = "({)}";

        System.out.println("Ejemplo 1 = " + ejemplo1);
        System.out.println("El ejemplo 1 es valido:  " + SignValidator.isValid(ejemplo1));
        System.out.println();
        System.out.println("Ejemplo 2 = " + ejemplo2);
        System.out.println("El ejemplo 2 es valido:  " + SignValidator.isValid(ejemplo2));
        System.out.println();

        System.out.println(" EJERCICIO 2 ");
        System.out.println();

        StackGeneric<Integer> pilaDeNumeros = new StackGeneric<>();
        pilaDeNumeros.push(50);
        pilaDeNumeros.push(10);
        pilaDeNumeros.push(40);
        pilaDeNumeros.push(20);

        System.out.print("Pila antes de ordenar: ");
        pilaDeNumeros.printStackG();

        StackSorter.sortStack(pilaDeNumeros);

        System.out.print("Pila despues de ordenar: ");
        pilaDeNumeros.printStackG();

    }
}
