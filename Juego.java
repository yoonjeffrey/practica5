import java.util.ArrayList;

public class Juego {
    public static void main(String[] args) {
        Mazo mazo = new Mazo();
        mazo.barajar();

        Jugador jugador = new Jugador("Jugador1");
        jugador.recibirCartas(mazo.repartir(5));  // Ejemplo: recibe 5 cartas

        int x = 50; // Posición inicial en X
        for (Carta carta : jugador.getMano()) {
            Posicion posicion = new Posicion(x, 100); // Colocar en fila
            Visualizador.carta(carta, posicion);
            x += 150; // Separación entre cartas
        }
    }
}
