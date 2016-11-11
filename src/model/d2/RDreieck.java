package model.d2;

/**
 * Created by Leo Ignis on 11.11.2016.
 */
public class RDreieck extends D2Shape {

    private double a;
    private double b;

    public RDreieck(int x, int y, double a, double b) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b / 2;
    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt((a*a) + (b*b)) + a + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RDreieck rDreieck = (RDreieck) o;

        if (Double.compare(rDreieck.a, a) != 0) return false;
        return Double.compare(rDreieck.b, b) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
