// N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 
// 이 안에 X라는 정수가 존재하는지 알아내는 프로그램

import java.util.*;
public class n1920 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sizeN = s.nextInt();
		
		int[] N = new int[sizeN];
		for(int i=0; i<sizeN; i++) 
			N[i] = s.nextInt();
				
		Arrays.sort(N);
		
		int sizeM = s.nextInt();
		int[] M = new int[sizeM];
		for(int i=0; i<sizeM; i++) {
			M[i] = s.nextInt();
			int high=sizeN-1, low=0, mid=0, result=0;
			
			while(low <= high) {
				mid = low+((high-low)/2);
				int compare = M[i] - N[mid];
				if(compare > 0) 
					low = mid+1;
				else if(compare < 0) 
					high = mid-1;
				else {
					result = 1;
					break;
				}
			}		
			System.out.println(result);
		}
	}
}

