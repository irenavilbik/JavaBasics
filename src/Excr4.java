public class Excr4 {

//    4.Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
//    The string length will be at least 3.
//    middleThree("Candy") → "and"
//    middleThree("and") → "and"
//    middleThree("solving") → "lvi"


    public static void main (String[] args){
        middleThree("Irena");
    }
    public static String middleThree (String str){

        int length = str.length();
        if (length < 3 || length %2 ==0) {
            throw new IllegalArgumentException("cannot be shorter than 3 letter or lenght is even");
        }

            int middle = (length / 2);
            int premiddle = middle-1;
            int postmiddle = middle +1;


        return " " +str.charAt(premiddle)+str.charAt(middle)+str.charAt(postmiddle);
     }
}
