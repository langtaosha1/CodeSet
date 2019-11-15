import java.util.*;
/*
 * 读入一个三位数，计算其各位数字之和。
 * 例如: 123, 各位数字之和为6
 */
public class SanWeiShu {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner s1 = new Scanner(System.in);
        int Num = s1.nextInt();
        
        if(Num >= 100 && Num <= 999){
            int Num1 = (Num / 100);                       // 获得百位上的数字
            int Num2 = (Num - Num1 * 100) / 10;           // 获得十位上的数字
            int Num3 = Num - ((Num1 * 100) + Num2 * 10);  // 获得个位上的数字
            int Sum = Num1 + Num2 + Num3;                  // 求和
            System.out.println(Num + "各位数字之和为:" + Sum);
        }
        else
            System.out.println("您输入的不是3位数！");
        
    }
}