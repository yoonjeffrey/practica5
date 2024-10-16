public class Visualizador {
    public static void carta(Carta c, Posicion p) {
        Cuadrado cardSquare = new Cuadrado();
        cardSquare.changeSize(100);
        cardSquare.setPosicion(p.getX(), p.getY());
        cardSquare.makeVisible();

        // Dibujar el símbolo del palo
        String palo = c.getPalo().toString();
        switch (palo) {
            case "CORAZONES":
                Corazon corazon = new Corazon(p.getX() + 50, p.getY() + 50);
                corazon.makeVisible();
                break;
            case "DIAMANTES":
                Diamante diamante = new Diamante(p.getX() + 50, p.getY() + 50);
                diamante.makeVisible();
                break;
            case "TREBOLES":
                Trebol trebol = new Trebol(p.getX() + 50, p.getY() + 50);
                trebol.makeVisible();
                break;
            case "PICAS":
                Pica pica = new Pica(p.getX() + 50, p.getY() + 50);
                pica.makeVisible();
                break;
        }

        // Dibujar el valor con pequeños círculos
        int value = getNumericValue(c.getValor());
        int maxPerRow = 3;
        int circleSize = 10;
        int startX = p.getX() + 20;
        int startY = p.getY() + 20;
        int offsetX = 20;
        int offsetY = 20;

        for (int i = 0; i < value; i++) {
            int row = i / maxPerRow;
            int col = i % maxPerRow;
            Circulo circle = new Circulo();
            circle.changeSize(circleSize);
            circle.setPosicion(startX + col * offsetX, startY + row * offsetY);
            circle.makeVisible();
        }
    }

    private static int getNumericValue(String valor) {
        switch (valor) {
            case "A": return 1;
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "10": return 10;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            default: return 0;
        }
    }
}
