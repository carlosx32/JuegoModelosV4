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

  <body onload=" <%for(int i=0;i<pjs.size();i++){out.print(pjs.get(i).dibujarJs());}  %> 
        " onkeydown="
                    if(window.event.keyCode==40){
                        console.log('abajo');
                        limpiar();
                        <%for(int i=0;i<pjs.size();i++){
                            pjs.get(i).moverJs(0,50);
                            out.print(pjs.get(i).dibujarJs());
                        }%>
                    }                    
                    else if(window.event.keyCode==37){
                        console.log('izquierda');
                        limpiar();
                        <%for(int i=0;i<pjs.size();i++){
                            pjs.get(i).moverJs(-50,0);
                            out.print(pjs.get(i).dibujarJs());
                        }%>
                    }                    
                    else if(window.event.keyCode==38){
                        console.log('ariba');
                        limpiar();
                        <%for(int i=0;i<pjs.size();i++){
                            pjs.get(i).moverJs(0,-50);
                            out.print(pjs.get(i).dibujarJs());
                        }%>
                    }                    
                    else if(window.event.keyCode==39){
                        console.log('Derecha');
                        limpiar();
                        <%for(int i=0;i<pjs.size();i++){
                            pjs.get(i).moverJs(0,-50);
                            out.print(pjs.get(i).dibujarJs());
                        }%>
                    }
                    
            "
            onmousemove="//console.log(window.event.clientX +' , '+ window.event.clientY);"
            
      <header>
          <!--   <h1><a href="index.jsp"> World Of CaNi </a></h1> -->
      </header>
      <br>
      <canvas  id="miCanvas" width="900" height="900" >Su navegador no soporta Canvas.</canvas> 
      </body>
</html>
