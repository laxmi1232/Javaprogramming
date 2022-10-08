
// Palindrome Program in java

import java.util.Scanner;
class A {
    public static void main(String[] args) {
        int n,s=0,c,r;
        System.out.println("enter the number");
        Scanner ref =new Scanner(System.in);
        n = ref.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
           s= (s*10)+r;
           n=n/10;
           
        }
        if(c==s)
        System.out.println("Palindrome number");
        else
        System.out.println("Not Palindrome");
    }
}
