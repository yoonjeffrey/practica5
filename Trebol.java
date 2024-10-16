public class Trebol {
    private Circulo leftCircle;
    private Circulo topCircle;
    private Circulo rightCircle;
    private Cuadrado stem;

    public Trebol(int x, int y) {
        leftCircle = new Circulo();
        topCircle = new Circulo();
        rightCircle = new Circulo();
        stem = new Cuadrado();

        leftCircle.changeColor("black");
        topCircle.changeColor("black");
        rightCircle.changeColor("black");
        stem.changeColor("black");

        leftCircle.changeSize(15);
        topCircle.changeSize(15);
        rightCircle.changeSize(15);
        stem.changeSize(5);

        leftCircle.setPosicion(x - 10, y);
        topCircle.setPosicion(x, y - 10);
        rightCircle.setPosicion(x + 10, y);
        stem.setPosicion(x, y + 10);
    }

    public void makeVisible() {
        leftCircle.makeVisible();
        topCircle.makeVisible();
        rightCircle.makeVisible();
        stem.makeVisible();
    }
}