public class Palindrome {
    public static void main(String[] args) {
        String str = "AlA";
        
        String strRev = new StringBuffer(str).reverse().toString();
        if(str.equals(strRev))
        System.out.println("Polindrome");
        else
        System.out.println("Not a Palindrome");
        
    }
}
