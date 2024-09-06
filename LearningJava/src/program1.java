import java.util.*;
public class program1{
  boolean IsPrime(int n){
    int c = 0;
    for(int i=2;i<n/2;i++){
      if(n % i == 0) c++;
    }
    if(c > 0)return false;
    else return true;
  }

  public static void main(String[] args) {

    program1 pr = new program1();
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter n:");
    n = sc.nextInt();
    if(pr.IsPrime(n)) 
      System.out.println("Yes! The Number is Prime!!");
    else
      System.out.println("No! The Number is not Prime!!");

    sc.close();
  }
}