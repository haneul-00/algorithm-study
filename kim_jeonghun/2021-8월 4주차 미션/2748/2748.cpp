#include<iostream>
using namespace std;

int main() {
	int sum = 0, price, tmp;

	cin >> price;
	for (int i = 1; i < 10; i++) {
		cin >> tmp;
		price -= tmp;
	}
	cout << price;
	return 0;
}#include<iostream>
using namespace std;

long long memo[90];

long long fib(long long n) {
	memo[0] = 0;
	memo[1] = 1;
	for (int i = 2; i <= n; i++)
		memo[i] = memo[i - 1] + memo[i - 2];
	return memo[n];
}

int main() {
	int n;
	cin >> n;

	cout << fib(n);
	return 0;
}