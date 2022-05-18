public class RecursionMi{
	public static void main(String[] agrs){
		int[][] map = new int[8][7];
		int i = 0;
		int j = 0;
		for(i = 0; i<8; i++){
			for(j = 0; j<7; j++){
	
				map[0][j] = 1;
				map[7][j] = 1;
				map[i][0] = 1;
				map[i][6] = 1;
				map[3][1] = 1; 
				map[3][2] = 1;
			}
		}
		System.out.println("-------------------");
		for(i = 0;i<8;i++){
			for(j=0;j<7;j++){
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}

		T t = new T();

		t.findWay(map,1,1); // ���ݵ�ͼ�ͳ�ʼλ��1��1
		System.out.println("-------------------");
		for(i = 0;i<8;i++){
			for(j=0;j<7;j++){
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}

	}
}

class T{
	// ����һ������������һ��boolean���ͣ����յ�ͼ������
	public boolean findWay(int[][] map, int i, int j){
		if(map[6][5] == 2){ // ���(6,5)Ϊ2��˵���ҵ��ˣ������ݹ�
			return true;
		}else{
			if(map[i][j] == 0){  //�����������Ϊ0��˵��������
				map[i][j] = 2;   // �ȼ�������һ��ͨ·����2��Ȼ��ݹ���
				if(findWay(map,i+1,j)){  // �� ��--��--��--��
					return true;
				}else if(findWay(map,i,j+1)){
					return true;
				}else if(findWay(map,i-1,j)){
					return true;
				}else if(findWay(map,i,j-1)){
					return true;
				}else{
					map[i][j] = 3;  // ����ĸ����򶼲����ߣ���˵������·����3
					return false;
				}
			}else{
				return false;
			}
		}
	}
}
