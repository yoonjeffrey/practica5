public class Diamante {
    private Triangulo topTriangle;
    private Triangulo bottomTriangle;

    public Diamante(int x, int y) {
        topTriangle = new Triangulo();
        bottomTriangle = new Triangulo();

        topTriangle.changeColor("red");
        bottomTriangle.changeColor("red");

        topTriangle.changeSize(20, 40);
        bottomTriangle.changeSize(20, 40);

        topTriangle.setPosicion(x, y - 10);
        bottomTriangle.setPosicion(x, y + 10);
    }

    public void makeVisible() {
        topTriangle.makeVisible();
        bottomTriangle.makeVisible();
    }
}
