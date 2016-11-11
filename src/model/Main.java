package model;

import model.d2.D2Shape;
import model.d2.Kreis;
import model.d2.Quadrat;
import model.d2.RDreieck;
import model.d3.D3Shape;
import model.d3.Kegel;
import model.d3.Pyramide;
import model.d3.Würfel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leo Ignis on 11.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.doSomething();
    }

    private void doSomething() {

        List<D2Shape> shapeList2D = new ArrayList<D2Shape>();
        List<D3Shape> shapeList3D = new ArrayList<D3Shape>();

        shapeList2D.add(new Kreis(0,0,4));
        shapeList2D.add(new RDreieck(0,0,2,5));
        shapeList2D.add(new Quadrat(0,3,3));

        shapeList3D.add(new Kegel(0,1,4,2.4));
        shapeList3D.add(new Kegel(0,1,2,6.4));
        shapeList3D.add(new Pyramide(0,1,2,6.1));
        shapeList3D.add(new Würfel(2,3,7));

        print2DList(shapeList2D);
        print3DList(shapeList3D);

    }


    public void print2DList(List<D2Shape> shapeList) {

        System.out.println("--------------- 2D Shapes ----------------");
         double areaSum = 0;
         double areaPerimeter = 0;

        for (D2Shape shape : shapeList) {
            areaSum = areaSum + shape.calculateArea();
            areaPerimeter = areaPerimeter + shape.calculatePerimeter();
        }
        System.out.println("Sum of all areas = " + areaSum);
        System.out.println("Perimeter of all areas = " + areaPerimeter);
    }

    public void print3DList(List<D3Shape> shapeList) {

        System.out.println("--------------- 3D Shapes ----------------");
        double areaSum = 0;
        double areaPerimeter = 0;

        for (D3Shape shape : shapeList) {
            areaSum = areaSum + shape.calculateVolume();
            areaPerimeter = areaPerimeter + shape.calculateSurfaceArea();
        }
        System.out.println("Sum of all areas = " + areaSum);
        System.out.println("Perimeter of all areas = " + areaPerimeter);

    }


}
