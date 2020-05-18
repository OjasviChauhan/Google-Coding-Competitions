import math
t = int(input())
for z in range(t):
    n = int(input())
    A = list(map(int,input().split()))
    c = 0
    for i in range(0,n):
        for j in range(i+1,n+1):
            x = sum(A[i:j])
            if(x >= 0):
                sr = math.sqrt(x)
                if(sr - math.floor(sr) == 0):
                    c+=1                
    print("Case #"+str(z+1)+": "+str(c))   
