/*【程序1】
题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？？
这是一个菲波拉契数列问题*/
public class rabbit{
	public static void main（String[] args）{
		System.out.println("第1个月的兔子对数：1");
		System.out.println("第2个月的兔子对数：1");
		int fl=1,f2=1,f,M=24;
		for(int i=3;i<=M;i++){
			f=f2;
			2=fl+f2;
			fl=f;
			System.out.println("第“+i个月的兔子对数："+f2);
		}
	}
}