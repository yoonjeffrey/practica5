import java.util.ArrayList;

public class Jugador {
    public String nombre;
    ArrayList<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new ArrayList<>();
    }

    public void recibirCartas(ArrayList<Carta> cartas) {
        mano.addAll(cartas);
    }

    

    
public void devolverCartasAlMazo(Mazo mazo, int numCartas) {
    for (int i = 0; i < numCartas && !mano.isEmpty(); i++) {
        Carta carta = mano.remove(0);  
        mazo.agregarCarta(carta);      
    }
}

    public ArrayList<Carta> getMano(){
return mano;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + "\nCartas: " + mano;
    }
}
