import java.util.ArrayList;

public class Juego {
    public static void main(String[] args) {
        
        Mazo mazo = new Mazo();
        mazo.barajar();

        Jugador jugador1 = new Jugador("Jeffrey");
        Jugador jugador2 = new Jugador("Danna");

        jugador1.recibirCartas(mazo.repartir(6)); 
        jugador2.recibirCartas(mazo.repartir(6)); 

        System.out.println(jugador1);
        System.out.println(jugador2);

        mazo.mostrarMazo();

        
      


        
jugador1.devolverCartasAlMazo(mazo, 5);
System.out.println("Después de devolver 5 carta:");
        System.out.println(jugador1);

mazo.mostrarMazo();
    }
}