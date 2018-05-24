#include <iostream>
using namespace std;

using ll = long long int;
#define rep(i, n) for(int i = 0; i < (int)(n); i++)

int main() {
	ll a, b, x;
	cin >> a >> b >> x;

	cout << ((x >= a && x <= (a + b)) ? "YES" : "NO");
	return 0;
}