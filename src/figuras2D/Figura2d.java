package figuras2D;

public interface Figura2d extends Objeto2d {

    public float area();
    public float perimetro();

    void moveXY(float Dx, float Dy);
}
