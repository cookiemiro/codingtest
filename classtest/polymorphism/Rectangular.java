package classtest.polymorphism;

public class Rectangular extends Shape {
    private double width;
    private String height;

    public Rectangular(double width, String height) {
        super("직사각형");
        this.width = width;
        this.height = height;
    }
    @Override
    public void calculationArea() {
        area = width * Integer.parseInt(height);
        System.out.println(this.getName() + "의 면적은 " + area);
    }
}
