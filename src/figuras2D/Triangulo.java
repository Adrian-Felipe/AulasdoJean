package figuras2D;

public class Triangulo implements Figura2d {

    private Ponto2d p0;
    private Ponto2d p1;
    private Ponto2d p2;

    public Triangulo(Ponto2d p0, Ponto2d p1, Ponto2d p2) {
        this.p0 = new Ponto2d (p0.getX(), p0.getY());
        this.p1 = new Ponto2d (p1.getX(), p1.getY());
        this.p2 = new Ponto2d (p2.getX(), p2.getY());
    }

    public Ponto2d getP0() {
        return p0;
    }
    public Ponto2d getP1() {
        return p1;
    }
    public Ponto2d getP2() {
        return p2;
    }

    @Override
    public float area() {
        SegReta2D segA = new SegReta2D(p0, p1);
        Float a = segA.comprimento();
        SegReta2D segB = new SegReta2D(p1, p2);
        Float b = segB.comprimento();
        SegReta2D segC = new SegReta2D(p2, p0);
        Float c = segC.comprimento();
        Float p = (a+b+c)/2;
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public float perimetro() {
        SegReta2D segA = new SegReta2D(p0, p1);
        Float a = segA.comprimento();
        SegReta2D segB = new SegReta2D(p1, p2);
        Float b = segB.comprimento();
        SegReta2D segC = new SegReta2D(p2, p0);
        Float c = segC.comprimento();
        return (a+b+c);
    }

    @Override
    public void moveX(float Dx) {
        p0.moveX(Dx);
        p1.moveX(Dx);
        p2.moveX(Dx);
    }

    @Override
    public void moveY(float Dy) {
        p0.moveY(Dy);
        p1.moveY(Dy);
        p2.moveY(Dy);
    }

    @Override
    public void moveXY(float Dx, float Dy) {
        p0.moveXY(Dx, Dy);
        p1.moveXY(Dx, Dy);
        p2.moveXY(Dx, Dy);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "p0=" + p0 + ", p1=" + p1 + ", p2=" + p2 +
                " area " + area() + " perimetro "+ perimetro() + '}';
    }
    public void write (){
        System.out.println(this.toString());
    }
}