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

		t.findWay(map,1,1); // 传递地图和初始位置1，1
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
	// 创建一个方法，返回一个boolean类型，接收地图和坐标
	public boolean findWay(int[][] map, int i, int j){
		if(map[6][5] == 2){ // 如果(6,5)为2，说明找到了，结束递归
			return true;
		}else{
			if(map[i][j] == 0){  //如果所在坐标为0，说明可以走
				map[i][j] = 2;   // 先假设它是一条通路，赋2，然后递归找
				if(findWay(map,i+1,j)){  // 找 下--右--上--左
					return true;
				}else if(findWay(map,i,j+1)){
					return true;
				}else if(findWay(map,i-1,j)){
					return true;
				}else if(findWay(map,i,j-1)){
					return true;
				}else{
					map[i][j] = 3;  // 如果四个方向都不能走，则说明是死路，赋3
					return false;
				}
			}else{
				return false;
			}
		}
	}
}
