import java.util.Arrays;
import java.util.Random;

public class TestMyArrays {
    public static void main(String[] args) {

        Random random = new Random();
        final int SIZE = 100000;
        final int TESTS = 100;

        int [] values = new int[SIZE];
        long [] times = new long[TESTS];

        long sTime;
        long fTime = 0;
        long aTime = 0;
        long sumOfTimes = 0;

        for(int j = 0; j < times.length; j++)
        {
            for(int i = 0; i < values.length; i++)
            {
                values[i] = i;
            }

            sTime = System.currentTimeMillis();

            Arrays.sort(values);

            fTime = System.currentTimeMillis() - sTime;

            times[j] = fTime;
        }

        for(int x = 0; x < times.length; x++)
        {
            sumOfTimes += times[x];
        }

        System.out.println("Average Time - " + (sumOfTimes/TESTS) + " ms");
        /*for (int i=0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }*/

        /*MyArrays.insertionSort(values);

        for (int i=0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }*/

        //int index = MyArrays.binarySearch(values, searchKey);

        //if(index != -1)
        //{
        //    System.out.println("Value " + searchKey + " is found at position " + index);
        //}
        //else
        //{
        //    System.out.println("Value " + searchKey + " was not found");
        //}

        /*MyArrays.mergeSort(values);

        for (int i=0; i < values.length; i++)
        {
            System.out.println(values[i]);
        }*/

    }
}
