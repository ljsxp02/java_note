package org.opentutorials.javatutorials.method;
import java.util.Scanner;




public class ReturnDemo {
	
	public static int calculator(int x, int y)
	{
		return x*y;
	}
	
	
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); // 입력을 받을 Scanner 객체 생성
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 
		 int result=0;
		 
		 result = calculator(x,y);
		 System.out.printf("%d x %d = %d",x,y,result);
	}

}
