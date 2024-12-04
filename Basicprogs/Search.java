package Basicprogs;
public class Search {
    public static void main(String[] args) 
    {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        //linerarSrch(arr, 6);
        
        int[] arr1 = {1,2,3,4,5,6,7,8,9};

        binarySearch(arr1, 7);

    }

    public static void linerarSrch(int[] arr, int target)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]==target)
            {
                System.out.println("The target is present in: " + i);
            }
        }
    }

    public static void binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length;
        
        while(start<=end)
        {
            int mididx = (start+end)/2;

            if(arr[mididx] == target)
            {
                System.out.println("The target is present in: " + mididx);
                break;
            }
            else if(arr[mididx]>target)
            {
                end = mididx-1;
                
            }else if(arr[mididx]<target)
            {
                start= mididx+1;
               
            }else{
                System.out.println("Not in the array");
                break;
            }
        }

    }
}
