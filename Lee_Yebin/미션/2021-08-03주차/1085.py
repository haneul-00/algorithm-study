'''
한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

첫째 줄에 x, y, w, h가 주어진다.
1 ≤ w, h ≤ 1,000
1 ≤ x ≤ w-1
1 ≤ y ≤ h-1
x, y, w, h는 정수

첫째 줄에 문제의 정답을 출력한다.
'''

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