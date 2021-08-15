#include<iostream>
using namespace std;

int main() {
	int m, x, y, ans=1;
	cin >> m;
	for (int i = 0; i < m; i++) {
		cin >> x >> y;
		if (ans == x) ans = y;
		else if (ans == y) ans = x;
	}
	cout << ans;
}