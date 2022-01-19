import com.jogamp.opengl.GL2;

public abstract class Shape3D
{
    protected double x, y, z;
    protected double r, g, b;
    protected double size;

    public double getX() {
       return x;
    }

    public double getY() {
        return y;
    }

    public Shape3D()
    {
        x = 0; y = 0; z = 0;
        r = 0; g = 0; b = 0;
        size = 1;
    }

    public abstract void display(GL2 gl);
}