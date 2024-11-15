package geometrycalculator;
/**
 * @author s226440
 * @since 2024-02-02
 * @version 1.0
 */
public class Geometry { 
    /**
     * @param radius
     * @return area of a circle
     */    
    public static double AreaofCircle(double radius) {       
        return Math.PI * radius *radius;
    } 
    
    /**
     * @param length, width
     * @return area of a rectangle
     */  
    public static double AreaofRectangle(double length, double width) {       
        return length * width;
    }
    
    /**
     * @param base, height
     * @return area of a triangle
     */  
    public static double AreaofTriangle(double base, double height) {       
        return base * height * 0.5;
    }

    
}
