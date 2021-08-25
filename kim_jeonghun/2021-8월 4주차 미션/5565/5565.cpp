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
}