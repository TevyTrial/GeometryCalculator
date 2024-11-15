package geometrycalculator;

import java.util.Scanner;

/**
 * @author s226440
 * @since 2024-02-02
 * @version 1.0
 */
public class GeometryCalculator {
    private int choice;
    private Geometry e;
    
    public int getMenuChoice() {
        Scanner in = new Scanner(System.in);      
        int choice;
        
        boolean t;
        
        do {
            t = false;
            System.out.println("\n1.Calculate the Area of a Circle\n2.Calculate the Area of a Rectangle\n"
				+ "3.Calculate the Area of a Triangle\n" + "4. Quit\n");
            System.out.print("Please enter a choice number: ");
            
            choice = in.nextInt();
            
            try {
                if (choice < 1 || choice > 4) {
                    throw new IllegalArgumentException("Invalid choice number");
                }              
            } catch(IllegalArgumentException e) {
                t = true;
                System.out.println("Please re-enter one choice number");
            }
        } while(t);
        return choice;
        
    }
    public void circle(double r) {
        double area = this.e.AreaofCircle(r);
        System.out.println("Area of the circle is "+area);
    }
    
    public void rectangle(double len, double wid) {
        double area = this.e.AreaofRectangle(len, wid);
        System.out.println("Area of rectangle is "+area);
    }
    
    public void triangle(double base, double h) {
	double area = this.e.AreaofTriangle(base, h);
	System.out.println("Area of the rectangle is " + area);
    }
        
	public static void main(String[] args) {
		GeometryCalculator ga = new GeometryCalculator();
		
		boolean tt;
		Scanner in = new Scanner(System.in);
		int choice;
		
		do {
                    tt = false;
                    choice = ga.getMenuChoice();
                    
                    switch(choice) {
                        case 1:
                            System.out.print("Please enter a value of radius: ");
                            double r = in.nextDouble();
                            
                            try {
                                if (r < 0) {
                                    throw new IllegalArgumentException("An invalid value for radius.");
                                }
                                ga.circle(r);
                            } catch(IllegalArgumentException e) {
                                tt = true;
                                System.out.println("Invalid value input.");                    
                            }
                            break;
                            
                        case 2:
                            System.out.print("Please enter a value of length: ");
                            double len = in.nextDouble();
                            System.out.print("Please enter a value of width: ");
                            double wid = in.nextDouble();
                            
                            try {
                                if(len < 0) {
                                    throw new IllegalArgumentException("An invalid value for length.");
                                }
                                else if (wid < 0) {
                                    throw new IllegalArgumentException("An invalid value for width.");  
                                }
                                ga.rectangle(len, wid);
                            } catch (IllegalArgumentException e) {
                                tt = true;
                                System.out.println("Invalid value input.");
                            }
                            break;
                            
                        case 3:
                            System.out.print("Please enter a value of base:　");
                            double base = in.nextDouble();
                            System.out.print("Please enter a value of height:　");
                            double h = in.nextDouble();
                            
                            try {
                                if(base < 0) {
                                    throw new IllegalArgumentException("An invalid value for base.");  
                                }
                                else if (h < 0) {
                                    throw new IllegalArgumentException("An invalid value for width.");  
                                }
                                ga.triangle(base, h);
                            } catch(IllegalArgumentException e) {
                                tt = true;
                                System.out.println("Invalid value input.");
                            }
                            break;
                            
                        case 4:
                            System.out.println("Quit for calculation! ");
                            break;
                    }
                        
			 
                } while (choice != 4);
                in.close();
        }
}

