/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.Prototipos;

import Fabrica.ArmaAbs;
import Fabrica.BotasAbs;
import Fabrica.CascoAbs;
import Fabrica.EscudoAbs;
import Fabrica.TrajeAbs;

/**
 *
 * @author carandy
 */
public  class PersonajePrototipo implements Cloneable {
    private ArmaAbs pjsArmas;
    private BotasAbs pjsBotas;
    private CascoAbs pjsCascos;
    private EscudoAbs pjsEscudos;
    private TrajeAbs pjsTrajes;
    private Integer Cordenadax;
    private Integer Cordenaday;
    private Integer Ancho;
    private Integer Alto;

    public void setPjsArmas(ArmaAbs pjsArmas) {
        this.pjsArmas = pjsArmas;
    }

    public void setPjsBotas(BotasAbs pjsBotas) {
        this.pjsBotas = pjsBotas;
    }

    public void setPjsCascos(CascoAbs pjsCascos) {
        this.pjsCascos = pjsCascos;
    }

    public void setPjsEscudos(EscudoAbs pjsEscudos) {
        this.pjsEscudos = pjsEscudos;
    }

    public void setPjsTrajes(TrajeAbs pjsTrajes) {
        this.pjsTrajes = pjsTrajes;
    }

    public void setCordenadax(Integer Cordenadax) {
        this.Cordenadax = Cordenadax;
    }

    public void setCordenaday(Integer Cordenaday) {
        this.Cordenaday = Cordenaday;
    }

    public void setAncho(Integer Ancho) {
        this.Ancho = Ancho;
    }

    public void setAlto(Integer Alto) {
        this.Alto = Alto;
    }

    public ArmaAbs getPjsArmas() {
        return pjsArmas;
    }

    public BotasAbs getPjsBotas() {
        return pjsBotas;
    }

    public CascoAbs getPjsCascos() {
        return pjsCascos;
    }

    public EscudoAbs getPjsEscudos() {
        return pjsEscudos;
    }

    public TrajeAbs getPjsTrajes() {
        return pjsTrajes;
    }

    public Integer getCordenadax() {
        return Cordenadax;
    }

    public Integer getCordenaday() {
        return Cordenaday;
    }

    public Integer getAncho() {
        return Ancho;
    }

    public Integer getAlto() {
        return Alto;
    }
    
        
    @Override
    public PersonajePrototipo clone(){
            PersonajePrototipo clonedpj = null;
        try {
            clonedpj = (PersonajePrototipo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonedpj;
    };
}
