# 문제-1547 공

- 단순한 구현 문제.
- 가끔 vector<pair<int, int>>를 사용하여 그래프 탐색 할 떄 사용한 방법과 비슷하게 해봤다. 

```C
int m, x, y, ans=1;
cin >> m;
for (int i = 0; i < m; i++) { // 가끔 그래프 탐색에서 vector 사용시 하는 방법
	cin >> x >> y;
	if (ans == x) ans = y;
	else if (ans == y) ans = x;
}
cout << ans;
```
