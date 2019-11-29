import java.util.*;
/*读入一个小于10的整数n,输出它的阶乘n!*/

public class Factorial {
    public static void main(String[] args) {
        System.out.print("请输入一个10以内的数字：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;
        if(n <10 && n > 0){
            for(int i = n; i > 0; i--){
                sum *= i;
            }
            System.out.println(sum);
        }
        else
            System.out.println("输入错误！");
    }
}