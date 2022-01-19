import com.jogamp.opengl.GL2;

public class Cube3D extends Shape3D
{

    public Cube3D(double x, double y, double z, double size)
    {
        this.x = x; this.y = y; this.z = z;
        this.size = size;
    }
    public void translateXRight(){
        super.x+=0.01;
    }
    public void translateXLeft(){
        super.x-=0.01;
    }

    public void display(GL2 gl)
    {
        gl.glPushMatrix();
        gl.glTranslated(x, y, z);
        gl.glScaled(size, size, size);
        gl.glBegin(GL2.GL_QUADS);
        // Front
        gl.glColor3d(1, 0, 2);
        gl.glVertex3d(-1, -1, 1);
        gl.glVertex3d(1, -1, 1);
        gl.glVertex3d(1, 1, 1);
        gl.glVertex3d(-1, 1, 1);
        // Rear
        gl.glColor3d(1, 1, 8);
        gl.glVertex3d(-1, -1, -1);
        gl.glVertex3d(1, -1, -1);
        gl.glVertex3d(1, 1, -1);
        gl.glVertex3d(-1, 1, -1);
        // Left
        gl.glColor3d(3, 1, 2);
        gl.glVertex3d(-1, -1, -1);
        gl.glVertex3d(-1, -1, 1);
        gl.glVertex3d(-1, 1,  1);
        gl.glVertex3d(-1, 1, -1);
        // Right
        gl.glColor3d(1, 1, 1);
        gl.glVertex3d(1, -1, -1);
        gl.glVertex3d(1, -1, 1);
        gl.glVertex3d(1, 1,  1);
        gl.glVertex3d(1, 1, -1);
        // Bottom
        gl.glColor3d(0, 2, 1);
        gl.glVertex3d(-1, -1, 1);
        gl.glVertex3d(1, -1, 1);
        gl.glVertex3d(1, -1, -1);
        gl.glVertex3d(-1, -1, -1);
        // Up
        gl.glColor3d(1, 1, 1);
        gl.glVertex3d(-1, 1, 1);
        gl.glVertex3d(1, 1, 1);
        gl.glVertex3d(1, 1, -1);
        gl.glVertex3d(-1, 1, -1);
        gl.glEnd();
        gl.glPopMatrix();
    }

}