package ss7_abstract_interface.thuc_hanh.ComparableCircle;

import ss6encapsulation.thuc_hanh.ClassCircle1.Circle1;

public class ComparableCircle extends Circle1
        implements Comparable<ComparableCircle> {
    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
  public int compareTo(ComparableCircle pt){
        if(getRadius() > pt.getRadius())return 1;
        else if (getRadius()< pt.getRadius())return -1;
        else return -1;
    }
    }


