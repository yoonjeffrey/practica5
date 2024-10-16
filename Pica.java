public class Pica {
    private Triangulo topTriangle;
    private Circulo bottomCircle;

    public Pica(int x, int y) {
        topTriangle = new Triangulo();
        bottomCircle = new Circulo();

        topTriangle.changeColor("black");
        bottomCircle.changeColor("black");

        topTriangle.changeSize(20, 40);
        bottomCircle.changeSize(15);

        topTriangle.setPosicion(x, y - 10);
        bottomCircle.setPosicion(x, y + 10);
    }

    public void makeVisible() {
        topTriangle.makeVisible();
        bottomCircle.makeVisible();
    }
}