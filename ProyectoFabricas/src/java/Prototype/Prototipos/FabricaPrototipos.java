/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.Prototipos;

import Builder.Director;
import Builder.pjBuilderFabrica;

/**
 *
 * @author Estudiantes
 */
public class FabricaPrototipos {

    private Director creador;
        
    public  PersonajePrototipo obtenerPj(String tipo) {
        creador=new Director();
        creador.setPersonajeBuilder(new pjBuilderFabrica().getConstructor(tipo));
        creador.ConstruirPersonaje();
        return creador.getPersonaje();
    }    
}
