package figuras2D;

public class SegReta2D implements Objeto2d{

    private final Ponto2d p0;
    private final Ponto2d p1;

    public SegReta2D(Ponto2d p0,Ponto2d p1){
        this.p0=new Ponto2d(p0.getX(),p0.getY());
        this.p1=new Ponto2d(p1.getX(),p1.getY());
    }
    public Ponto2d getP0(){
        return p0;
    }
    public Ponto2d getP1(){
        return p1;
    }
    @Override
    public void moveX(float Dx) {
        p0.moveX(Dx);
        p1.moveX(Dx);
    }
    @Override
    public void moveY(float Dy) {
        p0.moveY(Dy);
        p1.moveY(Dy);
    }
    @Override
    public void moveXY(float Dx, float Dy) {
        p0.moveXY(Dx, Dy);
        p1.moveXY(Dx, Dy);
    }
    public float comprimento(){
        return (float) Math.sqrt(Math.pow(p1.getX()-p0.getX(),2)+Math.pow(p1.getY()-
                p0.getY(),2));
    }
    @Override
    public String toString(){
        return "SegReta("+"p0="+p0+" e p1="+p1+'}';
    }
    public void write() {
        System.out.println(this.toString());
    }
}

