public class TestMyArrays {
    public static void main(String[] args) {
        
        int [] values = new int[5];
        values[0] = 16;
        values[1] = 9;
        values[2] = 17;
        values[3] = 11;
        values[4] = 8;
        
        int currentSize = 5;
        int searchKey = 9;
        
        //currentSize = MyArrays.insert(values, currentSize, 10, 2);
        //expected output 1,4,10,15,23,55

        MyArrays.insertionSort(values);

        for (int i=0; i < currentSize; i++)
        {
            System.out.println(values[i]);
        }

        int index = MyArrays.binarySearch(values, searchKey);

        if(index != -1)
        {
            System.out.println("Value " + searchKey + " is found at position " + index);
        }
        else
        {
            System.out.println("Value " + searchKey + " was not found");
        }


        }


}
