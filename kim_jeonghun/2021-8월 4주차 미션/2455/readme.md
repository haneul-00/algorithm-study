# 문제-2455 지능형 기차

- 단순 수학 문제
- for문으로 인원수 가감 해주며 최댓값 구해서 출력.

```C
int up, down, in = 0, max = 0;
	for (int i = 0; i < 4; i++) {
		cin >> down >> up;
		in += up - down;
		if (in > max) max = in;
	}
	cout << max;
```
