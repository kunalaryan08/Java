import java.util.Scanner;

public class program3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int rows, columns;

    int[][] A = new int[10][10];
    int[][] B = new int[10][10];
    int[][] C = new int[10][10];
    // Taking input of rows and columns for A and B

    System.out.println("Enter # of rows for Matrix A and B: ");
    rows = sc.nextInt();
    System.out.println("Enter # of Columns for Matrix A and B: ");
    columns = sc.nextInt();

    // Elements input

    System.out.println("Enter Elements in the Matrix A:");
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
        A[i][j] = sc.nextInt();
      }
    }

    // Elements input

    System.out.println("Enter Elements in the Matrix B:");
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
        B[i][j] = sc.nextInt();
      }
    }

    // Adding Matrix

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
          C[i][j] = A[i][j] + B[i][j];
      }
    }

    // Displaying Output

    System.out.println("The Sum of both the Matrix is: ");
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
          System.out.print(C[i][j] + "  ");
      }
      System.out.println();
    }

    sc.close();
  }
}
