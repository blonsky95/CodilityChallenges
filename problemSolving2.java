import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public class problemSolving2{

  public static void main(String[] args) {

      // example data
    int [] X= {3,3,3,1,5,6};
    int [] Y= {3,7,4,3,3,3};
    problemSolving2 o = new problemSolving2();

    int Z=o.solution(X,Y);
    System.out.println("answer " + Z);
  }


  public int solution(int[] A, int[] B) {

     int max1 = 0;
     int max2 = 0;
     int i = 0;
     int[] arrChosen = new int[A.length];

     boolean end = false;

     while (max1 < (A.length) / 2 && !end) {
         if (!contains(B, A[i]) && !contains(arrChosen, A[i])) {
             arrChosen[max1] = A[i];
             max1++;
             i++;
         } else {
             i++;
         }
         if (i == A.length) {
             end = true;
         }
         System.out.println("current max1 " + max1+" "+end);

     }
     for (int k = 0; k < A.length; k++) {
         if ((!contains(arrChosen, B[k]) && !contains(A, B[k]) && max2 < A.length / 2)) {
             arrChosen[max1 + max2] = B[k];
             max2++;
         }
         if ((!contains(arrChosen, B[k]) && contains(A, B[k]) && max1 == A.length / 2)) {
             arrChosen[max1 + max2] = B[k];
             max2++;
         }
         if (!contains(arrChosen, B[k]) && contains(A, B[k]) && max1 < A.length / 2) {
             arrChosen[max1 + max2] = B[k];
             max1++;

         }
     }
     return max1 + max2;
 }
 public boolean contains(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

}
