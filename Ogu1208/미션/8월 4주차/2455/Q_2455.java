import java.util.*;

public class Q_2455 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int in, out, people = 0, max = 0;
		
		for(int i = 0; i < 4; i++) {
			out = scanner.nextInt();
			in = scanner.nextInt();
			
			people += -out + in;
			
			if(people>max) max = people;
		}
		
		System.out.println("기차에 사람이 가장 많을 때 : " + max);
	}

}
