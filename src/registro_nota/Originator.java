package registro_nota;


import registro_nota.Memento;
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
public class Originator {
    private Asignatura estado;

    public void setEstado(Asignatura estado) {
        this.estado = estado;
    }

    public Asignatura getEstado() {
        return estado;
    }
    
    public Memento guardar(){
        return new Memento(estado);
    }
    
    public void restaurar(Memento m){
        this.estado = m.getEstado();
    }
    
}
