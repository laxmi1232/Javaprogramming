 // write a program to find GCD or HCF  of two numbers in java 

import java.util.Scanner;
class Gcd_Lcm
{
    public static void main(String [] agrs){
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        int min = (num1>num2)?num2:num1;
        for(int i = 1;i<=min;i++){
            
            if(num1%i==0 && num2%i==0)
            gcd = i;
             
        }
        System.out.println("Gcd is : "+gcd);
    }
}
