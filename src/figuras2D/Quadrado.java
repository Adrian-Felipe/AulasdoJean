package figuras2D;

public class Quadrado implements Figura2d {
    private Ponto2d p0;
    private float lado;

    public Quadrado(Ponto2d p0, float lado) {
        this.p0 = new Ponto2d(p0.getX(), p0.getY());
        this.lado = lado;
    }

    public Ponto2d getP0() {
        return p0;
    }

    public Ponto2d getP1() {
        return new Ponto2d(p0.getX(), p0.getY() + lado);
    }

    public Ponto2d getP2() {
        return new Ponto2d(p0.getX() + lado, p0.getY() + lado);
    }

    public Ponto2d getP3() {
        return new Ponto2d(p0.getX() + lado, p0.getY());
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado * lado;
    }

    @Override
    public float perimetro() {
        return 4 * lado;
    }

    @Override
    public void moveX(float Dx) {
        p0.moveX(Dx);
    }

    @Override
    public void moveY(float Dy) {
        p0.moveY(Dy);
    }

    @Override
    public void moveXY(float Dx, float Dy) {
        p0.moveXY(Dx, Dy);
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p0=" + p0 + "p1=" + getP1() + ", p2=" + getP2() + "p3=" + getP3() +
                "\n lado=" + lado +
                "\n perimetro " + perimetro() +
                "\n area " + area() + '}';
    }

    public void write() {
        System.out.println(this.toString());
    }
}