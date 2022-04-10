package ss6encapsulation.bai_tap.ClassPoint2DAndClassPoint3D;

import java.util.Arrays;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;
    public float xy[];

    public Point2D() {

    }

    public Point2D(float x, float y) {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {

        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;

    }

    public void setXY(float[] xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", xy=" + Arrays.toString(xy) +
                '}';
    }
}

