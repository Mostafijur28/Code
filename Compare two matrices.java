import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m1 = sc.nextInt();
        
        int a1[][] = new int[n1][m1];
        
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                a1[i][j] = sc.nextInt();
            }
        }
        
        int n2 = sc.nextInt();
        int m2 = sc.nextInt();
        
        int a2[][] = new int[n2][m2];
        
        for(int i=0; i<n2; i++){
            for(int j=0; j<m2; j++){
                a2[i][j] = sc.nextInt();
            }
        }
        
        if(n1 != n2 || m2 != m1){
            System.out.println("Not Same");
        }
        
        else{
            
            boolean flag = true;
            
            for(int i=0; i<n1; i++){
                
                for(int j=0; j<m1; j++){
                    
                    if(a1[i][j] != a2[i][j]){
                        flag  = false;
                        break;
                    }
                }
                
                if(flag == false)
                    break;
            }
            
            if(flag == true){
                System.out.println("Same");
            }
            else{
                System.out.println("Not Same"); 
            }
            
        }
    }
}