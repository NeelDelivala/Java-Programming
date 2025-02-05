import java.util.Scanner;

public class AreaOfCircle {
    
	public static void main(String[] args) {
	    
        Scanner myObj = new Scanner(System.in); 
        float r=myObj.nextFloat();
        double pi=3.14;
        double area=pi*r*r;
		System.out.println("Area of Circle is: "+area);
		System.out.format("%.2f",area);
	}
}