package Materia;

import java.util.EmptyStackException;

public class StackGeneric<T> {
    
    private NodeGeneric<T> top;
    private int size;

    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    public T push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
        return value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStackG() {
        NodeGeneric<T> aux = top;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

}
