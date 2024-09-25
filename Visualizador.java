public class Visualizador {

    public static void carta(Carta c, Posicion p) {
       
        Square sqr = new Square();    
        sqr.changeSize(120);
        sqr.changeColor("black");  
        sqr.moveHorizontal(p.x - sqr.getXPosition() - 60);  
        sqr.moveVertical(p.y - sqr.getYPosition() - 60);   
        sqr.makeVisible();        

        int numCirculos = obtenerNumeroDeCirculos(c.getValor());

        
        int spacing = 3;               
        int circleSize = 6;            
        int totalCirclesWidth = numCirculos * (circleSize + spacing) - spacing;
        int startX = p.x - 60 + (120 - totalCirclesWidth) / 2; 
        int y = p.y - (sqr.getSize() /2) + 20;        

        for (int i = 0; i < numCirculos; i++) {
            Circle cir = new Circle();
            cir.changeSize(circleSize); 
            cir.moveHorizontal(startX + i * (circleSize + spacing) - cir.getXPosition()); 
            cir.moveVertical(y - cir.getYPosition());       
            cir.changeColor("white");   
            cir.makeVisible();   
        } 
    }

    public static int obtenerNumeroDeCirculos(String valor) {
        switch (valor) {
            case "A":
                return 1; 
            case "2":
                return 2; 
            case "3":
                return 3; 
            case "4":
                return 4; 
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7; 
            case "8":
                return 8; 
            case "9":
                return 9; 
            case "10":
                return 10; 
            case "J":
            case "Q":
            case "K":
                return 3; //se imprime 3 circulos para Q,K Y K
            default:
                return 1; 
        }
    }
}