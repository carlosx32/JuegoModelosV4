/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;


import Builder.Director;
import Builder.pjBuilderFabrica;
import Prototype.Prototipos.PersonajePrototipo;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author carandy
 */
public class CrearPersonaje extends HttpServlet {
    
    private Director creador;
    //array que guardara todos los productos
    private ArrayList<PersonajePrototipo> pjs= new ArrayList();
    private PersonajePrototipo principal;
       
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tipo= request.getParameter("comboBox"); 
        int copias= Integer.parseInt(request.getParameter("copias")) ; 

//aplicamos el patron builder        
        creador=new Director();
        creador.setPersonajeBuilder(new pjBuilderFabrica().getConstructor(tipo));
        creador.ConstruirPersonaje();
        principal= creador.getPersonaje();
        
        pjs.add(principal);
        
//aplicamos el prototype
        for(int i=1;i<=copias;i++){
           pjs.add(principal.clone());
           pjs.get(i).setCordenadax(i*200);
        }
        
        request.getSession().setAttribute("Arreglo", pjs);
      //  request.getSession().setAttribute("Script",  this.envScript());
        response.sendRedirect("Vistapersonaje.jsp");
    }
    /*
    public String envScript(){
        String script="";
        
        String inicializacion=  "        var arma = [];\n" +
                                "        var escudo     = [];\n" +
                                "        var botas      = [];\n" +
                                "        var traje      = [];\n" +
                                "        var casco      = [];\n" +
                                "        var x=[],y=[];\n"+
                                "        var ancho=50; var alto=50\n";
             
       script= script+(inicializacion);
        
      
        script= script+("function dibujarCanvas(){\n");
        
        
        script=script+( "var canvas = document.getElementById('miCanvas');"+
                        " var ctx = canvas.getContext('2d');\n");
        
        
        for(int i = 0;i<pjs.size();i++){
            
        inicializacion=         "        arma["+i+"] =   new Image();\n" +
                                "        escudo["+i+"]   =   new Image();\n" +
                                "        botas["+i+"]   =   new Image();\n" +
                                "        traje["+i+"]    =   new Image();\n" +
                                "        casco["+i+"]   =   new Image();\n";
        script= script+(inicializacion);
            
            
            
            
            script=script+"x["+i+"]="+pjs.get(i).getCordenadax() +";";
            script=script+"y["+i+"]="+pjs.get(i).getCordenaday()+";";
            
            script=script+"arma["+i+"].src='"+ pjs.get(i).getPjsArmas().getImagenSrc()+"';\n";
            
            script=script+"escudo["+i+"].src='"+ pjs.get(i).getPjsEscudos().getImagenSrc()+"';\n";
            script=script+"botas["+i+"].src='"+ pjs.get(i).getPjsBotas().getImagenSrc()+"';\n";
            script=script+"traje["+i+"].src='"+ pjs.get(i).getPjsTrajes().getImagenSrc()+"';\n";
            script=script+"casco["+i+"].src='"+ pjs.get(i).getPjsCascos().getImagenSrc()+"';\n";        
            
            script=script+                    
            "            traje["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(traje["+i+"],x["+i+"],y["+i+"],ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
                    
            "            casco["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(casco["+i+"],x["+i+"],y["+i+"]-alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
            "            arma["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(arma["+i+"],x["+i+"]-ancho,y["+i+"],ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
            "            escudo["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(escudo["+i+"],x["+i+"]+ancho,y["+i+"],ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };\n" +
            "            botas["+i+"].onload = function(){\n" +
            "                    ctx.drawImage(botas["+i+"],x["+i+"],y["+i+"]+alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
            "            };";       
        }
        script= script+"ctx.strokeRect(0,0,900, 900); }";
        return  script;
    }
    */
}
