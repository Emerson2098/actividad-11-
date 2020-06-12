package registro_nota;


import registro_nota.Asignatura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emerson
 */
public class Memento {
    private Asignatura estado;
    
    public Memento(Asignatura estado){
        this.estado = estado;
    }

    public Asignatura getEstado() {
        return estado;
    }
    
    
}
