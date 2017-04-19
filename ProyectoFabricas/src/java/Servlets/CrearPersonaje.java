/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Prototype.Prototipos.FabricaPrototipos;
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
//array que guardara todos los productos
    private ArrayList<PersonajePrototipo> pjs;
    private FabricaPrototipos fabrica;
    private PersonajePrototipo principal;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tipo= request.getParameter("comboBox"); 
        int copias= Integer.parseInt(request.getParameter("copias")) ; 
        pjs= new ArrayList() ;
//aplicamos el patron builder en la clase fabrica de prototipos :D
        fabrica= new FabricaPrototipos();
        principal= fabrica.obtenerPj(tipo);
        pjs.add(principal);
//aplicamos el prototype
        for(int i=1;i<copias;i++){
           pjs.add(principal.clone());
           pjs.get(i).setCordenadax(i*200);
        }
        request.getSession().setAttribute("Arreglo", pjs);
      //  request.getSession().setAttribute("Script",  this.envScript());
        response.sendRedirect("Vistapersonaje.jsp");
    }
}
