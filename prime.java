package myproject.homework.Exmple;

import java.util.Scanner;

public class prime
{
    public static void main(String[] args)
    {
        int n,m=0;
        System.out.println("Enter number to check where it is prime or not");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       // m=n/2;
        if(n==1)
        {
            System.out.println("This is not prime no");
        }
        else if(n%2==0)
        {
            System.out.println("This is not prime no");
        }else
        {
            System.out.println("This is prime no");

        }

    }
}







