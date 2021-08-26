### `반복문, if문 사용`
- 변수 in, out, people, max 생성 
- for문을 이용해 in, out은 scanner클래스로 입력받아 내리고 탄 후의 사람수를 세어 max와 비교해가며 가장 많을 때의 사람 수 구하기

```java

	for(int i = 0; i < 4; i++) {
			out = scanner.nextInt();
			in = scanner.nextInt();
			
			people += -out + in;
			
			if(people>max) max = people;
		}
    
```


