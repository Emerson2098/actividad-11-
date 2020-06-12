/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registronota;

import registro_nota.Asignatura;
import registro_nota.Caretaker;
import registro_nota.Originator;

/**
 *
 * @author Emerson
 */
public class RegistroNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreAsignatura = "";
        
        Asignatura asignatura = new Asignatura();
        asignatura.setNombre("Matemáticas");
        asignatura.setCodigo(1);
        asignatura.setSeccion("a");
        
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        
        asignatura = new Asignatura();
        asignatura.setNombre("Lenguaje");
        asignatura.setCodigo(2);
        asignatura.setSeccion("b");
        originator.setEstado(asignatura);
        
        asignatura = new Asignatura();
        asignatura.setNombre("Historia");
        asignatura.setCodigo(3);
        asignatura.setSeccion("c");
        originator.setEstado(asignatura);
        
        caretaker.addMemento(originator.guardar());
        
        asignatura = new Asignatura();
        asignatura.setNombre("Religión");
        asignatura.setCodigo(4);
        asignatura.setSeccion("d");
        
        originator.setEstado(asignatura);
        originator.restaurar(caretaker.getMemento(1));
        
        asignatura = originator.getEstado();
        System.out.println(asignatura);

    }
    
}
