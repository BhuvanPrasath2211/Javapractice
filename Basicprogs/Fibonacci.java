package Basicprogs;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        
        //fibo(n);
        // for(int i = 2; i<n; i++)
        // {
        //     System.out.print(revFibo(i)+" ");
        // }

        
        System.out.println("The sum of fibo : " + fiboSum(n));
    }

    public static void fibo(int n)
    {
        System.out.print("0 ");
        int x = 0;
        int y = 1;
        int ans = 0;
        for(int i=2; i<n; i++)
        {
            ans = x+y;
            y=x;
            x=ans;
            System.out.print(ans+" ");
        }  
    }
    
    public static int revFibo(int n)
    {
        if(n<=1)
        {
            return 1;
        }

        return revFibo(n-1) + revFibo(n-2);
    }

    public static int fiboSum(int n)
    {
       
        int x = 0;
        int y = 1;
        int ans = 0;
        int sum = 0;
        for(int i=2; i<n; i++)
        {
            ans = x+y;
            y=x;
            x=ans;
        } 
        sum+=ans;
        
        return sum;
    }
}
