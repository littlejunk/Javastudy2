package homework5;
import java.util.Random;


public class GameCore {

	
	Grid[][] grid=new Grid[9][9];
	
	
	int count =10;
	//���򿪸���
	int beOpen = 0;
	
	
	public void createGrid() {
		
		for(int i =0;i<grid.length;i++) {
			for(int j =0;j<grid[i].length;j++) {
				
				grid[i][j]=new Grid();
			
				grid[i][j].content=' ';  
				grid[i][j].state=false;   
			}
		}
	}
	
	
	Random random =new Random();
	
	
	public void createMine() {
		//通过循环的方式在随机产生的位置进行雷的添�?
		while(count>0) {
			//分别获取x和y坐标
			int x=random.nextInt(9);
			int y=random.nextInt(9);
			//判断当前随机到的位置中格子对象内容是否为�?
			if(grid[x][y].content !='*') {
				//通过当前的坐标获取格子数组中的格子对象，并实现雷赋�??
				grid[x][y].content='*';
				count--;				
			}
		}
	}
	
	//定义�?个获取指定坐标的8个方向坐标方�?
	public MyPoint[] getPoint(int x,int y) {
		//分别�?8个方向对象进行坐标赋�?
		MyPoint[] point =new MyPoint[8];
		//左边坐标对象
		point[0] = new MyPoint(x-1,y);
		//左上坐标对象
		point[1]=new MyPoint(x-1,y-1);
		//上边坐标对象
		point[2]=new MyPoint(x,y-1);
		//右上坐标对象
		point[3]=new MyPoint(x+1,y-1);
		//右边坐标对象
		point[4]=new MyPoint(x+1,y);
		//右下坐标对象
		point[5]=new MyPoint(x+1,y+1);
		//下边坐标对象
		point[6]=new MyPoint(x,y+1);
		//左下坐标对象
		point[7]=new MyPoint(x-1,y+1);
		return point;
	}
	
	
	public void setNumber() {
		
		for(int i =0;i<grid.length;i++) {
			for(int j =0;j<grid[i].length;j++) {
				//排除当前位置的格子对象内容不是雷就实现雷数的添加
				if(grid[i][j].content !='*') {
					//定义�?个统计当前格子进行雷数统计的变量
					int sum =0;
					
					
					MyPoint[] point =getPoint(i,j);
					
					for(int k=0;k<point.length;k++) {
						MyPoint mp =point[k];
					
						if(mp.x>=0 && mp.y>=0 && mp.x<9 && mp.y<9) {
						
							if(grid[mp.x][mp.y].content =='*') {
								sum++;
							}
						}
					}
					
					if(sum>0) {
						grid[i][j].content = (char)(sum+48);
					}
				}
			}
		}
	}
	
	
	
	public void play(int x,int y) {
		
		if(!grid[x][y].state) {
			beOpen++;
		}
		if(beOpen == 71 && grid[x][y].content != '*') {
			System.out.println("游戏胜利");
		}
		grid[x][y].state=true;
		if(grid[x][y].content == '*') {
			System.out.println("��Ϸ����,ʧ��"
					+ "");
		}else if(grid[x][y].content ==' ') {
			MyPoint[] point =getPoint(x,y);
			for(int i =0;i<point.length;i++) {
				MyPoint mp =point[i];
				
				if(mp.x>=0 && mp.y>=0 && mp.x<9 && mp.y<9) {
					
					if(grid[mp.x][mp.y].content==' ' && !grid[mp.x][mp.y].state) {
						
						play(mp.x,mp.y);
					}else {
						if(!grid[mp.x][mp.y].state) {
							beOpen++;
						}
						if(beOpen == 71 && grid[x][y].content != '*') {
							System.out.println("游戏胜利");
						}
						grid[mp.x][mp.y].state=true;
						
					}
				}
			}
		}
		
		
	}
	
	
	
	
	public void show() {
		for(int i =0;i<grid.length;i++) {
			for(int j =0;j<grid[i].length;j++) {
					if(grid[i][j].state) {
						System.out.print(grid[i][j].content+"\t");
					}else {	
						System.out.print("■\t");
					}
			}
			System.out.println();
		}
	}
	
	
	
}
