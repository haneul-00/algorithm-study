#include<iostream>
using namespace std;

int main() {
	int x, y, w, h, m_x, m_y;
	cin >> x >> y >> w >> h;
	m_x = x >= w - x ? w - x : x;
	m_y = y >= h - y ? h - y : y;
	cout << (m_x > m_y ? m_y : m_x);
}