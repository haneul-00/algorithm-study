import java.util.*;

public class Q_5565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int price, result, sum = 0;
		
		sum = scanner.nextInt();
		
		for(int i = 0; i < 9; i++) {
			price = scanner.nextInt();
			sum -= price;
		}
		
		System.out.println("가격을 읽을 수 없는 책의 가격 : " + sum);
	}

}
