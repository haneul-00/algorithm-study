//책 10권의 총 가격과 가격을 읽을 수 있는 9권 가격이 주어졌을 때, 
// 가격을 읽을 수 없는 책의 가격을 구하는 프로그램

import java.util.*;
public class n5565 {

	public static void main(String[] args) {
		int total, sum=0, x;
		int[] price = new int[9];
		
		Scanner s = new Scanner(System.in);
		total = s.nextInt();
		for(int i=0; i<9; i++) {
			price[i] = s.nextInt();
			sum += price[i];
		}
		x = total - sum;
		System.out.println(x);
	}

}

// 처음 입력받은 total에서 나머지 입력받은 price배열의 값을 전부 빼주면 된다.
