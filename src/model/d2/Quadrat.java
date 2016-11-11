package model.d2;

/**
 * Created by Leo Ignis on 11.11.2016.
 */
public class Quadrat extends D2Shape{

    private double a;

    public Quadrat(int x, int y, double a) {
        this.a = a;
        this.x = x;
        this.y = y;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Quadrat quadrat = (Quadrat) o;

        return Double.compare(quadrat.a, a) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public double calculateArea() {
        return a*a;
    }

    @Override
    public double calculatePerimeter() {
        return a*4;
    }
}
