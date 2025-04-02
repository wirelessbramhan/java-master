import java.util.HashMap;

public class Solver
{
    //Find Count of Duplicate element WITHOUT hashing.
    static int[] arr = { 4, 1, 3, 2, 5};
    static int count = 0;

    public static void main(String[] args)
    {
        int totalCost = 100;
        int number = 60000;
        double unitCost = (double) totalCost / number;
        System.out.println("Cost of one apple is : " + unitCost);

//        //Array Sorted
//        for (int indexer = 0; indexer < arr.length; indexer++)
//        {
//            Swap(indexer, indexer + 1);
//        }
    }

    static void Swap(int indexA, int indexB)
    {
        if (indexB < arr.length)
        {
            //swapping
            int temp = 0;

            //number greater, swap. Makes it SORTED.
            if (arr[indexA] > arr[indexB])
            {
                temp = arr[indexB];
                arr[indexA] = arr[indexB];
                arr[indexB] = temp;
            }
        }
    }
}

