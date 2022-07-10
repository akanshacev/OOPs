class Shape{
double a;
Shape(double x){
a=x;
}
}
class Rectangle extends Shape{
double b;
Rectangle(double x,double y){
super(x);
b=y;
}
void area(double a,double b){
System.out.println("Area of rectangle:"+(a*b));
}
}
class Square extends Shape{
Square(double x){
super(x);
}
void area(double a){
System.out.println("Area of square:"+(a*a));
}
}
class Circle extends Shape{
Circle(double x){
super(x);
}
void area(){
System.out.println("Area of circle:"+(3.14*super.a*super.a));
}
}
class Area{
public static void main(String args[]){
Rectangle r=new Rectangle(6,4);
Square s=new Square(3);
Circle c=new Circle(5);
r.area(r.a,r.b);
s.area(s.a);
c.area();
}
}
