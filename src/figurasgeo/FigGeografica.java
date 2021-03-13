package figurasgeo;

import figuras2D.Ponto2d;
import figuras3D.Esfera;
import figuras3D.Paralelograma;
import figuras3D.Ponto3d;
import figuras3D.Cubo;

public class FigGeografica {
    public static void main(String[] args) {

        Ponto2d p00 = new Ponto2d(2.0f, 0.0f);
        p00.write();
        p00.moveXY(2, 2);
        p00.write();

        Ponto3d p0 = new Ponto3d(2.0f, 0.0f, 3.0f);
        p0.write();
        p0.moveXYZ(2, 2, 2);
        p0.write();

        /*Cubo c0 = new Cubo(p0, 2.0f);
        c0.write();*/

        Paralelograma p1 = new Paralelograma(p0, 2.0f, 2.0f, 2.0f);
        p1.write();

        Esfera e1 = new Esfera(p0, 2.0f);
        e1.write();
    }
}
