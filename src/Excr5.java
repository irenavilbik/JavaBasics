public class Excr5 {

    public static void main (String[] args) {

//        You have a green lottery ticket, with ints a, b, and c on it.
//                If the numbers are all different from each other, the result is 0. If all of
//        the numbers are the same, the result is 20.
//        If two of the numbers are the same, the result is 10.
//
//        greenTicket(1, 2, 3) → 0
//        greenTicket(2, 2, 2) → 20
//        greenTicket(1, 1, 2) → 10

        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(2, 2, 2));
        System.out.println(greenTicket(1, 1, 2));
    }

    private static int greenTicket ( int a, int b, int c ) {
        if ((a == b) && (a==c)){
            return 20;
        }
         if ((a== b) || (a==c) || (b == c)) {
            return 10;
        }
        return 0;
    }
}
