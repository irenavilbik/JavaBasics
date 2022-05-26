public class Excr3 {
    public static void main (String[] args)  {
//        Given 2 strings, a and b, return a new string made of the
//    first char of a and the last char of b, so "yo" and "java" yields "ya".
//            If
//        either string is length 0, use '@' for its missing char.
//        lastChars("last", "chars") → "ls"
//        lastChars("yo", "java") → "ya"
//        lastChars("hi", "") → "h@"

        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }
    private static String lastChars (String str1, String str2) throws IllegalArgumentException {

        char defaultChar = '@';
        char firstChar = str1.isEmpty() ? defaultChar : str1.charAt(0);
        char lastChar = str2.isEmpty() ? defaultChar : str2.charAt(str2.length()-1);

        return ""+ firstChar + lastChar;
    }
    }
