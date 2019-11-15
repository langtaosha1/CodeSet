/*求100 以内所有能被3整除但不能被5整除的数字的和*/

public class Division {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        for(i = 0; i <= 100; i++){
            if(i % 3 == 0 && i % 5 != 0)
                sum += i;
        }
        System.out.println("sum = " + sum);
    }
}