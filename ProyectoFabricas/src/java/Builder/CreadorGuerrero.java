/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Fabrica.Guerrero.Guerrero;
import Fabrica.FabricaPjAbs;
import Prototype.Prototipos.PersonajePrototipo;

/**
 *
 * @author carandy
 */
public class CreadorGuerrero extends PersonajeBuilder {
    private final FabricaPjAbs  fabricaPj =Guerrero.getSingleton();
    
    @Override
    public void crearCordenadas() {
        this.personaje.setCordenadax(50);
        this.personaje.setCordenaday(50);  
        
    }
    @Override
    public void crearAncho() {
        personaje.setAncho(50);
    }

    @Override
    public void crearAlto() {
        personaje.setAlto(50);
    }

    @Override
    public void crearCasco() {
        personaje.setPjsCascos(fabricaPj.crearCasco());
    }

    @Override
    public void crearBotas() {
        personaje.setPjsBotas(fabricaPj.crearBotas());
    }

    @Override
    public void crearEscudo() {
        personaje.setPjsEscudos(fabricaPj.crearEscudo());
    }

    @Override
    public void crearArma() {
        personaje.setPjsArmas(fabricaPj.crearArma());
    }

    @Override
    public void crearTraje() {
        personaje.setPjsTrajes(fabricaPj.crearTraje());
    }
}