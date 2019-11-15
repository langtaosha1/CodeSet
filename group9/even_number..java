//题目：判断一个偶数能被几个2整除   

import java.util.*;
public class even_number { 
public static void main (String[] args) { 
   Scanner s = new Scanner(System.in);
   System.out.print("请输入一个偶数：");
    int num = s.nextInt();
    int   tmp = num;
    int count = 0; 
       for(int i = 0 ; tmp%2 == 0 ;){
           tmp = tmp/2;
            count ++;
          }
     System.out.println(num+" 能够被 "+count+" 个2整除。");
     }
} 
