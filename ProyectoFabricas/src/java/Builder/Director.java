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
 */
public class Director {
    private PersonajeBuilder pjBd;
    public void setPersonajeBuilder(PersonajeBuilder pjbuilder){
        pjBd=pjbuilder;
    }
    public PersonajePrototipo getPersonaje(){
        return pjBd.getPersonaje();
    }
    public void ConstruirPersonaje(){
        pjBd.crearNuevoPersonaje();
        pjBd.crearAlto();
        pjBd.crearAncho();
        pjBd.crearArma();
        pjBd.crearBotas();
        pjBd.crearCasco();
        pjBd.crearCordenadas();
        pjBd.crearEscudo();
        pjBd.crearTraje();
    };
    
}
