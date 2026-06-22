
package com.mycompany.mavenproject2;

/**
 *
 * @author Snail
 */
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    public static void main(String[] args ){
        
        
        
        Queue<String> cola = new LinkedList<>();
        
        cola.add("Juan");
        cola.add("Ana");
        cola.add("Pedro");
        cola.add("Maria");
        cola.add("Carlitos");
        
        System.out.println("Cola actual de estudiantes por hacer tramite de matricula:  " + cola);
        System.out.println("Primer elemento (peek): " +  cola.peek());
        
        System.out.println("Elemento atendido: " + cola.poll());
        System.out.println("Cola despues de atender: " + cola  );
        
        
    }
    
}
