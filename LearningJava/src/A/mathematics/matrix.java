package mathematics;

public class matrix {
  public int[][] add(int[][] arr1, int[][] arr2){
    int[][] C = new int[20][20];
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 2; j++){
          C[i][j] = arr1[i][j] + arr2[i][j];
      }
    }
    return C;
  }

  public int[][] Subtract(int[][] arr1, int[][] arr2){
    int[][] C = new int[20][20];
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 2; j++){
          C[i][j] = arr1[i][j] - arr2[i][j];
      }
    }
    return C;
  }
}
