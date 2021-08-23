//한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
//직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
import java.util.*;
public class n1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int MinX;
		int MinY;
		
    //x < (w-x) ? x : (w-x);
		if(x < (w-x))
			MinX = x;
		else MinX = (w-x);
		
    //y < (h-y) ? y : (h-y);
		if(y < (h-y))
			MinY = y;
		else MinY = (h-y);
		
		if(MinX > MinY)
			System.out.println(MinY);
		else
			System.out.println(MinX);
	}
}
//그림으로 그려보면 이해가 쉽다. (0,0)에서 (w,h)까지의 직사각형 안에 (0,0)에서 (x,y)까지의 직사각형이 존재한다.
//w와 x간의 거리, h와 y간의 거리 중 가장 작은 수가 최솟값이 된다.
