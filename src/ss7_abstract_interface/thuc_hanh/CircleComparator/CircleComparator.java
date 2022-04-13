package ss7_abstract_interface.thuc_hanh.CircleComparator;

import ss6encapsulation.bai_tap.ClassCircleaAndClassCylinder.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1,Circle c2) {
      if(c1.getRadius()> c2.getRadius())return 1;
      else if (c1.getRadius()< c2.getRadius())return -1;
      else return 0;

    }
}
