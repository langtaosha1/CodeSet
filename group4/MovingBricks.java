/*搬砖问题: 
 * 36块砖，36人搬，
 * 男搬4，女搬3，两个小孩拾1砖，
 * 要求一次全搬完，
 * 问男、女和小孩各若干?
 */
public class MovingBricks {
    public static void main(String[] args) {
        int Man;
        int Woman;
        
        for(Man = 0; Man <= 9; Man++){
            for(Woman = 0; Woman <= 12; Woman++){
                if(Man * 4 + Woman * 3 + (36 - Man - Woman) / 2 == 36)
                    System.out.println("Man:" + Man + "    Woman:" + Woman + "      Childen:" + (36 - Man - Woman));
            }
        }
    }
}