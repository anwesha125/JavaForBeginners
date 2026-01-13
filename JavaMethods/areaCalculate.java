package JavaMethods;

public class areaCalculate {
    // for square
    public static int area(int side){
        return (side*side);
    }

    // for rectangle
    public static int area(int length, int breadth){
        return(length*breadth);
    }

    // for triangle
    public static double area(double base, double height, boolean isTriangle){
        if(isTriangle)
        return(base*height)/2;

        return base*height; 
    }

    // for circle
    public static double area(double radius){
        return (Math.PI*radius*radius);
    }

    public static void main(String[] args){
        // areaCalculate ac = new areaCalculate();
        // int areaSq = ac.area(4);
        System.out.println(area(4));
        System.out.println(area(4,6));
        System.out.println(area(3.8,4.5, true));
        System.out.println(area(3.5));

    }
    
}
