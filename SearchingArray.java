// Arrays Searching in java

import java.util.Scanner;

public class Searching {
     public static void main(String[] args){
         
         int ids[] = {1,2,4,3,5,6,7,9,8};
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the  your id");
         
         int value = sc.nextInt();
         boolean flag = false;
         
         for(int i =0; i<ids.length; i++){
             if(ids[i] == value){
                 flag = true;
                 break;
                 
             }
         }
         if(flag)
         {
             System.out.println("you are valid Student");
             
         }
         else {
             System.out.println("you are not valid ");
         }
     }
}
