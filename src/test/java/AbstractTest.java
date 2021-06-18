
abstract class Shapes{
    protected double width;
    protected double height;
    public Shapes(double width,double height) {
        this.width=width;
        this.height=height;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
class Circle extends Shapes {
    private double Pi=3.14;
    private double radius;
    public Circle(double width, double height) {
        super(width, height);
        double r = 3;
        radius=r;
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return Pi*radius*radius;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return 2*Pi*radius;
    }
}
class Rectangle extends Shapes{

    public Rectangle(double width, double height) {
        super(width, height);

    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return width*height;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return 2*(width+height);
    }

}
public class AbstractTest {

    public static void main(String[] args) {
        System.out.println("d");
//    }
//
//    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shapes circle=new Circle(1.0,1.0);
        System.out.println("圆形面积为："+circle.getArea());
        System.out.println("圆形周长为："+circle.getPerimeter());
        Shapes	rect=new Rectangle(3, 5);
        System.out.println("长方形的面积为:"+rect.getArea());
        System.out.println("长方形周长为："+rect.getPerimeter());
    }

}
