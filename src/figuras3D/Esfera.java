package figuras3D;

public class Esfera implements Figura3d {

    private Ponto3d centro;
    public float raio;

    public Esfera(Ponto3d centro, float raio) {
        this.centro = new Ponto3d(centro.getX(), centro.getY(), centro.getZ());
        this.raio = raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float getRaio() {
        return raio;
    }
    public Ponto3d getCentro() {
        return centro;
    }
    @Override
    public Float calcVolume() {
        return (4.0f/3.0f)*(float)Math.PI* raio * raio * raio;
    }
    @Override
    public void moveXYZ(float dX, float dY, float dZ) {
        centro.moveXYZ(dX, dY, dZ);
    }
    @Override
    public void moveXY(float dX, float dY) {
        centro.moveXY(dX, dY);
    }
    @Override
    public void moveXZ(float dX, float dZ) {
        centro.moveXZ(dX, dZ);
    }
    @Override
    public void moveYZ(float dY, float dZ) {
        centro.moveYZ(dY, dZ);
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
    public void moveZ(float dZ) {
        centro.moveZ(dZ);
    }
    @Override
    public String toString() {
        return "Esfera{" + "centro=" + centro + ", raio=" + raio +" Volume=" + calcVolume()+ '}';
    }
    public void write(){
        System.out.println(this.toString());
    }
}