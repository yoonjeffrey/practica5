public class Corazon {
    private Circulo leftCircle;
    private Circulo rightCircle;
    private Triangulo bottomTriangle;

    public Corazon(int x, int y) {
        leftCircle = new Circulo();
        rightCircle = new Circulo();
        bottomTriangle = new Triangulo();

        leftCircle.changeColor("red");
        rightCircle.changeColor("red");
        bottomTriangle.changeColor("red");

        leftCircle.changeSize(20);
        rightCircle.changeSize(20);
        bottomTriangle.changeSize(20, 40);

        leftCircle.setPosicion(x - 10, y);
        rightCircle.setPosicion(x + 10, y);
        bottomTriangle.setPosicion(x, y + 10);
    }

    public void makeVisible() {
        leftCircle.makeVisible();
        rightCircle.makeVisible();
        bottomTriangle.makeVisible();
    }
}