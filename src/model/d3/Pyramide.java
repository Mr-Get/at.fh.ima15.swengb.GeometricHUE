package model.d3;

/**
 * Created by Leo Ignis on 11.11.2016.
 */
public class Pyramide extends D3Shape {

    // Die Pyramide ist quadratisch!!!!!!!!!!!!!!!!!

    private double a;
    private double h;

    public Pyramide(int x, int y, double a, double h) {
        this.a = a;
        this.h = h;
        this.x = x;
        this.y = y;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateVolume() {
        double G = a*a;
        return 1 / 3 * G * h;
    }

    @Override
    public double calculateSurfaceArea() {
        double G = a*a;
        double ha = Math.sqrt((h*h) + (a*a));
        double M = a* ha *4;
        return G + M;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramide pyramide = (Pyramide) o;

        if (Double.compare(pyramide.a, a) != 0) return false;
        return Double.compare(pyramide.h, h) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(a);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
