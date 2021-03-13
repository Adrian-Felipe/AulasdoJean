package figuras2D;

public class Circulo implements Figura2d {

    private Ponto2d centro;
    private float raio;

    public Circulo(Ponto2d centro, float raio) {
        this.centro = new Ponto2d(centro.getX(), centro.getY());
        this.raio = raio;
    }
    public Ponto2d getCentro() {
        return centro;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float area() {
        return (float)Math.PI*raio*raio;
    }

    @Override
    public float perimetro() {
        return (float)(2*Math.PI*raio);
    }

    @Override
    public void moveX(float dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(float dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(float Dx, float Dy) {
        centro.moveXY(Dx, Dy);
    }

    @Override
    public String toString() {
        return "Circulo{" + "centro=" + centro + ", raio=" + raio +
                ", area" + area() + ", perimetro" + perimetro() + '}';
    }
    public void write (){
        System.out.println(this.toString());
    }
}