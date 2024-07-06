package classtest.polymorphism;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("원");
        this.radius = radius;
    }
    @Override
    public void calculationArea() {

        area = Math.PI * radius * radius;
        System.out.println(this.getName() + "의 면적은 " + area);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
