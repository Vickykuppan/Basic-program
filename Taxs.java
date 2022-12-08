public class Taxs
{
public static void main(String args[])
{
double salary=1200000.0;
double oldTaxPercentage=0;
double newTaxPercentage=0;
switch(1)
{
case 1:
if(salary>250000.0 && salary<=500000.0)
{
oldTaxPercentage=salary*0.05;
newTaxPercentage=salary*0.05;
System.out.println(oldTaxPercentage);
System.out.println(newTaxPercentage);
}
case 2:
if(salary>500000.0 && salary<=750000.0)
{
oldTaxPercentage=salary*0.20;
newTaxPercentage=salary*0.10;
System.out.println(oldTaxPercentage);
System.out.println(newTaxPercentage);
}
case 3:
if(salary>750000.0 && salary<=1000000.0)
{
oldTaxPercentage=salary*0.20;
newTaxPercentage=salary*0.15;
System.out.println(oldTaxPercentage);
System.out.println(newTaxPercentage);
}
case 4:
if(salary>1000000.0 && salary<=1250000.0)
{
oldTaxPercentage=salary*0.30;
newTaxPercentage=salary*0.20;
System.out.println(oldTaxPercentage);
System.out.println(newTaxPercentage);
}
case 5:
if(salary>1250000.0 && salary<=1500000.0)
{
oldTaxPercentage=salary*0.30;
newTaxPercentage=salary*0.25;
System.out.println(oldTaxPercentage);
System.out.println(newTaxPercentage);
}
case 6:
if(salary>1500000.0)
{
oldTaxPercentage=salary*0.30;
newTaxPercentage=salary*0.30;
System.out.println(oldTaxPercentage);
System.out.println(newTaxPercentage);
}
}
}
}


