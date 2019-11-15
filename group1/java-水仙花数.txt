package com.a;

import java.util.Scanner;

public class A1 {

	/**
     * Ë®ÏÉ»¨
     */
		public static void main(String args[]){ 
	       int a;
	       int sum=0;
	       int i,j,k;
	       for(a=100;a<=999;a++){
	           i=a/100;
	           j=(a-i*100)/10;
	           k=a-i*100-j*10;
	           sum=i*i*i+j*j*j+k*k*k; 
	           if(sum==a){
	             System.out.print(sum+" ");
	            }
	           
	       }
		}}