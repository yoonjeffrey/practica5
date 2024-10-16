public class Circulo extends Circle {
    public void setPosicion(int x, int y) {
        moveHorizontal(x - 230);
        moveVertical(y - 90);
    }
}