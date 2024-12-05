package Sort;
/*
 * Idea:  Split the string till a single element by recursion remains and when merging compares the values
 * 
 * Algorithm: 
 *      1. Base condition if arr.length==1
 *      2. Take the mid element Split the arr into two by the mid element
 *      3. left and right divided arrays will  be sent to recurse using Arrays.copyOfRange()
 *      4. The function returns merge(left,right)
 * 
 *      Algo of merge():
 *          1. Create a ans array of size of left.size + right.size
 *          2. Three pointers for each arr(left,right,ans)
 *          3. Using wile loop, till either left/right's length becomes 0, compare the lements in left and right and add it to ans array
 *          4. If the lengths of two arr's mismatches, there can be remaining elements so do the above step for the remaining arr.
 */

import java.util.Arrays;

class MergeSort
{
    public static void main(String[] args) 
    {
        int arr[] = {9,8,7,6,5,4,3,2,1,5};
        int[] arr2 = mergeSort(arr);
        for(int i : arr2)
        {
            System.out.print(i+" ");
        }
    }

    static int[] mergeSort(int[] arr)
    {

        //base condition
        if(arr.length==1)
        {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeit(left, right);

    }

    public static int[] mergeit(int[] left, int[] right)
    {
        int[] ans = new int[left.length + right.length];
        int i = 0; 
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length)
        {
            if(left[i] < right[j])
            {
                ans[k] = left[i];
                i++;
            }else
            {
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }
}