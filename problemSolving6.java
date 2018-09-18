import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class problemSolving6{

  public static void main(String[] args) {
      // example data
    String A="{[()()[]]}";
    problemSolving6 o = new problemSolving6();

    int Z=o.solution(A);
    System.out.println("answer: " + Z);
  }

  public int solution(String A) {
       int lengthA = A.length();
       int loopL = (lengthA - 2) / 2;
       String braR = "()";
       String braS = "[]";
       String braC = "{}";
       int startIndex;
       String updStr = A;

       for (int i = 0; i <= loopL; i++) {
           if (updStr.length() == 0) {
               break;
           }
           if (!updStr.contains(braR) && !updStr.contains(braS) && !updStr.contains(braC)) {
               return 0;
           }
           if (updStr.contains(braR)) {
               startIndex = updStr.indexOf(braR);
               StringBuilder sb = new StringBuilder(updStr);
               sb.deleteCharAt(startIndex);
               sb.deleteCharAt(startIndex);
               updStr = sb.toString();

           }
           if (updStr.contains(braC)) {
               startIndex = updStr.indexOf(braC);
               StringBuilder sb = new StringBuilder(updStr);
               sb.deleteCharAt(startIndex);
               sb.deleteCharAt(startIndex);
               updStr = sb.toString();

           }
           if (updStr.contains(braS)) {
               startIndex = updStr.indexOf(braS);
               StringBuilder sb = new StringBuilder(updStr);
               sb.deleteCharAt(startIndex);
               sb.deleteCharAt(startIndex);
               updStr = sb.toString();

           }

       }
       return 1;


   }
}
