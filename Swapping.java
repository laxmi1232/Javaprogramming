public class Swapping2Number  {
    public static void main(String[] args) {
        int a=10, b= 20;
        System.out.println("Before swapping values are \n  : "+a+ " " +b);
        
        int t = a;
        a = b;
        b = t;
        System.out.println("After Swapping values are \n "+a+" "+b);
        
    }
}
