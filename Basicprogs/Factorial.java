package Basicprogs;
public class Factorial {
    public static void main(String[] args) {
        int n = 2;
        // factorial(n);

        System.out.println(recFact(n));
    }

    public static void factorial(int n)
    {
        int ans = 1;
        for(int i = n; i>0; i--)
        {
            ans *= n;
            n--;
        }
        System.out.println("The facorial is : " + ans);
    }

    public static int recFact(int n)
    {
        //base condition
        if(n==1)
        {
            return n;
        }

        return n * recFact(n-1);
    }

    
    
}
