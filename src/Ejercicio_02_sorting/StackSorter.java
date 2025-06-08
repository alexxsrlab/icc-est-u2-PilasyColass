package Ejercicio_02_sorting;

import Materia.StackGeneric;

public class StackSorter {
    
    public static void sortStack (StackGeneric<Integer> pila) {
        
        StackGeneric<Integer> pilaOrdenada = new StackGeneric<>();

        while (!pila.isEmpty()) {
            int actual = pila.pop();

            while (!pilaOrdenada.isEmpty() && pilaOrdenada.peek() > actual) {
                pila.push(pilaOrdenada.pop());
            }

            pilaOrdenada.push(actual);
        }

        while (!pilaOrdenada.isEmpty()) {
            pila.push(pilaOrdenada.pop());
        }
    }
}
