public class Cuadrado extends Square {
    public void setPosicion(int x, int y) {
        moveHorizontal(x - 310);
        moveVertical(y - 120);
    }
}