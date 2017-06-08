function dibujarPersonaje(srcArma, srcEscudo, srcBotas, srcTraje, srcCasco, posx, posy, ancho, alto){
    var canvas = document.getElementById('miCanvas');
    var ctx = canvas.getContext('2d');
    var arma    =   new Image();
    var escudo  =   new Image();
    var botas   =   new Image();
    var traje   =   new Image();
    var casco  =   new Image();
    var x=posx,y=posy;
    arma.src    =   srcArma;
    escudo.src  =   srcEscudo;
    botas.src   =   srcBotas;
    traje.src   =   srcTraje;
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
};
function limpiar(){
    var canvas = document.getElementById('miCanvas');
    var ctx = canvas.getContext('2d');
    ctx.fillStyle='#f0f0f0';
    ctx.fillRect(0,0,900,900);      
};

function mover(){
                    if(window.event.keyCode==40){
                        console.log('abajo');  
                    }                    
                    if(window.event.keyCode==37){
                        console.log('izquierda');
                    }                    
                    if(window.event.keyCode==38){
                        console.log('ariba');
                    }                    
                    if(window.event.keyCode==39){
                        console.log('Derecha');
                    }
};
   