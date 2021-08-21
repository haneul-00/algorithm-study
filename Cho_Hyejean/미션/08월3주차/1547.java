//탁자 위에 일렬로 엎어둔 컵의 번호는 맨 왼쪽 컵부터 순서대로 1번,2번,3번이고

//먼저 1번 컵의 아래에 공을 하나 넣는다. 세준이는 두 컵을 고른 다음 그 위치를 맞바꾼다.
//1번 컵이 있던 위치에 2번 컵을 이동시키고, 동시에 2번 컵이 있던 위치에 1번 컵을 이동시켜야 한다. 

//세준이는 컵의 위치를 총 M번 바꿀 것이며, 컵의 위치를 바꾼 방법이 입력으로 주어진다. 
//위치를 M번 바꾼 이후에 공이 들어있는 컵의 번호를 구하는 프로그램을 작성하시오.

import java.util.*;
public class n1547 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
				
		int i = 1, ball = 1;
		while(i<=M) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			if(x == ball)
				ball = y;
			if(y == ball)
				ball = x;
			i++;
		}
		System.out.println(ball);
	
	}

}
// 컵의 위치가 바뀌는 M번마다, x컵에 공이 있다면 공을 y컵에 넣어 맞바꾼다.
