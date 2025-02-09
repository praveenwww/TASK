interface Drawable{
void draw();
}
class Circle implements Drawable{
public void draw(){
System.out.println("Draw a Circle");
}
}
class Rectangle implements Drawable{
public void draw(){
System.out.println("Draw a Rectangle");
}
}
class Triangle implements Drawable{
public void draw(){
System.out.println("Draw a Triangle");
}
}

public class Interface{
public static void main(String[] args){
Circle c1 = new Circle();
Rectangle r1 = new Rectangle();
Triangle t1 = new Triangle();

c1.draw();
r1.draw();
t1.draw();

}
}