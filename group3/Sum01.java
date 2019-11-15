/*计算1+2+3+...+100的和*/
public class Sum01 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}