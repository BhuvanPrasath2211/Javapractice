package Sort;
/*
 * Algorith: 
 *      1. Traverse throught the array twice, nested loop...loop for each element
 *      2. Checks for the min element between current and next element
 *      3. Swaps the min element to front.
 */

public class BubbleSort 
{
    public static void main(String[] args) 
    {
       int[] arr = {9,8,7,6,5,4,3,1};
       bSort(arr); 
       for(int i : arr)
       {
           System.out.print(i+" ");
       }
    }

    public static void bSort(int[] arr)
    {
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = 0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
