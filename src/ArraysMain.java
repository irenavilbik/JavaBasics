import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysMain {
    public static void main (String[] args){
        int[] arr1;
        arr1 = new int[5];
        arr1[4]=5;
        arr1[0]= 1;
        arr1[2]= 3;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.asList(arr1));
int[] arr2 = new int[7];//is karto nurodai kad tai bus skaiciu int masyvas
int[] arr3 = {1,2,3,4};
int[] arr4 = new int []{0,3,8,4,5,4,8};
 int[] array= new int[] {};
        int i, j = 0;

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.toString(arr4));
}
    }

