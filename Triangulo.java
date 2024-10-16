public class Triangulo extends Triangle {
    public void setPosicion(int x, int y) {
        moveHorizontal(x - 210);
        moveVertical(y - 140);
    }
}
