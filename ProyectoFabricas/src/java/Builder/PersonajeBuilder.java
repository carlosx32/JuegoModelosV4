/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;


import Prototype.Prototipos.PersonajePrototipo;

/**
 *
 * @author carandy
 *///constructor abstracto
public abstract class PersonajeBuilder {
    protected PersonajePrototipo personaje;

    public void crearNuevoPersonaje(){
            personaje= new PersonajePrototipo();
    }
    
    public PersonajePrototipo getPersonaje() {
        return personaje;
    }
    
    public abstract void crearCordenadas();
    public abstract void crearAncho();
    public abstract void crearAlto();
    public abstract void crearCasco();
    public abstract void crearBotas();
    public abstract void crearEscudo();
    public abstract void crearArma();
    public abstract void crearTraje();
        
}
