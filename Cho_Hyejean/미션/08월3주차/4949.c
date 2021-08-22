#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_STACK_SIZE 100
#define TEXT_SIZE 100
#pragma warning (disable:4996)

typedef int element;
typedef struct {
	element data[MAX_STACK_SIZE];
	int top;
} StackType;

void init_stack(StackType* s) {
	s->top = -1;
}

int is_empty(StackType* s) {
	return (s->top == -1);
}

int is_full(StackType* s) {
	return (s->top == (MAX_STACK_SIZE - 1));
}

void push(StackType* s, element item) {
	if (is_full(s)) {
		fprintf(stderr, "스택 포화 에러\n");
		return;
	}
	else s->data[++(s->top)] = item;
}

element pop(StackType* s) {
	if (is_empty(s)) {
		fprintf(stderr, "스택 공백 에러\n");
		exit(1);
	}
	else return s->data[(s->top)--];
}

element peek(StackType* s) {
	if (is_empty(s)) {
		fprintf(stderr, "스택 공백 에러\n");
		exit(1);
	}
	else return s->data[s->top];
}

int check_matching(const char* in) {
	StackType s;
	char ch, open_ch;
	int i, n = strlen(in);
	init_stack(&s);

	for (i = 0; i < n; i++) {
		ch = in[i];
		switch (ch) {
		case '(':case'[':
			push(&s, ch);
			break;
		case')':case']':
			if (is_empty(&s)) return 0;
			else {
				open_ch = pop(&s);
				if ((open_ch == '(' && ch != ')') ||
					(open_ch == '[' && ch != ']')) {
					return 0;
				}
				break;
			}
		}
	}
	if (!is_empty(&s)) return 0;
	return 1;
}

int main() {
	char text[TEXT_SIZE] = { 0, };

	while (1) {
		fgets(text, sizeof(text), stdin);

		if (text[0] == '.') break;

		if (check_matching(text) == 1)
			printf("yes\n");
		else printf("no\n");
	}
	
	return 0;
}

// 난 자료구조가 너무 싫다 .... 
// 1학기 때 자료구조 수업에서 작성한 괄호 검사 프로그램을 활용하였다.
// 자바로 하고 싶었지만 능력이 턱없이 부족하여 c언어로 작성하였다.
