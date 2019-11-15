import java.util.*;
/*方法1
 *5、完成一个简单的计算器程序。程序要求如下:
  1)读入两个整数
  2)提示用户选择对这两个整数的操作，即输出
 　　1、+
　　 2、-
　　 3、*
　　 4、/
  请输入您的选择:
  读入用户的选择，输出运算结果。
 */
public class Operate4 {    
    public static void main(String[] args) {
        double Num_1, Num_2;
        int Operate = 1;
        System.out.println("请输入要运算的整数：");
        Scanner s = new Scanner(System.in);
        Num_1 = s.nextDouble();
        Num_2 = s.nextDouble();
        
        System.out.println(" 1、+\n 2、-\n 3、*\n 4、/\n 请输入您的选择:");
        Scanner s2 = new Scanner(System.in);
        
        Operate = s2.nextInt();
        if(Operate >4 && Operate < 1)
            System.out.println("运算方式选择错误！");
        else{
            switch(Operate){
            case 1:
                System.out.println(Num_1 + " + " + Num_2 + " = " + (Num_1 + Num_2));break;
            case 2:
                System.out.println(Num_1 + " - " + Num_2 + " = " + (Num_1 - Num_2));break;
            case 3:
                System.out.println(Num_1 + " * " + Num_2 + " = " + (Num_1 * Num_2));break;
            case 4:
                System.out.println(Num_1 + " / " + Num_2 + " = " + (Num_1 / Num_2));break;
　　　　　　  default:System.out.println("符号非法！");
            }
        }
    }
}