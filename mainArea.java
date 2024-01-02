import java.util.Scanner;

class inputScanner
{
	protected Scanner scanner; 
	
	public inputScanner() 
	{
		scanner = new Scanner(System.in);
	}
}

abstract class shape extends inputScanner 
{ 
	double a, b;
	public shape() 
	{
		super(); 
		System.out.println("the area of a : ");
		a = scanner.nextDouble(); 
		System.out.println("the area of b : ");
		b = scanner.nextDouble(); 
	}

}

class rectangle extends shape 
{
	public rectangle() 
	{
        	super();
    	}
	
	void area() 
	{
	double area = a*b; 
	System.out.println("the area of rectangle is : " + area); 	
	}
}

class triangle extends shape 
{
	public triangle() 
	{
        	super();
    	}
	
	void area() 
	{
	double area = 0.5*a*b; 
	System.out.println("the area of triangle is : " + area); 	
	}
} 

class circle extends shape 
{
	public circle() 
	{
        	super();
    	}
	
	void area() 
	{
	double area = 3.14*a*a; 
	System.out.println("the area of rectangle is : " + area); 	
	} 
}

public class mainArea 
{
	public static void main(String[] args) 
	{
		
		rectangle r = new rectangle(); 
		triangle t = new triangle(); 
		circle c = new circle(); 
		
		r.area(); 
		t.area();
		c.area();
	}
}

