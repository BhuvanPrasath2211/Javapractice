package Sort;
/*
 * Algorithm: Pick the min/max value in a array and plce it in its right place(start/end)
 * Initate a for loop to iterate for all the nums in the array
 * Then fselect a num by making another for loop for max/min
 * then swap the number to crct pos
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,-8,7,6,5,4,3,1};
        insrt(arr);
        for(int i: arr)
        {
            System.out.print(i);
        }
    }

    public static void insrt(int[] arr)
    {
        //Iterating the array
        for(int i = 0; i<arr.length; i++)
        {
            //Selecting the min value
            int start = i; 
            int min = minOf(arr,start);//The min value is fetched
            swap(arr,start,min);
        }
    }

    public static int minOf(int[] arr, int start)
    {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i = start; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
                ans = i;
            }
        }

        return ans;
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =  temp;
    }
}
