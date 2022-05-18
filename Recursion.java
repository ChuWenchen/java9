public class Recursion{
	public static void main(String[] agrs){
		T t = new T();
		int j = t.factorial(5);
        System.out.println(j);
	}
}


class T{
	public int factorial(int x){
		if(x == 1){
			return 1;
		}else{
			return factorial(x-1) * x;
		}
	}
}