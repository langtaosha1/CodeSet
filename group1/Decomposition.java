package com.test1;
import java.util.Scanner;

public class Decomposition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("键入一个正整数：");
        int n=s.nextInt();
        int  k=2;   
        while (k<=n){      
            if(k==n){ 
                System.out.print(n);
                break;
            }else if (n%k==0){  
                System.out.print(k+" ");
                n=n/k;
            }else k++; 
        }
	}

}