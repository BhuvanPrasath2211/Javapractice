package Sort;
/*
 * Question:L Cyclic sort
 * Idea: 
 *      Assuming arr is rangingn 1 to n;
 *      Chck if the element is in the right position, i.e when we do n-1, we get the position
 */
public class Cyclicsort {
    public static void main(String[] args) 
    {
        int[] arr = {5,4,3,2,1};
        cycsrt(arr);
        for(int i : arr)
        {
            System.out.print(i);
        }
    }

    public static void cycsrt(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != i+1)
            {
                BubbleSort.swap(arr, i, arr[i]-1);
            }
        }
    }
}
