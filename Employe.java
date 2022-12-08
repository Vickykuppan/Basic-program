public class Employe
{
int eid;
String ename;
double expireance;
void printPosition()
{
if(expireance>=0 && expireance<=2)
{
System.out.println("Position fresher");
}
else
if(expireance>=3 && expireance<=7)
{
System.out.println("Position teamleader");
}
else
if(expireance>=8 && expireance<=15)
{
System.out.println("Position manager");
}
}
Employe(int a,String b,double c)
{
eid = a;
ename = b;
expireance = c;
}
public static void main(String args[])
{
Employe e1=new Employe(001,"vignesh",1.0);
Employe e2=new Employe(002,"karan",5.0);
Employe e3=new Employe(003,"ravi",7.0);
Employe e4=new Employe(004,"lokesh",14.0);
Employe e5=new Employe(005,"promoth",11.0);
e1.printPosition();
e2.printPosition();
e3.printPosition();
e4.printPosition();
e5.printPosition();
}
}





