import java.util.*;
class Complex{
int r1,r2,r3,s1,s2,s3;
void data(){
Scanner n=new Scanner(System.in);
System.out.println("Enter real value and image value of first complex number");

r1=n.nextInt();
s1=n.nextInt();
System.out.println("Enter real value and image value of second complex number");

r2=n.nextInt();
s2=n.nextInt();
r3=r1+r2;
s3=s1+s2;
System.out.println(r3+"+"+s3+"i");
}
}
class Complexnum{
public static void main(String[] arg)
{
Complex c=new Complex();
c.data();
}
}
