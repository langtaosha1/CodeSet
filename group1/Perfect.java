package com.test1;

public class Decomposition {

	public static void main(String[] args) {
for (int i = 1; i <=1000;i++) {
	       int sum=0;
	       for (int j = 1; j < i/2+1; j++) {
	          if (i%j==0) {
	              sum=sum+j;
	              if (i==sum) {
	                 System.out.print(i+" ");
	              }
	          }
	       }
	   }
}
}