public class SimpleCircleTest {
    public static void main(String[] args) {

        SimpleCircle circle1=new SimpleCircle();
        System.out.println("The area of the circle of radius "
                +circle1.radius +" is "+circle1.getArea());
        System.out.println("The perimeter of the circle of radius "+
                circle1.radius +" is "+circle1.getPerimeter());

        SimpleCircle circle2=new SimpleCircle(25);
        System.out.println("The area of the circle of radius "+
                circle2.radius+ " is " +circle2.getArea());
        System.out.println("The perimeter of the circle of radius "+
                circle2.radius +circle2.getPerimeter());

        SimpleCircle circle3=new SimpleCircle(125);
        System.out.println("The area of the circle of radius "
                +circle3.radius+" is "+circle3.getArea());
        System.out.println("The perimeter of the circle of radius "+
                circle3.radius +circle3.getPerimeter());

        circle2.radius=100;
        System.out.println("The area of the circle of radius "+
                circle2.radius+ " is " +circle2.getArea());


    }
}