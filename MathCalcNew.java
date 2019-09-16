import java.util.Scanner;
public class MathCalcNew {

	public MathCalcNew() {
		// TODO Auto-generated constructor stub
	}
	
	public static void Integral1(int a, int b, int c, int d){
		System.out.println("======== a x^b ========");
	    System.out.println("The indefinite integral is "+(double)a/(b+1)+"x^"+(b+1)+" + C");
	    System.out.println("The integration is "+(double)a/(b+1)*((Math.pow(d, b+1))-(Math.pow(c, b+1))));
		
		
	}
	
	public static void Integral2(int a, int b, int c, int d){
		
		System.out.println("======== a cos(bx) ========");
	    System.out.println("The indefinite integral is "+(double)a/b+" sin("+(double)b+"x)+ C");
	    System.out.println("The integration is "+((double)a/b)*((Math.sin((double)b*d))-(Math.sin((double)b*c))));
		
	}
	public static void Integral3(int a, int b, int c, int d){
	    System.out.println("======== a e^(bx) ========");
	    System.out.println("The indefinite integral is "+(double)a/b+" e^("+(double)b+"x)+ C");
	    System.out.println("The integration is "+((double)a/b)*((Math.exp(b*d))-(Math.exp(b*c))));		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard;
	    
	    int a,b,c,d;
	    double integral, integration; 
	    keyboard = new Scanner( System.in );
	    System.out.print( "Enter coefficients a and b for integrating a x^b, a cos(bx), and a e^{bx}: " );
	    a = keyboard.nextInt();
	    b = keyboard.nextInt();
	   
	    System.out.print("Enter the range [c, d] of integration:");
	    c = keyboard.nextInt();
	    d = keyboard.nextInt();
	    Integral1(a,b,c,d);
	    Integral2(a,b,c,d);
	    Integral3(a,b,c,d);
	    

	}

}
