import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class problemSolving1{
  public static void main(String[] args) {
    // example data
    int [] X= {0,4,2,0};
    int [] Y= {0,0,1,4};
    int N=5;
    int M=5;

    int Z=solution(N,M,X,Y);
    System.out.println(Z);
  }


    public static int solution(int N, int M, int[] X, int[] Y) {
        int counterLines = 0;
        Arrays.sort(X);
        Arrays.sort(Y);
        if (X.length != 0 && X.length % 2 == 0) {
            for (int i = 1; i < N; i++) {

                if (X[(X.length / 2) - 1] < i && X[(X.length / 2)] >= i) {
                    counterLines++;
                }
            }
            for (int k = 1; k < M; k++) {
                if (Y[(Y.length / 2) - 1] < k && Y[(Y.length / 2)] >= k) {
                    counterLines++;
                }
            }
        }
        return counterLines;
      }
}
