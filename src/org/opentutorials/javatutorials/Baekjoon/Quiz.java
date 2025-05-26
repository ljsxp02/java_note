package org.opentutorials.javatutorials.Baekjoon;

import java.util.Scanner;

public class Quiz
{
    public static int rest(int a, int b, int n)
    {
        int result = (int)((b/(Math.pow(10, n-1)))%10)*a;
        return result;
    }
    
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.printf("%d\n",rest(a,b,1));
        System.out.printf("%d\n",rest(a,b,2));
        System.out.printf("%d\n",rest(a,b,3));
        System.out.printf("%d\n",a*b);
        
    }
}