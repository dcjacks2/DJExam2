public class Triangle extends Shape {
    private double width;
    private double height;
    public Triangle(double w, double h){
        width = w;
        height = h;
    }
    public double Area(){
        double totArea;
        totArea = .5*(width*height);
        return totArea;
    }
}
