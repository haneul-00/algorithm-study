// n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램

#include <stdio.h>
#pragma warning (disable:4996)

int main() {
	int n;
	long long fibo = 0, fibo1 = 0, fibo2 = 0;

	while (1) {
		scanf("%d", &n);
		if (n > 0 && n <= 90) {
			if (n == 1)
				fibo = 1;
			else {
				fibo1 = 1;
				fibo2 = 0;

				for (int i = 1; i < n; i++) {
					fibo = fibo1 + fibo2;
					fibo2 = fibo1;
					fibo1 = fibo;
				}
			}
			printf("%llu", fibo);
			break;
		}
		else printf("다시 입력하세요\n");
	}
}

// 자바에서 작성하였으나 longlong형을 모르겠어서 그냥 c언어로 
