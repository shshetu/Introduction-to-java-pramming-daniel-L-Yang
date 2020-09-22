package chapter_20.section_20_3;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Print the circle info
    public void printCircle(){
        System.out.println("The circle is created "+ getDateCreated()+ " and the radius is "+ radius);
    }
}
