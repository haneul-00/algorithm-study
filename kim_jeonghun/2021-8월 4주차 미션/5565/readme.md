# 문제-5565 영수증 

- 단순 수학 문제
- 총 가격에서 뒤에 출력되는 가격을 전부 빼준 뒤 출력해준다.

```C
  int sum = 0, price, tmp;
	cin >> price;
	for (int i = 1; i < 10; i++) {
		cin >> tmp;
		price -= tmp;
	}
	cout << price;
```
