public class hannuota{
	public static void main(String[] agrs){
		T t = new T();
		t.move(5,'A','B','C');
	}
}

class T{
	//创建一个方法，无返回值，接收盘数，3个塔
	public void move(int i,char a, char b, char c){
		if(i == 1){
			// 如果只有一个盘，直接从a移动到c
			System.out.println(a + "-->" + c);
		}else{
			// 如果有多个盘，需要分为上面和最下面一个，这样的两组
			// 先把a塔 上面所有的放到b,中间借助c
			move(i-1,a, c, b);
			//再把最后一个放到c
			System.out.println(a + "-->" + c);
			// 再把 b 塔上的所有盘移动到c，中间借助a
			move(i-1,b, a, c);
		}

	} 
}