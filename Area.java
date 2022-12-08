public class Area
{
    double areaofSquare (double a)
    {
        double area= a*a;
        System.out.println(area);
        return area;
    }
double areaofRectangle(double l, double b)
{
double area=l*b;
System.out.println(area);
return area;
}
public static void main(String args[]){
Area obj=new Area();
obj.areaofSquare(4.0);
obj.areaofRectangle(5.0,7.0);
}
}
