// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Factorial obj=new Factorial();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Factorial
{
    
    public int digitsInFactorial(int N)
    {
        //Your code here
        double ans = 0.0;
        while(N>1) {
            ans += Math.log10(N);
            N--;
        }
        
        return 1 + (int)ans;
    }

}
// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Factorial obj=new Factorial();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Factorial
{
    
    public int digitsInFactorial(int N)
    {
        //Your code here
        double ans = 0.0;
        while(N>1) {
            ans += Math.log10(N);
            N--;
        }
        
        return 1 + (int)ans;
    }

}
