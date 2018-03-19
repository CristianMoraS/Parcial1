package parcial;

import java.util.*;

public class Subarrays {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size, sub, rta, N = 10000 ;
        int[] A = new int[N];
        
        size = sc.nextInt();
        sub = sc.nextInt();
        
        for(int i = 0 ; i < size; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < (size - sub + 1); i++){
            rta = A[i];
            
            for(int j = i; j < (i + sub); j++){
            	
                if(A[j] > rta){
                    rta = A[j];
                }
            }
            System.out.print(rta + " ");
        }
    }
}