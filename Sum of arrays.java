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
        
        int res[] = new int[Math.max(n1,n2)+1];
        
        int i = n1-1;
        int j = n2-1;
        int k = res.length - 1;
        int c = 0;
        
        while(i >= 0 || j >= 0){
            int r = c;
            
            if(i >= 0){
                r += a1[i];
                i--;
            }
            
            if( j>=0 ){
                r += a2[j];
                j--;
            }
            res[k] = (r)%10;
            c = (r)/10;
            k--;

        }
        
        res[k] = c;
        
        i = 0;
        
        //keep in looping till leading zeroes end
        while(i < res.length && res[i] == 0)
            i++;
        
        while(i < res.length)
            System.out.println(res[i++]);    
        
        
    }
}