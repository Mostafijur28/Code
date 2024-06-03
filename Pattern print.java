import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int arr[][] = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //column
        for(int j=0; j<n; j++){
            
            if(j%2 == 0){
                
                for(int i=0; i<m; i++){
                    System.out.println(arr[i][j]);
                }
            }
            
            else{
               for(int i=m-1; i>=0; i--){
                    System.out.println(arr[i][j]);
                } 
            }
            
        }
    }
}