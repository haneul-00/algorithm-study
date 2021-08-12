#include<iostream>
#include<string>
#include<stack>
using namespace std;

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