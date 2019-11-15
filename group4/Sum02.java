import java.util.*;
/*
 * 输入一个整数，计算它各位上数字的和。
 * (注意:是任意位的整数)
 */
public class Sum02 {
    public static void main(String[] args) {
        System.out.print("请输入任意一个整数：");
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int t = s.nextInt(); 
        
        while(t!=0){
            sum = sum + t % 10;
            t = t / 10;
        }
        System.out.println("各位数字的和：" + sum);
    }
}