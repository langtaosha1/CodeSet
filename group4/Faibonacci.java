import java.util.*;
/*已知: faibonacci ( 费波那契)数列的前几个数分别为0，1, 1，2，3，..... 
 * 从第3项开始，每一项都等于前两项的和。
 * 读入一个整数n，编程求出此数列的前n项。*/
public class Faibonacci {
    public static void main(String[] args) {
        System.out.print("请输入一个整数n：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        a[0] = 0;
        a[1] = 1;
        System.out.println(a[0] + "\n" + a[1]);
        
        if(n < 2) {
            System.out.println("请输入大于2的整数！");
        }
        else {
            for(int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
                System.out.print(a[i]);
            }
        }
    }
}