package week1.day2.assignments;

public class MyCalculator {
	
	public static void main(String[] args)
	{
		Calculator calci=new Calculator();
		int sum,diff,num1=125,num2=14,num3=100;
		double product;
		float Quotient;
		sum=calci.add(num1, num2, num3);
		System.out.println("Addition of "+num1+", "+num2+", "+ num3 +" is "+ sum +"\n");
		
		diff=calci.sub(num1, num2);
		System.out.println("Subtraction of "+num1+", "+num2+" is "+ diff+"\n");
		
		product=calci.mul(num1, num2);
		System.out.println("Multiplication of "+num1+", "+num2+" is "+ product+"\n");
		
		Quotient=calci.divide(125.0f, 14.0f);
		System.out.println("Division of "+num1+", "+num2 +" is "+ Quotient+"\n");
		
		
		
		
	}

}
