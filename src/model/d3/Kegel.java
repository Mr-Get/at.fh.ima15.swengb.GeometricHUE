package model.d3;

/**
 * Created by Leo Ignis on 11.11.2016.
 */
public class Kegel extends D3Shape {

    private double h;
    private double r;

    public Kegel(int x, int y, double h, double r) {
        this.h = h;
        this.r = r;
        this.y = y;
        this.x = x;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateVolume() {
        return 1/3 * Math.PI * r * r *h;
    }

    @Override
    public double calculateSurfaceArea() {
        return (Math.PI * r * r) + (Math.PI * r * Math.sqrt((r*r)+(h*h)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Kegel kegel = (Kegel) o;

        if (Double.compare(kegel.h, h) != 0) return false;
        return Double.compare(kegel.r, r) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(h);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }




}
