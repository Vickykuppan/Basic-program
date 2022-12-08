public class Decryption
{
public static void main(String args[])
{
String password="VICKY";
char c[]=new char[password.length()]; 
for(int i=0;i<c.length;i++)
{
c[i]=(char)(password.charAt(i)-(5*3));
}
String s=String.valueOf(c);
{
System.out.println(s);
}

}
}
