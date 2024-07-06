package classtest.polymorphism;

public abstract class Shape {
    protected double area;
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape(){

    }

    public abstract void calculationArea();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        calculationArea();
    }

}
