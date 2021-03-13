package figuras3D;

public class Cubo implements Figura3d {

    private Ponto3d p0;
    private float lado;

    public Cubo(Ponto3d po, float lado) {
        this.p0 = new Ponto3d(p0.getX(), p0.getY(), p0.getZ());
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public Ponto3d getP0() {
        return p0;
    }

    public Ponto3d calcP1(){
        return new Ponto3d(p0.getX(), p0.getY(), p0.getZ());
    }

    public Ponto3d calcP2(){
        return new Ponto3d(p0.getX()+lado, p0.getY()+lado, p0.getZ());
    }

    public Ponto3d calcP3(){
        return new Ponto3d(p0.getX()+lado, p0.getY(), p0.getZ());
    }

    public Ponto3d calcP4(){
        return new Ponto3d(p0.getX(), p0.getY(), p0.getZ()+lado);
    }

    public Ponto3d calcP5() { return new Ponto3d(p0.getX(), p0.getY()+lado, p0.getZ()+lado);}

    public Ponto3d calcP6() { return new Ponto3d(p0.getX()+lado, p0.getY()+lado, p0.getZ()+lado);}

    public Ponto3d calcP7() {return new Ponto3d(p0.getX()+lado, p0.getY(), p0.getZ()+lado);}

    @Override
    public Float calcVolume() {return lado*lado*lado;}

    @Override
    public void moveX(float Dx) {
        p0.moveX(Dx);
    }

    @Override
    public void moveY(float Dy) {
        p0.moveY(Dy);
    }

    @Override
    public void moveZ(float Dz) {
        p0.moveZ(Dz);
    }

    @Override
    public void moveXY(float Dx, float Dy) {
        p0.moveXY(Dx, Dy);
    }

    @Override
    public void moveXZ(float Dx, float Dz) {
        p0.moveXZ(Dx, Dz);
    }

    @Override
    public void moveYZ(float Dy, float Dz) {
        p0.moveYZ(Dy, Dz);
    }

    @Override
    public void moveXYZ(float Dx, float Dy, float Dz) {
        p0.moveXYZ(Dx, Dy, Dz);
    }

    @Override
    public String toString() {
        return "Cubo{" + "p0=" + p0 +
                ", p1=" + calcP1() +
                ", p2=" + calcP2() +
                ", p3=" + calcP3() +
                "\n, p4=" + calcP4() +
                ", p5=" + calcP5() +
                ", p6=" + calcP6() +
                ", p7=" + calcP7() +
                "\n, lado=" + lado +
                ", volume=" + calcVolume() + '}';
    }

    public void write() {
        System.out.println(this.toString());
    }
}
