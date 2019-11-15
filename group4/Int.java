import java.util.*;
/*一个int 类型的整数由32个二进制位组成，每个二进制位的值要么为0要么为1。
 * 要求读入一个int类型的整数n，计算它的32个二进制位中总共有多少位为1?
 */
public class Int {
    public static void main(String[] args) {
        System.out.print("请输入一个int类型的整数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int n1 = n;
        
        while(n != 0) {
            sum = sum + n % 2;
            n = n / 2;
        }
        System.out.println(n1 + "的二进制位中总共有" + sum + "位为1");
    }
}