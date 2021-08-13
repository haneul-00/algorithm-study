#include<iostream>
using namespace std;

int main() {
	int n, i = 0;
	cin >> n;
	for (int count = 2; count <= n; i++) {
		count += 6 * i;
	}
	if (n == 1) i = 1;
	cout << i;
	return 0;
}