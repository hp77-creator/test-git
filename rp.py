n = int(input("total participants : "))
A = list(map(int,input().strip().split()))[:n]
max_A = max(A)
zeros = 0
for i in range (0,len(A)):
    A[i] = max_A - A[i]
for i in range (0,len(A)):
    if A[i] == 0:
        zeros+=1
for i in range (0,zeros):
    A.remove(0)
print("runner's up is {}".format(max_A-min(A)))