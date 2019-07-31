import java.util.Scanner;

public class TestRectangle {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the width: ");
        double width=scanner.nextDouble();
        System.out.println("enter the height: ");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("your rectangle \n"+rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+rectangle.getArea());
    }
}
