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
