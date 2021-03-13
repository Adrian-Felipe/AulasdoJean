package figuras3D;

public class Paralelograma implements Figura3d {

    private Ponto3d p0;

    private float largura, altura, profundidade;
    public Paralelograma(Ponto3d p0, float largura, float altura, float profundidade) {

        this.p0 = p0;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }

    public float getLargura() {
        return largura;
    }

    public float getAltura() {
        return altura;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public Ponto3d getP0() {
        return p0;
    }

    public Ponto3d calcP1 (){
        return new Ponto3d(p0.getX(), p0.getY()+altura, p0.getZ());
    }

    public Ponto3d calcP2 (){
        return new Ponto3d(p0.getX()+largura, p0.getY()+altura, p0.getZ());
    }

    public Ponto3d calcP3 (){
        return new Ponto3d(p0.getX()+largura, p0.getY(), p0.getZ());
    }

    public Ponto3d calcP4 (){
        return new Ponto3d(p0.getX(), p0.getY(), p0.getZ()+profundidade);
    }

    public Ponto3d calcP5 (){
        return new Ponto3d(p0.getX(), p0.getY() + altura, p0.getZ()+profundidade);
    }

    public Ponto3d calcP6 (){
        return new Ponto3d(p0.getX()+largura, p0.getY() + altura, p0.getZ()+profundidade);
    }

    public Ponto3d calcP7 (){
        return new Ponto3d(p0.getX()+largura, p0.getY(), p0.getZ()+profundidade);
    }

    @Override
    public Float calcVolume() {
        return largura*altura*profundidade;
    }

    @Override
    public void moveXYZ(float dX, float dY, float dZ) {
        p0.moveXYZ(dX, dY, dZ);
    }

    @Override
    public void moveXY(float dX, float dY) {
        p0.moveXY(dX, dY);
    }

    @Override
    public void moveXZ(float dX, float dZ) {
        p0.moveXZ(dX, dZ);
    }

    @Override
    public void moveYZ(float dY, float dZ) {
        p0.moveYZ(dY, dZ);
    }

    @Override
    public void moveX(float dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(float dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveZ(float dZ) {
        p0.moveZ(dZ);
    }

    @Override
    public String toString() {
        return "Paralelograma{" + "p0=" + p0 +
                "\n p1=" + calcP1( ) +
                "\n p2=" + calcP2( ) +
                "\n p3=" + calcP3( ) +
                "\n p4=" + calcP4( ) +
                "\n p5=" + calcP5( ) +
                "\n p6=" + calcP6( ) +
                "\n p7=" + calcP7( ) +
                "\n largura=" + largura +
                "\n altura=" + altura +
                "\n profundidade=" + profundidade +
                "\n volume=" + calcVolume() +'}';
    }
    public void write (){
        System.out.println(this.toString());
    }
}