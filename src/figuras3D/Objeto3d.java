package figuras3D;

import figuras2D.Objeto2d;

public interface Objeto3d extends Objeto2d {

    void moveZ(float Dz);
    void moveXZ(float Dx, float Dz);
    void moveYZ(float Dy, float Dz);
    void moveXYZ(float Dx, float Dy, float Dz);
}
