import java.io.*;
class product
{
int pcode;
int price;
String pname;
}
class Product1{
public static void main(String a[])
{
product x = new product();
product y = new product();
product z = new product();
x.pcode = 011;
x.price = 50;
x.pname = "Book";
z.pcode = 022;
z.price = 10;
z.pname = "pen";
y.pcode = 033;
y.price = 200;
y.pname = "Box";
System.out.println("Name = "+x.pname+" Code = "+x.pcode+" price ="+x.price); 

System.out.println("Name = "+y.pname+" Code = "+y.pcode+" price ="+y.price);

System.out.println("Name = "+z.pname+" Code = "+z.pcode+" price ="+z.price);

System.out.println("Lowest Price");
if(x.price < y.price && x.price < z.price)
{
System.out.println("Name = "+x.pname+" Code = "+x.pcode+" price ="+x.price);

}
else if(y.price < z.price)
{
System.out.println("Name = "+y.pname+" Code = "+y.pcode+" price ="+y.price);

}
else
{
System.out.println("Name = "+z.pname+" Code = "+z.pcode+" price ="+z.price);

}
}
}
