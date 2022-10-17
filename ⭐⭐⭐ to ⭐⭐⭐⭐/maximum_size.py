def isSafe(mat, i, j, vis,n,m):
    if((i >= 0) and (i < n) and (j >= 0) and (j < m)):
        if (mat[i][j]=="1" and (not vis[i][j])):
            return True
    else:
        return False
 
def BFS(mat, vis, si, sj,n,m):
     
    row = [-1,0,0,1]
    col = [0,-1,1,0] 
    cnt=1
    q = deque()
    q.append([si, sj])
    vis[si][sj] = True   
    while (len(q) > 0):
        temp = q.popleft()
 
        i = temp[0]
        j = temp[1]
        
        for k in range(4):
            if (isSafe(mat, i + row[k], j + col[k], vis,n,m)):
                vis[i + row[k]][j + col[k]] = True
                cnt+=1
                q.append([i + row[k], j + col[k]])
    return cnt

from collections import deque
t = int(input())
for _ in range(t):
    n,m = list(map(int,input().split()))
    mat = []
    for a in range(n):
        l = input()
        mat.append(l)
    vis = [[False for i in range(m)]
                    for i in range(n)]     
    res = 0
    pqr=[]
    for i in range(n):
        for j in range(m):
            if (mat[i][j]=="1" and not vis[i][j]):
                ans = BFS(mat, vis, i, j,n,m)
                pqr.append(ans)
    pqr.sort(reverse=True)
    ans=0
    for i in range(1,len(pqr),2):
        ans+=pqr[i]
    print(ans)
