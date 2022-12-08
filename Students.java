public class Students
{
int rollno;
String name;
double percentage;
void printGrade()
{
switch(1)
{
case 1:
if(percentage>=0 && percentage<=49)
{
System.out.println("Grade D");
}
case 2:
if(percentage>=50 && percentage<=69)
{
System.out.println("Grade C");
}
case 3:
if(percentage>=70 && percentage<=89)
{
System.out.println("Grade B");
}
case 4:
if(percentage>=90 && percentage<=100)
{
System.out.println("Grade A");
}
}
}
Students(int a,String b,double c)
{
rollno = a;
name = b;
percentage = c;
}
public static void main(String args[])
{
Students s1=new Students(1,"vignesh",45.0);
Students s2=new Students(2,"karan",58);
Students s3=new Students(3,"ravi",72.0);
Students s4=new Students(4,"lokesh",93.0);
s1.printGrade();
s2.printGrade();
s3.printGrade();
s4.printGrade();
}
}

