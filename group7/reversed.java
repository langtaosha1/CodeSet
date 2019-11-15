//题目：将一个数组逆序输出。   
import java.util.*;
public class reversed {
public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int a[] = new int[20];
System.out.println("请输入多个正整数（输入-1表示结束）：");
   int i=0,j;
   do{
      a[i]=s.nextInt();
      i++;
   }while (a[i-1]!=-1);
   
   System.out.println("\n数组逆序输出为：");
   for( j=i-2; j>=0; j=j-1) {
    System.out.print(a[j]+"   ");
}
    }
   }
