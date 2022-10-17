for _ in range(int(input())):
    R, C, K = list(map(int, input().split()))
    count = 0
    visited = [[False for i in range(9)] for j in range(9)]
    queue = []
    queue.append((R,C,K))
    while queue:
        R,C,K = queue.pop(0)
        if not visited[R][C]:
            visited[R][C] = True
            count = count + 1
        else:
            continue
        if K < 1:
            continue
        if R > 1 and C > 1:
            queue.append((R-1, C-1, K-1))
        if R > 1:
            queue.append((R-1, C, K-1))
        if R > 1 and C < 8:
            queue.append((R-1, C+1, K-1))
        if C < 8:
            queue.append((R, C+1, K-1))
        if R < 8 and C < 8:
            queue.append((R+1, C+1, K-1))
        if R < 8:
            queue.append((R+1, C, K-1))
        if R < 8 and C > 1:
            queue.append((R+1, C-1, K-1))
        if C > 1:
            queue.append((R, C-1, K-1))
    print(count)