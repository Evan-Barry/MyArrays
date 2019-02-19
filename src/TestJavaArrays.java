import java.util.Arrays;

public class TestJavaArrays {
    public static void main(String[] args) {

        int array[] = new int[10];
        array[0] = 524;
        array[1] = 76;
        array[2] = 737;
        array[3] = 286;
        array[4] = 1;
        array[5] = 759;
        array[6] = 3402;
        array[7] = 7561;
        array[8] = 3458;
        array[9] = 9686;

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        //expected - 1, 76, 286, 524, 737, 759, 3402, 3458, 7561, 9686

        array[0] = 524;
        array[1] = 76;
        array[2] = 737;
        array[3] = 286;
        array[4] = 1;
        array[5] = 759;
        array[6] = 3402;
        array[7] = 7561;
        array[8] = 3458;
        array[9] = 9686;

        Arrays.sort(array, 2, 5);

        System.out.println(Arrays.toString(array));
        //expected - 524, 76, 1, 286, 737, 759, 3402, 7561, 3458, 9686

    }
}
