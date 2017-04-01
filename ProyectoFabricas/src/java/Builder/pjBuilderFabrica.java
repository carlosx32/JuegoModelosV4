/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author carandy
 */
public class pjBuilderFabrica {
    
    private PersonajeBuilder Pjbd;
    
    public PersonajeBuilder getConstructor(String tipo) {
            switch(tipo){
            case "Guerrero":   
                    Pjbd=new CreadorGuerrero();
                break;
            case "Cazador":
                    Pjbd=new CreadorCazador();
                break;
            case "Sacerdote":
                    Pjbd=new CreadorSacerdote();
                break;
            case "Brujo":
                    Pjbd=new CreadorBrujo();
                   break;
        }
        return  Pjbd;
    }
}
