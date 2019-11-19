public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }
    public double Area(){
        double totArea;
        totArea = (width*height);
        return totArea;
    }
}
