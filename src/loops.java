public class loops {
    public static void main(String[] args) {
        doWhileLoop();


    }

//private static void whileAndForLoops() {
//    int i = 1;
//    while (i <= 5) {
//        System.out.println("i = " + i);
//        i++;
//    }
//    System.out.println("\nfor:");
//    for (int j = 1; j <= 5; j++) {
//        System.out.println("i = " + j);
//    }

    private static void doWhileLoop() {

        int k = 2, sum  = 0;
        do {
            sum += k;
            k+=2;
        } while(k<=8)  ;
        System.out.println("2+4+6+8+10.....+100 is equal " + sum);
        int x= 1/2;
        System.out.println(x);


        System.out.print(5 % 2 + "stai");
    }

}





