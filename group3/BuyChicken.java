/*“百钱买百鸡”是我国古代的著 名数学题。
 * 题目这样描述:
 *  3文钱可以买1只公鸡，
 *  2文钱可以买一只母鸡，
 *  1文钱可以买3只小鸡。
 *  用100文  钱买100只鸡，
 *  那么各有公鸡、母鸡、小鸡多少只?
 */

public class BuyChicken {
    public static void main(String[] args) {
        int GJ;
        int MJ;
        //int XJ = (100 - GJ - MJ);    //GJ + MJ + XJ == 100;            

        for(GJ = 0; GJ <= 33; GJ++){
            for(MJ = 0; MJ <= 50; MJ++){
                if(GJ * 3 + MJ * 2 + (100 - GJ - MJ)/3.0 == 100)
                    System.out.println("公鸡：" + GJ + "    母鸡：" + MJ + "    小鸡：" + (100 - GJ - MJ));
            }
        }        
    }
}