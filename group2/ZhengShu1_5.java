import java.util.*;
//import java.util.regex.*;
/*
 * 读入一个整数，
 * 如果是1~5之间，则分别输出5个福娃的名字，
 * 否则输出“北京欢迎你”。
 * */
public class ZhengShu1_5 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        // 如何判断输入的是否是整数？？？？？
        
        switch(a){
        case 1:System.out.println("贝贝");break;
        case 2:System.out.println("晶晶");break;
        case 3:System.out.println("欢欢");break;
        case 4:System.out.println("莹莹");break;
        case 5:System.out.println("妮妮");break;
        default:System.out.println("北京欢迎你过！");        
        }
    }
}