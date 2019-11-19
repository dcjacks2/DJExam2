public class Pentagon extends Shape {
    private double width;
    private double height;
    public Pentagon(double w, double h){
        width = w;
        height = h;
    }
    public double Area(){
        double totArea;
        totArea = (.5*(width*height))*5;
        return totArea;
    }
}
