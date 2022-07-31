## Solution:
***python3***
```
# cook your dish here
n,m,k = map(int, input().split())
cert = 0
for i in range(n):
    
    arr = list(map(int, input().split()))
    
    if sum(arr[:k]) >= m and arr[-1] <=10:
        cert += 1
        
print(cert)

```

***java***
```

```