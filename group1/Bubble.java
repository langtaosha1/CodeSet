import java.util.Arrays;
import java.util.Scanner;

public class Decomposition {

	public static void main(String[] args) {

	System.out.println("������10�������ÿո��������");

		   int[] arr=new int[10];

		   Scanner scanner=new Scanner(System.in);

		   for (int i = 0; i < 10;i++) {

		       arr[i]=scanner.nextInt();

		   }

		   //�������������

		   int temp=0;//������

		   for (int i = 0; i < 9;i++) {

		       for (int j = i+1; j < arr.length;j++) {

		          if (arr[i]>arr[j]) {  //�����һ�����Ⱥ��������ͽ���

		              temp=arr[i];

		              arr[i]=arr[j];

		              arr[j]=temp;

		          }

		       }

		   }

		   System.out.println(Arrays.toString(arr));

}
}