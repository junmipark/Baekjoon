def ans(k,n) :
    base = [j for j in range(1, n+1)];

    for i in range (1, k+1) :
        for j in range(1, n) :
            base[j] += base[j-1];

    return base[n-1];
            

if __name__ == "__main__" :
    T = int(input());

    for t in range(T) :
        k = int(input());
        n = int(input());

        print(ans(k,n));
