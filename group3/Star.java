import java.util.*;
/*
读入一一个整数n，输出如下图形:
当输入n=3时，输出:
      ★
   ★★★
★★★★★
当输入n=4时，输出:
        ★
     ★★★
   ★★★★★
★★★★★★★
*/
public class Star {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(" "); // 换行
            
            for(int w = 1; w <= (n + 1 - i); w++){ // 打印空格
                System.out.print("    ");
            }
                
            for(int j = 1; j <= (i*2-1); j++){     // 打印星星
                System.out.print("★");
            }
                
        }
    }
}