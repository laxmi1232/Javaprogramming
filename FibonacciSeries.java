import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args){
        int term,a=0,b=1,c;
        System.out.println("Enter Term");
        Scanner sc= new Scanner(System.in);
        term=sc.nextInt();
        for(int i= 1;i<=term;i++){
            System.out.println(a+ " ");
            c = a+b;
            a = b;
            b = c;
        }
        
    }
}
