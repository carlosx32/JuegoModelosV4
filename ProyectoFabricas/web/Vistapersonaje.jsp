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

  <body onload="
        <%for(int i=0;i<pjs.size();i++){out.print(pjs.get(i).dibujarJs());}  %> 
    ">
      <header>
          <!--   <h1><a href="index.jsp"> World Of CaNi </a></h1> -->
        </header>
      <br>
      <canvas  id="miCanvas" width="800" height="600" >Su navegador no soporta Canvas.</canvas> 
      </body>
</html>
