/*编程找出四位整数abed 中满足下述关系的数: 
 * (ab+cd) (ab+cd) =abcd
 */
public class abcd2 {
    public static void main(String[] args) {

        int Num, a, b, c, d, ab, cd, abcd;

        for(Num = 1000; Num <= 9999; Num++){

            a = Num / 1000;                                // 千位
            b = (Num - a * 1000) / 100;                    // 百位
            c = (Num - a * 1000 - b * 100) / 10;           // 十位
            d = (Num - a * 1000 - b * 100 - c * 10);       // 个位

            ab = (a * 10 + b);
            cd = (c * 10 + d);
            abcd = (ab + cd) * (ab + cd);

            if(abcd == Num)
                System.out.println(Num);    
        }

    }
}