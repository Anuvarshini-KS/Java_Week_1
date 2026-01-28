import java.util.*;
class day2
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the odd number");
        int n = sc.nextInt();
        if(n%2 != 0)
        {
            printPattern(n);
        }
        else {
            System.out.println("Please enter odd number");
        }
       System.out.println("Enter number for prime sieve : ");
       int num = sc.nextInt();
        primeSieve(num);
    }
    public static void printPattern(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void primeSieve(int num)
    {
        boolean[] prime = new boolean[num+1];
        for(int i=0;i<=num;i++)
        {
            prime[i] = true;
        }
        for(int i=2; i*i <= num ; i++)
        {
            if(prime[i])
            {
                for(int j = i*i ; j<=num ; j+=i)
                {
                    prime[j] = false;
                }
            }
        }
        for(int i=2;i<=num;i++)
        {
            if(prime[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}