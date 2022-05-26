public class Excr1 {

   // 1.Given a list of integers, return a list where each integer
   // is multiplied by 2.
   // doubling([1, 2, 3]) → [2, 4, 6]
   // doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
   // doubling([]) → []

    public static void main (String[] args){
        doubling (new int[]{1,2,3});
        doubling (new int[]{6,8,6,8,-1});
        doubling (new int[]{});
    }

    private static int[] doubling (int[] ints){
        int[] res = new int[ints.length];
        for (int i = 0; i < ints.length; i++){
            res[i] = ints[i] *2;

        }return res;
    }
}
