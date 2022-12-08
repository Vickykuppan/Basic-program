public class Temperatures
{
double celsius=14;
double fahrenhit=12;
double celsius()
{
double celsius=(fahrenhit-32)*5/9;
System.out.println(celsius);
return(celsius);
}
double fahrenhit()
{
double fahrenhit=(celsius*9/5)+32;
System.out.println(fahrenhit);
return(fahrenhit);
}
public static void main(String args[])
{
Temperatures obj=new Temperatures();
obj.celsius();
obj.fahrenhit();
}
}
