public class Recursion02{
	public static void main(String[] agrs){
          T t = new T();
     //     int j = t.feibo(7);
     //     System.out.println(j);
          T pn = new T();
          int d = 1;
          int p = pn.houzi(1);
          if(p != -1){
               System.out.println("��" + d + "����" + p + "������");
          } 
	}
}

//  쳲�������  1 1 2 3 5 8 13...
class T{
     public int feibo(int n){
     	
     		if(n == 1 || n == 2){
     			return 1;
     		}else{
     			return feibo(n-1) + feibo(n-2);
     		}
     }

     public int houzi(int day){
          if(day == 10){
               return 1;
          }else if(day>=1 && day<=9){
               return (houzi(day + 1) + 1) * 2;
          }else{
               System.out.println("n������1-10֮��");
               return -1;
          }
     }
}