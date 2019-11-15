import java.util.*;
/*
 *  托运计费问题:
 *  当货物重量小于20公斤的时候，收费5元，
 *  大于20公斤小于100公斤的时候超出20公斤的部分按每0.2元每公斤计费，
 *  如果超出100公斤的时候，超出的部分按照每公斤0.15元计算。
 *  读入贷物的重量，输出计算之后货物的运费。
 */
public class YunFei {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入：");
        int weight = s.nextInt();
        double price = 0;
        
        if(weight < 0)
            System.out.println("输入不合法");
        else{
            if(weight <= 20){
                price = weight * 0.35;
            }
            else if(weight >= 20 && weight<= 100){
                price = weight * 0.35 + (weight - 20) * 0.5; 
            }
            else{
                price = weight * 0.35 + (weight - 20) * 0.5 + (weight - 100) * 0.8;
            }
        }    
        System.out.println(price);            
    }
}