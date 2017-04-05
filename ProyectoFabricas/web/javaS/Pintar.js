function dibujarPersonaje(srcArma, srcEscudo, srcBotas, srcTraje, srcCasco, posx, posy, anchoP, altoP){
    var arma    =   new Image();
    var escudo  =   new Image();
    var botas   =   new Image();
    var traje   =   new Image();
    var casco  =   new Image();
    var x,y;
    var alto=altoP;
    var ancho=anchoP; 
    var canvas = document.getElementById('miCanvas');
    var ctx = canvas.getContext('2d');
        x=posx;
        y=posy;
        arma.src    =   srcArma;
        escudo.src  =   srcEscudo;
        botas.src   =   srcBotas;
        traje.src   =   srcTraje;;
        casco.src   =   srcCasco;        
        traje.onload = function(){
        ctx.drawImage(traje,x,y,ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };
        casco.onload = function(){
        ctx.drawImage(casco,x,y-alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };
        arma.onload = function(){
        ctx.drawImage(arma,x-ancho,y,ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };
        escudo.onload = function(){
        ctx.drawImage(escudo,x+ancho,y,ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };
        botas.onload = function(){
        ctx.drawImage(botas,x,y+alto,ancho,alto);  // imagen completa en la posición (0,0) \n" +
        };     
    //  ctx.strokeRect(0,0,900, 900); 
};