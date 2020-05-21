def countdown(A,n,k):
    count = 0
    for i in range(0,n-k+1):
        temp = k
        for j in range(i,k+i):
            if(A[j]!= temp):
                break
            else:
                if(temp == 1):
                    count += 1
                temp -= 1
    return str(count)

t = int(input())
for z in range(t):
    n,k = map(int, input().split())
    A = list(map(int, input().split()))
    print("Case #"+ str(z+1) + ": "+ countdown(A,n,k))
