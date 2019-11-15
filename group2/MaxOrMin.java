import java.util.Scanner;
/*
 * 读入三个整数，输出这三个整数中最大的一个.
 */
public class MaxOrMin {
    public static void main(String[] args) {
        System.out.println("请输入3个整数：");
        Scanner s = new Scanner(System.in);
        int[] Arr = new int[2];
        int i = 0;
        // 循环接收输入的数据
        for(i = 0; i <= 2; i++){ 
            Arr[i] = s.nextInt();
        }
        // 对数据进行判断
        if(Arr[0] >= Arr[1] && Arr[0] >= Arr[2] )
            System.out.println("最大整数：" + Arr[0]);
        else if(Arr[1] >= Arr[0] && Arr[1] >= Arr[2] )
            System.out.println("最大整数：" + Arr[1]);
        else
            System.out.println("最大整数：" + Arr[2]);
    }
}