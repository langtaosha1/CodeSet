package com.a;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
判断101-200之间有多少个素数，并输出所有素数。 

素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子。
 * */

public class A2 {
public static void main(String args[]){
    int i,j;     
    int n=0;
    int m=0;       
    for(i=101;i<=200;i++){            
    	for(j=1;j<=i;j++){		
            n=i%j;                    
            if(n==0)  {
            	m=m+1; 
            }     
        } 
        if(m==2){
    	     System.out.print(i+" "); 
        } 
    	m=0;            
    }  
       
    	}
   }