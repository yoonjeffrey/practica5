enum Palo {
    CORAZONES, DIAMANTES, TREBOLES, PICAS
}
public class Carta {
    private String valor;
    private Palo palo;

    public Carta(String valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }

    public String getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }
}