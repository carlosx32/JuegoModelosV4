<%-- 
    Document   : VistaPersonaje
    Created on : 25/02/2017, 04:12:12 PM
    Author     : carandy
--%>
<%@page import="Prototype.Prototipos.PersonajePrototipo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%ArrayList<PersonajePrototipo> pjs= new ArrayList();
        pjs=(ArrayList) session.getAttribute("Arreglo");%>
<!DOCTYPE html>
<html>
<head>
    
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="mainStyle.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>NiCa</title>
    <script type="text/javascript" src="javaS/Pintar.js"></script>
  </head>

  <body onload="limpiarCnv();
        <%for(int i=0;i<pjs.size();i++){
            out.print("dibujarPersonaje(" );
       //     out.print(""+" '"+pjs.get(i)getImagenSrcArma()+"'," );
            out.print(""+" '"+pjs.get(i).getPjsEscudos().getImagenSrc()+"'," );
            out.print(""+" '"+pjs.get(i).getPjsBotas().getImagenSrc()+"'," ); 
            out.print(""+" '"+pjs.get(i).getPjsTrajes().getImagenSrc()+"'," );
            out.print(""+" '"+pjs.get(i).getPjsCascos().getImagenSrc()+"'," );   
            out.print(pjs.get(i).getCordenadax()+"," );
            out.print(pjs.get(i).getCordenaday()+"," );
            out.print(pjs.get(i).getAncho()+"," );
            out.print(pjs.get(i).getAlto());
            out.print(");");
        }
        %>  
    ">
      <header>
          <h1><a href="index.jsp"> World Of CaNi </a></h1>
        </header>
      <br>
      <canvas  id="miCanvas" width="900" height="900">Su navegador no soporta Canvas.</canvas>      
  </body>
</html>
