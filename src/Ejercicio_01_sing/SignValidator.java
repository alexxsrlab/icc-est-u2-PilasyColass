package Ejercicio_01_sing;

import Materia.StackGeneric;

public class SignValidator {

    public static boolean isValid(String texto) {

        StackGeneric<Character> pila = new StackGeneric<>();

        for (int i = 0; i < texto.length(); i++) {

            char primero = texto.charAt(i);

            if (primero == '(') {
                pila.push(primero);
            } else if (primero == '[') {
                pila.push(primero);
            } else if (primero == '{') {
                pila.push(primero);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }

                char ultimo = pila.pop();

                if (primero == ')' && ultimo != '(') {
                    return false;
                } 
                if (primero == ']' && ultimo != '[') {
                    return false;
                } 
                if (primero == '}' && ultimo != '{') {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
