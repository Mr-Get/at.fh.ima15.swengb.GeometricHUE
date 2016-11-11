package model.d3;

/**
 * Created by Leo Ignis on 11.11.2016.
 */
public class Würfel extends D3Shape {

    private double a;

    public Würfel(int x, int y, double a) {
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
    public double calculateVolume() {
        return a*a*a;
    }

    @Override
    public double calculateSurfaceArea() {
        return a*a*6;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Würfel würfel = (Würfel) o;

        return Double.compare(würfel.a, a) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
