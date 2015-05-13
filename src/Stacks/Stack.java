/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author Erick Igor
 */
public class Stack implements InterfaceStackLinked{
    
    private int top = -1;
    private int capacity;
    private No stack[];

    @Override
    public void stackCreate(int lenght) {
        stack = new No[lenght];
        capacity = lenght;
        System.out.println("The list was created with a lenght of... "+capacity );
    }

    @Override
    public boolean empty() {
        return top < 0;
    }

    @Override
    public boolean full() {
        return top + 1 >= capacity;
    }

    @Override
    public int lenght() {
        return top + 1;
    }

    @Override
    public No push(int value) {
        if (!empty()) {
        No aux = new No(value);
        stack[++top] = aux;
        System.out.println("Element inserted: "+aux);
        return aux;
        }
        return null;
    }

    @Override
    public No pop() {
        No aux = stack[top];
        stack[top] = null;
        top--;
        System.out.println("Element removed: "+aux);
        return aux;
    }

    @Override
    public int getTop() {
        return stack[top].getValue();
    }

    @Override
    public void list() {
        for (int i=top; i==0; i-- ) {
            System.out.println(stack[i].getValue());
            
        
        }
    }
    
}
