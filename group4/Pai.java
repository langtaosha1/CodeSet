/*计算圆周率
 * 中国古代数学家研究出了计算圆周率最简单的办法:
 * PI=4/1-4/3+4/5-4/ 7+4/9-4/11+4/13-4/15+4/17......
 * 这个算式的结果会无限接近于圆周率的值,
 * 我国古代数学家祖冲之计算出,圆周率在3.1415926和3.1415927之间，
 * 请编程计算,要想得到这样的结果，他要经过多少次加减法运算?*/
public class Pai {
    public static void main(String[] args) {         
        final double a = 4.0; //表示被除数
        double PI = 0;  //表示圆周率        
        int b = -1;     //表示除数        
        int count = 0;  //加减法次数计数变量
 
        while (PI >= 3.1415927 || PI <= 3.1415926) {
            b +=2;
            PI = PI + a/b;
            count++;
            
            b += 2;
            PI = PI - a/b; 
            count++;
        }
        System.out.println("总共需要经过" + count +"次加减法运算");
    }
}