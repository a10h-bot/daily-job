def f(n, denom):
	ans = 10**10
	if n<=0:
		return 0
	for i in denom:
		if n-i>=0:
			ans = min(ans, 1+f(n-i, denom))
	return ans


print f(10, [1,3,4])