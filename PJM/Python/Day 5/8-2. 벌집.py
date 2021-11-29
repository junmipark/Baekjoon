import math;

def ans(N) :
    if N == 1:
        return 1;
    
    n = 2;
    i = 1;

    while n + i * 6 < 1000000000 :
        if N < n + i * 6 :
            return i+1;
        n = n + i * 6;
        i += 1;

    return i+1;

    

if __name__ == "__main__" :
    N = int(input());
    
    print(ans(N));
