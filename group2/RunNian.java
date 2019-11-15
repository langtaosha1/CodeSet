import java.util.*;
/*
 *读入一一个表示年份的整数，判断这一年 是否是闰年。如何判断-一个年份是否是闰年:
 *1)如果这个年份能够被4整除，且不能被100 整除，则这一年是闰年。例如，  1996年是闰年，而相应的，  1993年就不是闰年。
 *2)如果这个年份能够被100整除，则这个数必须要能被400整除，才是闰年。例如，2000 年是闰年，  1900年不是闰年。
 */

public class RunNian {
    public static void main(String[] args) {
        System.out.println("请输入一个年份：");
        int Age;
        while(true){
            Scanner s = new Scanner(System.in);
            Age = s.nextInt();

            if(Age % 4 == 0 && Age % 100 != 0){ // 被4整除，且不能被100 整除
                System.out.println(Age + "年是闰年");
                continue;
            }
            else if(Age % 100 == 0 && Age % 400 == 0){ // 被100整除，且被400整除
                System.out.println(Age + "年是闰年");
                continue;
            }
            else
                System.out.println(Age + "年不是闰年");
        }
    }
}