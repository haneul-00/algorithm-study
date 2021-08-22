//숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 
//몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 

import java.util.*;
public class n2292 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());

		int point[] = {1,7,19,37,61};
		int count = 0;
		for(int i=0; i<point.length; i++) {
			if(N == 1)
				count = 1;
			else if (N > point[i]) 
				count = i+2;		
		}				
		System.out.println(count);
	}

}
// 1을 중심으로 n바퀴를 도는 기준점이 되는 지점을 지날 때마다 n에 2씩 더해준다.
