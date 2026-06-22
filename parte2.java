package com.mycompany.mavenproject2;

/**
 *
 * @author Snail
 */
import java.util.Stack;
public class Libros {
    public static void main(String[]args){
        
        
        Stack<String> pila= new Stack<>();
        
        System.out.println("lista vacia " + pila.isEmpty());
        pila.push("libro 1");
        pila.push("libro 2");
        pila.push("libro 3");
        
        System.out.println("Elemento en la cima  " + pila.peek());
        
        System.out.println("Elemeno eliminado: " + pila.pop());
        System.out.println("Elemeno eliminado: " + pila.pop());
        
        System.out.println("Pila actua=   "  + pila) ;
    }
}
