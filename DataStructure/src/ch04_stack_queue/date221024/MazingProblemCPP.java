package ch04_stack_queue.date221024;

import java.util.Stack;

// class�� class �ȿ� ������ �����߻� > class ������ �����ֱ�
class Items {
	int x, y, dir;
	
	public Items() {
		// ���� �ʱ�ȭ
		x = 0;
		y = 0;
		dir = 0;
	}

	public Items(int x, int y, int dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + dir + ")";
	}
	
}

class Offsets {
	int a, b;
	// c++������ enum�� ���갡���ϳ� �ڹٴ� ����Ұ� > ������, ���ڷ� ��ü
	//enum directions { N, NE, E, SE, S, SW, W, NW };
	// N=0, NE=1, E=2, SE=3, S=4, SW=5, W=6, NW=7
	public Offsets() {
		a=0;
		b=0;
	}
	
	public Offsets(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "Offsets [a=" + a + ", b=" + b + "]";
	}
}

public class MazingProblemCPP {
	
	static Offsets[] moves = new Offsets[8];
	//offsets moves[8];
	static int[][] maze = new int[100][100];
	static int[][] mark = new int[100][100];

	public static void path(int[][] maze, int[][] mark, int m, int p) {
	//Output a path (if any) in the maze; rows is m, cols is p;
		//start at (1,1)
		mark[1][1] = 1;
//		Stack<items> stack(m * p);
		Stack <Items> stack = new Stack<>();
		System.out.println(stack);
		Items temp = new Items();
		temp.x = 1; temp.y = 1; temp.dir = 2;
		stack.push(temp);

		while (!stack.isEmpty()) // stack not empty
		{
			// ������ push ��ġ�� ���ư���
			temp = stack.pop(); // unstack
			// temp�� ������ stack ��ġ
			int i = temp.x; int j = temp.y; int d = temp.dir;
			// moves forward 8���� ������ ��� üũ
			while (d < 8)
			{
				//outFile << i << " " << j << " " << d << endl;
				int g = i + moves[d].a;
				int h = j + moves[d].b;
				if ((g == m) && (h == p)) { // reached exit
											// output path
					System.out.println(stack);
					System.out.println("the term near the exit: " + i + " " + j);
					System.out.println("exit: " + m + " " + p);
					return;
				}
				if ((maze[g][h]==0) && (mark[g][h]==0)) { // new position
					mark[g][h] = 1;
//					//push the old temp to the stack, but the direction changes.
//					//Because the neighbor in the direction of d has been checked.
					Items pos = new Items();
					pos.x = i;  pos.y = j; pos.dir = d;
					stack.push(pos); // stack it
					i = g; j = h; d = 0; // moves to (g,h)
				}
				else d++; // try next direction
			}
		}
		System.out.println("no path in maze");
	}
	//maze[][], mark[][]�� class�� private data member�� ����
	//main()������ class�� public function�� ȣ��� �̷� ã��

	public static void main(String[] args) {
		
			int input[][] = { // 12 x 15
					{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 }, 
					{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, 
					{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
					{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, 
					{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
					{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, 
					{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
					{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, 
					{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
					{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 
					{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }, 
					};
			
			// moves ����
			for (int ia = 0; ia < 8; ia++) {
				moves[ia] = new Offsets();
			}
			
			// moves �� �ο�
			moves[0].a = -1;	moves[0].b = 0;		// N
			moves[1].a = -1;	moves[1].b = 1;		// NE
			moves[2].a = 0;		moves[2].b = 1;		// E
			moves[3].a = 1;		moves[3].b = 1;		// SE
			moves[4].a = 1;		moves[4].b = 0;		// S
			moves[5].a = 1;		moves[5].b = -1;	// SW
			moves[6].a = 0;		moves[6].b = -1;	// W
			moves[7].a = -1;	moves[7].b = -1;	// NW
			
			for (int i = 0; i < 14; i++) {
				for (int j = 0; j < 17; j++) {
					// �̷��� �ܺ��� �����
					if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
						maze[i][j] = 1;
					// �ܺ� �ȿ� maze ī��
					else {
						maze[i][j] = input[i - 1][j - 1];
					}
					// mark �ʱ�ȭ
					mark[i][j] = 0;

				}
			}
			
			// �ܺ� ���� �̷� ����ϱ�
			System.out.println("maze[12,15]::");
			for (int i = 0; i <= 13; i++) {
				for (int j = 0; j <= 16; j++) {
					System.out.print(maze[i][j] + " ");
				}
				System.out.println();
			}
			
			
			System.out.println("mark::");
			for (int i = 0; i <= 13; i++) {
				for (int j = 0; j <= 16; j++) {
					System.out.print(mark[i][j] + " ");
				}
				System.out.println();
			}
			path(maze, mark, 12, 15);
			
			System.out.println("mark::");
			for (int i = 1; i <= 12; i++) {
				for (int j = 1; j <= 15; j++) {
					System.out.print(mark[i][j] + " ");

				}
				System.out.println();
			}

		}
	}
