package Sort;
/*
 * Idea : temporarily swap the last ele with second last element & at last swap the i with max.
 * 
 * Algo: 
 *      The Array must be already sorted
 *      1.For all ele in arr
 *      2.Max = last element, n = last idx
 *      3.Till n <n, temp swap elements
 *      4.At last swap the last element with ith element
 *      5.So the first two elements are updated so i=i+2;
 */
public class AlternateSort {
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        altsrt_v1(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }

    //Stupid to use for in inner loop
    public static void altSrt(int[] arr)
    {
        for(int i = 0; i<arr.length; i+=2)
        {
            int endidx = arr.length-1;
            int bigval = arr[endidx];
            for(int j = arr.length-1; j>i;j--)
            {
                arr[j] = arr[j-1]; 
            }
            arr[i] = bigval;
        }
    }
    
    public static void altsrt_v1(int[] arr)
    {
        //the right way
        for(int i = 0; i<arr.length; i+=2)
        {
            int endidx = arr.length-1;
            int temp = arr[endidx];

            while(endidx>i)
            {
                arr[endidx] = arr[endidx-1];
                endidx--;
            }

            arr[i] = temp;
        }
    }
}
