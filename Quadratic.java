// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        double D = b*b;
        D -= 4*a*c;
        ArrayList<Integer> roots = new ArrayList<>();
    
        
        if(D > 0) {
            D = Math.sqrt(D);
            int root1 = (int) Math.floor((-1.0*b + D) / (2.0*a));
            int root2 = (int) Math.floor((-1.0*b - D) / (2.0*a));
            
            if(root1 > root2) {
                roots.add(root1);
                roots.add(root2);
            } else {
                roots.add(root2);
                roots.add(root1);
            }
        } else if(D==0) {
            roots.add(b / (-2*a));
            roots.add(b / (-2*a));
        } else {
            roots.add(-1);
        }
        
        return roots;
    }
}
