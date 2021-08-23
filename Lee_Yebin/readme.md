# 💻 Yebin's Algorithm Study and Missions

## Missions

<details>
    <summary> 2021-08-03주차 </summary>

- [x] 상1 - BOJ 4949 (스택) : 괄호 검사 프로그램
- [ ] 기본1 - BOJ 2292 (수학) : 육각형으로 이루어진 벌집에 들어있는 숫자까지의 이동 횟수 구하기
- [x] 기본2 - BOJ 1085 (수학) : 직사각형 내부 위치에서 직사각형 경계선까지의 최저 거리 구하기
- [x] 기본3 - BOJ 1547 (수학) : 두 컵의 위치 바꾸어 공이 든 컵의 번호 구하기



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

### 1. [백준 4949번-스택](https://www.acmicpc.net/problem/4949)

- 독해력의 문제 발생. 여러 줄의 문장을 입력받을 수 있다는 부분을 읽지 않았음 !!! -> `독해력. 문제를 제대로 읽자`
- 자료구조에서 배웠던 스택 구조를 이용해 괄호 검사의 아이디어를 떠올리는 것은 어렵지 않았으나,
- 오류가 날 수 있는 경우를 떠올리지 못해 헤맸음
    - 1. 닫는 괄호에 대해서, 스택이 비어있는지 먼저 검사해야 함 (비어있는 리스트에서 pop은 불가능하기 때문)
    - 2. 마지막까지 도달하여 '.' 문자에 대해 검사할 때, 스택이 비어있는지 검사해야 함

```python
while(True):
    charList=input() # 한 줄의 문자열 리스트를 입력받음
    stack = [] # 괄호를 넣을 스택 (빈 리스트) 생성
    
    if charList[0]=='.': # 첫번째 문자가 '.'인 경우는 종료
        break
    
    for ch in charList:
        if ch=='(' or ch=='[': # 여는 괄호는 스택에 추가
            stack.append(ch)
        elif ch==')' or ch==']': # 닫는 괄호인 경우
            if not stack: # 스택이 빈 리스트인 경우(닫는 괄호가 먼저 나오는 경우) 종료
                print("no")
                break
            get=stack.pop() # 스택으로부터 괄호를 pop한 후에 닫는 괄호와 짝이 맞는지 검사
            if ch==')' and get=='(':
                continue
            elif ch==']' and get=='[':
                continue
            else:
                print("no") # 짝이 맞지 않는 경우 no 출력 후 종료
                break
        elif ch=='.': # 마지막까지 도달한 경우
            if not stack: # 스택이 완전히 비어있는 경우에만 균형
                print("yes")
            else:
                print("no")
```
</details>

<details>
    <summary> 2021-08-04주차 </summary>

- [ ] 상1 - BOJ 1920 (이분탐색) : 
- [ ] 상2 - BOJ 2748 (수학) :
- [x] 기본1 - BOJ 2455 (수학) : 4개의 기차역에서 내리는 인원/타는 인원에 따른 최대 인원 수 구하기
- [x] 기본2 - BOJ 5565 (수학) : 10권의 책 가격에서 주어지지 않은 책 한 개의 가격 구하기

# 기본문제

### 1. [백준 2455번-수학](https://www.acmicpc.net/problem/2455)

- 덧셈과 뺄셈, 그리고 각 반복문이 실행될 때마다 얻게 되는 값 중 가장 큰 값을 구하면 되는 쉬운 문젠
- 각 줄 마다 입력받는 두 수(a, b)에 대해, 기차 안에 있는 총 인원(sum)에서 내리는 인원(a)를 빼고, 새로 타는 인원(b)를 더하여, 결과적으로 해당 기차역에서의 기차 내 인원(sum)이 최대 인원(max)인 숫자보다 큰 경우 그 수를 max에 저장하게 된다.


```python
sum=0
max=0

for _ in range(4):
    a, b = map(int, input().split()) # 두 수를 입력 받아
    sum -= a # sum에서 첫번째 수에 대해선 뺄셈
    sum += b # sum에서 두번째 수에 대해선 덧셈
    if(max<sum): # 현재의 sum(기차에 타있는 사람 수) max보다 크다면
        max=sum # 해당 수를 max에 저장

print(max)
```
<br>

### 2. [백준 5565번-수학](https://www.acmicpc.net/problem/5565)

- 맨 처음 주어지는 숫자 (총 가격: total_fee) 에서 입력받는 수(fee)를 9번 반복해서 뺀 후, 마지막 남은 수를 출력하면 되는 매우 쉬웠던 문제

```python

# 첫번째 가격에서 다음 수들에 대한 뺄셈 반복 (총9번) -> 마지막으로 남은 수를 출력하기

total_fee = int(input()) # 첫째줄에 10권의 총 가격

for _ in range(9): # 책 9권에 대한 가격
    fee=int(input())
    total_fee -= fee # 총 가격에서 각 책의 가격을 계속하여 뺌
    
print(total_fee) # 마지막 한 권에 대한 요금 출력
```
<br><hr><br>


# 난이도 상 문제


</details>