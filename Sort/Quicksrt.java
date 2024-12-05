package Sort;
// Idea: 
//  *     Take a pivot element, usually a mid element and if the left side of elemtn is bigger than this, 
//  *      then swap its vice versa on the other side
//  * Algorith: 
//  * 
//  *      //base condition
//  *        when low>=high, return
//  * while(start<end):
//  *      pointers for low, end and a pivot element.
//  *      if left side of pivot element is smaller, then start++; 
//  *      if right side of pivot element is bigger, then end--;
//  *      After doing this,
//  *       swap right and left
//  * 
//         * then recurse (arr,low, end)
//         * recurse(arr, start,high)
//  * 
public class Quicksrt {
    public static void main(String[] args) 
    {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        qcksrt(arr,0,arr.length-1);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void qcksrt(int[] arr, int start, int end)
    {
        int low = start;
        int high = end;
        int midIdx = (start+end)/2;
        int pivot = arr[midIdx];
        //base condition
        if(start>=end)
        {
            return;
        }
        while(low<high)
        {
            
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                BubbleSort.swap(arr, low, high);
                low++;
                high--;
            }
            
        }

        qcksrt(arr, start, high);
        qcksrt(arr, low, end);

    }
    
}
