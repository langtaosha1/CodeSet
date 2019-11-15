import java.util.*;
/*
 * 读入一个整数，表示一个人的年龄。
 * 如果小于6岁,则输出“儿童”, 
 * 6岁到13岁，输出“少儿”;  
 * 14岁到18岁，输出“青少年”; 
 * 18岁到35岁，输出“青年”; 
 * 35岁到50岁，输出“中年”; 
 * 50 岁以上输出“中老年”。
 */
public class AgeChoose {
    public static void main(String[] args) {
        
        while(true){
            System.out.println("请输入年龄：");
            Scanner s = new Scanner(System.in);
            int Age = s.nextInt();
            
            if(Age < 0 ){
                System.out.println("输入错误！请重新输入!");
                continue;
            }
            else if(Age >= 0 && Age < 6){   // 如果小于6岁,则输出“儿童”
                System.out.println("儿童");
                break;
            }
            else if(Age >= 6 && Age <= 13){ // 6岁到13岁，输出“少儿”
                System.out.println("少儿");
                break;
            }
            else if(Age >= 14 && Age < 18){ // 14岁到18岁，输出“青少年”
                System.out.println("青少儿");
                break;
            }
            else if(Age >= 18 && Age < 35){ // 18岁到35岁，输出“青年”
                System.out.println("青年");
                break;
            }            
            else if(Age >= 35 && Age < 50){ // 35岁到50岁，输出“中年”
                System.out.println("中年");
                break;
            }
            else{                            // 50 岁以上输出“中老年”
                System.out.println("中老年");
                break;
            }
                            
        }
    }
}