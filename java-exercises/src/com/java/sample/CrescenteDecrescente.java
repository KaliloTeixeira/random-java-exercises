package com.java.sample;

import java.util.Arrays;
import java.util.Scanner;

public class CrescenteDecrescente {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
/*        
        int x, y;

        x = read.nextInt();
        y = read.nextInt();
        while(x != y){
            if(x > y)
                System.out.println("Decrescente");
            else
                System.out.println("Crescente");
            x = read.nextInt();
            y = read.nextInt();
        }
*/
        int[] arr = {7,8,9,5,3,2,1,-3};

        System.out.println(solution(arr));
        
    }

    public static int solution(int[] A) {
        int menor = 1;
        Arrays.sort(A);

        for(int i=0; i<A.length; i++){
            if(A[i] == menor )
                menor++;
        }
        
        return menor;
    }
}

