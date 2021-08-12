## 문제-4949 균형잡힌 세상
- 위 문제는 스택, 문자열로 해결이 가능했다.

* 해당 문자열의 괄호가 잘 되어있는지 확인하기 위한 check 함수 선언
* stack을 이용하여 '('가 들어오면 1을, '대괄호(여는)' 가 들어오면 2를 push
* ')'가 들어왔을 때 stack의 top에 1이 없다면 false return. 있다면 pop.
* '대괄호(닫는)'가 들어왔을 때 stack의 top에 2가 없다면 false return. 있다면 pop.

```C
stack<int> st;
bool check(string s) {
	while (!st.empty()) st.pop();
	int i = 0;
	while (s[i] != NULL) {
		if (s[i] == '(')
			st.push(1);
		else if (s[i] == ')') {
			if (st.empty() || st.top() != 1)
				return false;
			else
				st.pop();
		}
		if (s[i] == '[')
			st.push(2);
		else if (s[i] == ']') {
			if (st.empty() || st.top() != 2)
				return false;
			else
				st.pop();
		}
		i++;
	}
	if (!st.empty()) return false;
	return true;
}
```

* 우선 괄호와 '.'을 비교하여 인지하기 위해 string헤더의 getline함수를 사용하여 공백까지 받아 주었다.
* 받은 문자열이 '.'일때 까지 while을 돌린다.
* check 함수에서 true가 나오면 yes를 false가 나오면 no를 출력.

```
int main() {
	int i = 0;
	string s;
	getline(cin, s);
	while (1) {
		if (s[0] == '.' && s[1] == NULL) break;
		if (check(s)) cout << "yes\n";
		else cout << "no\n";
		getline(cin, s);
	}
}
```

stack 알고리즘 활용하기 괜찮은 문제다.
문자열과 stack을 어떻게 엮어야 할지 많이 고민해봐야 했던 문제다.
