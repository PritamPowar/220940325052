class Shape{
    public void draw(){
        System.out.println("Drawing Something");
    }
    public void erase(){
        System.out.println("Easing something");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Something circle class");
    }
    public void erase(){
        System.out.println("Easing something circle class");
    }

}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Drawing Something Triangle class");
    }
    public void erase(){
        System.out.println("Easing something Triangle class");
    }

}
class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Something Square class");
    }
    public void erase(){
        System.out.println("Easing something Square class");
    }
}
public class que3 {
    public static void main(String[] args) {
        Circle c= new Circle();
        c.draw();
        c.erase();
        Triangle t= new Triangle();
        c.draw();
        c.erase();
        Square sq=new Square();
        sq.draw();
        sq.erase();
    }
}
