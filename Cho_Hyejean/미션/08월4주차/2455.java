// 1번역(출발역)부터 4번역(종착역)까지 4개의 정차역이 있는 노선에서 운행되고 있다. 
// 출발역에서 종착역까지 가는 도중 기차 안에 사람이 가장 많을 때의 사람 수를 계산하려고 한다.

import java.util.*;
public class n2455 {

	public static void main(String[] args) {
		int max=0, people=0;
		int out, in;
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			out = s.nextInt();
			in = s.nextInt();
			
			people = people + in - out;
			if(people > max)
				max = people;
		}
		System.out.println(max);

	}

}
// in, out을 입력받고 현재 탑승 중인 인원을 계산해서 출력하면 된다.
