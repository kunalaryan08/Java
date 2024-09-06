import java.util.Scanner;

public class program2 {
    boolean checkPalindrome(int n){
    int temp = n;
    int rev = 0;
    while(n > 0){
      rev = rev * 10 + (n % 10);
      n /= 10;
    }
    if(rev == temp) return true;
    else return false;
  }

  public static void main(String[] args) {
    
    program2 P = new program2();
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.println("Enter the Number: ");
    n = sc.nextInt();

    if(P.checkPalindrome(n))
      System.out.println("Yes! The Number is Palindrome.");
    else 
      System.out.println("No! The Number is not Palindrome.");

      sc.close();
  }
}
