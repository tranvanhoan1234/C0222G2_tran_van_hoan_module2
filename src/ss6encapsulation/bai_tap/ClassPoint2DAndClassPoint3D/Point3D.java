package ss6encapsulation.bai_tap.ClassPoint2DAndClassPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    public float z = 0.0f;
    public float[] xyz;

    public Point3D() {

    }
    public Point3D(float x, float y, float z) {


    }    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXyz() {
       float[] arr1=new float[3];
       arr1[0] =x;
       arr1[1]=y;
       arr1[2]=z;
       return super.getXY() ;
    }

    public void setXyz(float[] xyz) {
        this.xyz = xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z= " + z +
                ", xyz= " + Arrays.toString(xyz) +
                '}';
    }
}
