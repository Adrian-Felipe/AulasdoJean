package figuras2D;

public class Retangulo implements Figura2d {

    public Ponto2d p0;
    public float base;
    public float altura;

    public Retangulo(Ponto2d p0, float base, float altura) {
        this.p0 = new Ponto2d(p0.getX(), p0.getY());
        this.base = base;
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Ponto2d getP0() {
        return p0;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public Ponto2d calcP1 (){
        return new Ponto2d(p0.getX(), p0.getY()+ altura);
    }

    public Ponto2d calcP2 (){
        return new Ponto2d (p0.getX() + base, p0.getY() + altura);
    }

    public Ponto2d calcP3 () {
        return new Ponto2d (p0.getX() + base, p0.getY());
    }

    @Override
    public float area() {
        return base * altura;
    }

    @Override
    public float perimetro() {
        return (base* 2) + (altura * 2);
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
        return "Retangulo{" + "p0=" + p0 + ", p1=" + calcP1 () + ", p2=" + calcP2() + ", p3=" + calcP3
                () +
                "\n base=" + base +
                "\n altura=" + altura +
                "\n perimetro " + perimetro () +
                "\n area " + area () +'}';
    }
    public void write (){
        System.out.println (this.toString());
    }
}