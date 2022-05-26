import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class conditionsMain {
    public static void main (String[] args){
        int a=new Random().nextInt();

        String result ="a is " + a + " and its " + (a < 100 ? "less" : "greater") + " than 100";

String status;
        if (a<100) {
            status = "less";
        } else status = "greater";
        System.out.println(result);
    }
}
