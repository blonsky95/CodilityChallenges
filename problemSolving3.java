import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class problemSolving3{

  public static void main(String[] args) {

      // example data
    int [] X= {3,3,3,1,5,6};
    int [] Y= {3,3,4,3,3,3};
    problemSolving3 o = new problemSolving3();

    int Z=o.solution(X,Y);
    System.out.println("answer " + Z);
  }


  public int solution(int[] A, int[] B) {
          int[] arrDoubles = new int[7];
          int[] arrSingles = new int[7];

          for (int i = 0; i < A.length; i++) {
              if (A[i] == B[i]) {
                  arrDoubles[A[i]]++;
              } else {
                  if (arrSingles[A[i]] < 2) {
                      arrSingles[A[i]]++;
                  }
                  if (arrSingles[B[i]] < 2) {
                      arrSingles[B[i]]++;
                  }
              }
          }
          int max = 0;
          for (int j = 0; j < 7; j++) {
              int count = arrDoubles[j] * 2 + arrSingles[j];
              if (count >= max) {
                  max = count;
              }
          }
          return max;

      }



}
