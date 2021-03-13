package figuras2D;

public class Ponto2d implements Objeto2d {
    private float x, y;
    public Ponto2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void moveX(float Dx) {
        x += Dx;
    }

    public void moveY(float Dy) {
        y += Dy;
    }

    public void moveXY(float Dx, float Dy) {
        x += Dx;
        y += Dy;
    }

    public String toString() {
        return "Ponto2d{" + "x = " + x + ", y = " + y + '}';
    }

    public void write(){
        System.out.println(this.toString());
    }
}
