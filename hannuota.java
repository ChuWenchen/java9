public class hannuota{
	public static void main(String[] agrs){
		T t = new T();
		t.move(5,'A','B','C');
	}
}

class T{
	//����һ���������޷���ֵ������������3����
	public void move(int i,char a, char b, char c){
		if(i == 1){
			// ���ֻ��һ���̣�ֱ�Ӵ�a�ƶ���c
			System.out.println(a + "-->" + c);
		}else{
			// ����ж���̣���Ҫ��Ϊ�����������һ��������������
			// �Ȱ�a�� �������еķŵ�b,�м����c
			move(i-1,a, c, b);
			//�ٰ����һ���ŵ�c
			System.out.println(a + "-->" + c);
			// �ٰ� b ���ϵ��������ƶ���c���м����a
			move(i-1,b, a, c);
		}

	} 
}