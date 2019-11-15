import java.util.Arrays;
import java.util.Scanner;

public class Decomposition {

	public static void main(String[] args) {

	System.out.println("请输入10个数（用空格隔开）：");

		   int[] arr=new int[10];

		   Scanner scanner=new Scanner(System.in);

		   for (int i = 0; i < 10;i++) {

		       arr[i]=scanner.nextInt();

		   }

		   //对数组进行排序

		   int temp=0;//交换数

		   for (int i = 0; i < 9;i++) {

		       for (int j = i+1; j < arr.length;j++) {

		          if (arr[i]>arr[j]) {  //如果第一个数比后面的数大就交换

		              temp=arr[i];

		              arr[i]=arr[j];

		              arr[j]=temp;

		          }

		       }

		   }

		   System.out.println(Arrays.toString(arr));

}
}