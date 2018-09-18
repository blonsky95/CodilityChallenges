import java.util.Arrays;
import java.util.Stack;


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class problemSolving4{

  public static void main(String[] args) {

      // example data
    String instructions="5 4 + POP 11 DUP +";
    problemSolving4 o = new problemSolving4();

    int Z=o.solution(instructions);
    System.out.println("answer: " + Z);
  }


  public int solution(String S) {
       int x1 = 0;
       int x2 = 0;

       int y1 = 0;
       int y2 = 0;

       int z = 0;

       int w = 0;

       String segmentS = "";

       Stack<Integer> stackS = new Stack<Integer>();

       int numCommands = S.length() - S.replace(" ", "").length() + 1;
       for (int k = 0; k < numCommands; k++) {
           if (k == numCommands - 1) {
               segmentS = S.substring(0, S.length());
           } else {
               segmentS = S.substring(0, S.indexOf(" "));
           }

           if (segmentS.matches("POP") || segmentS.matches("DUP") || segmentS.matches("\\+") || segmentS.matches("-")) {
               if (segmentS.matches("POP")) {
                   if (stackS.isEmpty()){
                       return -1;
                   }
                   stackS.pop();
               }

               if (segmentS.matches("DUP") && !stackS.isEmpty()) {
                   if (stackS.isEmpty()){
                       return -1;
                   }
                   z = stackS.peek();
                   stackS.push(z);
               }
               if (segmentS.matches("\\+")) {
                   if (stackS.size()<2){
                       return -1;
                   }
                   x1 = stackS.peek();
                   stackS.pop();
                   x2 = stackS.peek();
                   stackS.push(x1 + x2);

               }
               if (segmentS.matches("-")) {
                   if (stackS.size()<2){
                       return -1;
                   }
                   y1 = stackS.peek();
                   stackS.pop();
                   y2 = stackS.peek();
                   
                   int resulty=y1-y2;
                   if (resulty<0) {
                       return -1;
                   }
                   stackS.push(y1 - y2);
               }
           } else {
               w = Integer.parseInt(segmentS);
               stackS.push(w);
           }
           S = S.substring(S.indexOf(" ") + 1, S.length());
       }
       System.out.println("size: " + stackS.size());

       return stackS.peek();
   }
}
