public class Tax
{
public static void main(String args[])
{
double income=750000;
switch(1)
{
case 1:
if(income>=0 && income<=250000)
{
System.out.println("OldTax=0%,NewTax=0%");
}
case 2:
if(income>250000 && income<=500000)
{
System.out.println("OldTax=5%,NewTax=5%");
}
case 3:
if(income>500000 && income<=750000)
{
System.out.println("OldTax=20%,NewTax=10%");
}
case 4:
if(income>7500000 && income<=1000000)
{
System.out.println("OldTax=20%,NewTax=15%");
}
case 5:
if(income>1000000 && income<=1250000)
{
System.out.println("OldTax=30%,NewTax=20%");
}
case 6:
if(income>1250000 && income<=1500000)
{
System.out.println("OldTax=30%,NewTax=25%");
}
case 7:
if(income>1500000)
{
System.out.println("OldTax=30%,NewTax=30%");
}
}
}
}
