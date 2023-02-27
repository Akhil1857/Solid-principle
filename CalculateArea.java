import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of rectangle:");
        int height =input.nextInt();


        System.out.println("Enter the width of rectangle:");
        int width= input.nextInt();



        Rectangle rect= new Rectangle();
        rect.setHeight(height);
        rect.setWidth(width);

        System.out.println("Area of the rectangle = "+rect.getArea());

        System.out.println("Enter the side of square");
        int side= input.nextInt();
        Square sqr= new Square();
        sqr.setSide(side);

        System.out.println("Area of the Square = "+sqr.getArea());


    }
}
class Square extends Rectangle {


    public void setSide (int side) {
        m_width = side;
        m_height = side;
    }

    public void setHeight (int height) {
        m_width = height;
        m_height = height;
    }
}
 class Rectangle {

    int m_width;
    int m_height;

    public void setWidth(int width){
        m_width = width;
    }

    public void setHeight(int length) {
        m_height = length;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}

