import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasRepartidas;

    public Mazo() {
        cartas = new ArrayList<>();
        cartasRepartidas = new ArrayList<>();
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        for (Palo palo : Palo.values()) {
            for (String valor : valores) {
                cartas.add(new Carta(valor, palo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public ArrayList<Carta> repartir(int numCartas) {
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numCartas; i++) {
            if (!cartas.isEmpty()) {
                Carta cartaRepartida = cartas.remove(0);
                mano.add(cartaRepartida);
                cartasRepartidas.add(cartaRepartida);
            }
        }
        return mano;
    }

    public void restablecerMazo() {
        cartas.addAll(cartasRepartidas);
        cartasRepartidas.clear();
        barajar();
    }

    // Método para agregar una carta de vuelta al mazo
public void agregarCarta(Carta carta) {
    cartas.add(carta);  // Añade la carta al mazo
}

     public void regresarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void mostrarMazo() {
        System.out.println("Cartas restantes en el mazo: " + cartas.size());
    }
}