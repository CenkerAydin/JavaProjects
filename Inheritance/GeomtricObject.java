

class GeomtricObject {
    private String color="White";
    private boolean filled;

    public GeomtricObject(){
    }

    public GeomtricObject(String color, boolean filled) {
    }

    public void   SimpleGeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
}

class CircleFromSimpleGeometricObject extends GeomtricObject{
    private double radius;
    public CircleFromSimpleGeometricObject(double radius){
        this.radius=radius;
    }
    public CircleFromSimpleGeometricObject(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
class RectangleFromSimpleGeometricObject extends GeomtricObject{
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject(
            double width,double height){
        this.width=width;
        this.height=height;
    }
    public RectangleFromSimpleGeometricObject(
            double width,double height,String color,boolean filled){
        super(color,filled);
       this.width=width;
       this.height=height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

}