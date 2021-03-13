package figuras3D;

public class Ponto3d implements Objeto3d {

    private float x;
    private float y;
    private float z;

    public Ponto3d (float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    @Override
    public void moveX(float Dx) {x += Dx;}

    @Override
    public void moveY(float Dy) {y += Dy;}

    @Override
    public void moveZ(float Dz) {
        z += Dz;
    }

    @Override
    public void moveXY(float Dx, float Dy) {
        x += Dx;
        y += Dy;
    }

    @Override
    public void moveXZ(float Dx, float Dz) {
        x += Dx;
        z += Dz;

    }

    @Override
    public void moveYZ(float Dy, float Dz) {
        y += Dy;
        z += Dz;

    }

    @Override
    public void moveXYZ(float Dx, float Dy, float Dz) {
        x += Dy;
        y += Dy;
        z += Dz;
    }

    public String toString() {
        return "Ponto3D{" + "x = " + x + ", y = " + y + ", z = " + z + '}';
    }

    public void write(){
        System.out.println(this.toString());
    }
}
