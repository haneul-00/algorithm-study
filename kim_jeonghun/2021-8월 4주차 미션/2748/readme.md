# 문제-2748 피보나치 수 2

- dynamic programming 알고리즘 응용 문제

- DP 알고리즘의 가장 기본적이며 대표적인 문제 피보나치 수이다.
- 피보나치 수와 같이 이후의 수를 구하기 위해서 앞전에 했던 계산을 또 해야할 때, 시간초과를 줄여주기 위해서 배열에 저장하고 그 값을 가져온다.
- DP의 장점은 메모이제이션으로 시간 단축이 많이 된다.
- 피보나치 수의 점화식 D[i] = D[i-1] + D[i-2] (i>1)을 DP로 구현해준다.

```C
long long memo[90];

long long fib(long long n) {
	memo[0] = 0;
	memo[1] = 1;
	for (int i = 2; i <= n; i++)
		memo[i] = memo[i - 1] + memo[i - 2];
	return memo[n];
}
```
