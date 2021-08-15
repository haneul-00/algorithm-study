# 💻 Yebin's Algorithm Study and Missions

<details>
    <summary> 2021-08-03주차 </summary>

# 기본문제

### 1. [백준 2292번-수학](https://www.acmicpc.net/problem/2292)

<br> 

### 2. [백준 1085번-수학](https://www.acmicpc.net/problem/1085)

- 점의 위치가 직사각형 내부에 있기 때문에, 피타고라스를 이용한 복잡한 방정식으로 직사각형과의 거리를 구하지 않아도 되어서 수월했던 문제
- 또, 직사각형의 왼쪽 아래 꼭짓점이 (0,0)이기 때문에 경우의 수를 따지는데에 어려움이 없었음
- 총 4가지의 경우의 수만 고려하면 됨

<br>

```python

# 경우의 수는 다음과 같다. 단, x,y는 직사각형 내부에 있음
# 1) 직사각형의 y좌표(h) - 현재 위치의 y좌표(y)
# 2) 직사각형의 x좌표(w) - 현재 위치의 x좌표(x)
# 3) 현재 위치의 y좌표(y) - y축(0)
# 4) 현재 위치의 x좌표(w) - x축(0)

x,y,w,h=map(int, input().split())
list=[x, w-x, y, h-y] # 경우의 수들을 list에 삽입

minLength=list[0]
for num in list: # 최저 길이 구하기
    if num<minLength:
        minLength=num
        
print(minLength)
```

<br>

### 3. [백준 1547번-구현](https://www.acmicpc.net/problem/1547)

- `공이 움직이지 않는다(=공은 항상 첫번째 위치에 있음)`는 조건을 보지 않아서 정말 오래 걸렸던 문제. (독해력을 높여야 할듯...)

<br>

```python
cup = [1,2,3] # 리스트에 1~3번 공 차례대로 넣음 (공이 들어있는 컵 = 1번)

M=int(input())
for _ in range(M):
    first, second = map(int, input().split())
    
    firstIndex=cup.index(first) # first의 인덱스
    secondIndex=cup.index(second) # second의 인덱스
    
    cup[firstIndex], cup[secondIndex] = cup[secondIndex], cup[firstIndex] # first와 second의 번호의 공 위치를 서로 맞바꿈

print(cup[0]) # 공이 들어있는 컵의 번호 (첫번째 위치에 있는 컵의 번호)
```

<br><hr><br>

# 난이도 상 문제
난이도 상 문제: [백준 4949번-스택](https://www.acmicpc.net/problem/4949)

</details>