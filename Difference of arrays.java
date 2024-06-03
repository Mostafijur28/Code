import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // size of array
        int a1[] = new int[n1];
        
        
        for(int i=0; i<n1; i++){
            a1[i] = sc.nextInt();
        }
        
        int n2 = sc.nextInt(); // size of array
        int a2[] = new int[n2];
        
        
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }
        
        int res[] = new int[Math.max(n1,n2)];
        
        int i = a1.length - 1; // a1
        int j = a2.length-1; // a2
        int k = res.length - 1; //res
        int c = 0; // borrow
        
        while(i >= 0 || j>=0){
            
            int r = a2[j] + c;
            j--;
            
            if(i >= 0){
                
                //borrow from next available index
                if(a1[i] > r){
                    r += 10;
                    c = -1;
                }
                else{
                    c = 0;
                }
                
                r -= a1[i];
                
                i--;
                    
            }
            
            res[k--] = r; 
            
        }
        
        i = 0;
        while(i<res.length && res[i] == 0)
            i++;
        
        if(i == res.length)
            System.out.println(0);
        
        for(j=i; j<res.length; j++)
            System.out.println(res[j]);
        
        
    }
}