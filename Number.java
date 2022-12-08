public class Number
{
void toCheckPositive(int number)
{
if(number>0)
{
System.out.println("positive number");
}
else
{
System.out.println("not a positive number");
}
}
void oddorEven(int number)
{
if(number%2==0)
{
System.out.println("Given number is Even Number");
}
else
{
System.out.println("Given number is Odd Number");
}
}
int modulus(int number)
{
if(number<0)
{
number= -1 * number;
System.out.println(number);
}
return number;
}
void toCheckPrimeNumber(int number)
{
boolean flag = false;
for(int i=2; i<=number/2; i =i+1)
{
if(number%i==0)
{
flag= true;
break;
}
}
if(flag)
{
System.out.println("not a Prime Number");
}
else
{
System.out.println("prime number");
}
}
public static void main(String args[])
{
Number obj=new Number();
obj.toCheckPositive(-7);
obj.oddorEven(8);
obj.modulus(-9);
obj.toCheckPrimeNumber(17);
}
}
