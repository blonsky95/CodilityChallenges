import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class problemSolving5{

  public static void main(String[] args) {
      // example data
    int AX=0;
    int AY=0;
    int BX=-2;
    int BY=0;
    problemSolving5 o = new problemSolving5();

    String Z=o.solution(AX,AY,BX,BY);
    System.out.println("answer: " + Z);
  }

  public String solution(int AX, int AY, int BX, int BY) {
        int[] vectorAB = new int[2];
        vectorAB[0] = BX - AX;
        vectorAB[1] = BY - AY;
        int CX = 0;
        int CY = 0;
        int[] vectorBC = new int[2];
        int[] vectorABsimp = simplifier(vectorAB[0], vectorAB[1]);

        vectorBC[0] = vectorABsimp[1];
        vectorBC[1] = -vectorABsimp[0];

        CX = BX + vectorBC[0];
        CY = BY + vectorBC[1];

        String answer = CX + "," + CY;

        return answer;
    }

    private int[] simplifier(int i, int i1) {
        int[] vec = new int[2];

        if (i != 0 && i1 != 0) {

            int ix = i / GCD(Math.abs(i),Math.abs(i1));
            int i1x = i1 / GCD(Math.abs(i),Math.abs(i1));

            vec[0] = ix;
            vec[1] = i1x;
            return vec;

        }

        if (i == 0 || i1 == 0) {

            if (i == 0) {
                i1 = i1 / Math.abs(i1);
            }
            if (i1 == 0) {
                i = i / Math.abs(i);
            }
            vec[0] = i;
            vec[1] = i1;
            return vec;
        }
        return vec;

    }

    public int GCD(int a, int b) {
      if (b==0) {
        return a;
      }
        return GCD(b,a%b);
      }
}
