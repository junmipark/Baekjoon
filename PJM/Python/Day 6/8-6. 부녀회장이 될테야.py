def ans(k,n) :
    ans_dict = dict();
    
    for j in range(k+1) :
        for i in range(1, n+1) :
            if j == 0 :
                ans_dict[str(j) + str(i)] = i;
            else :
                ans_dict[str(j) + str(i)] = 0;
                for w in range(1, i+1) :
                    ans_dict[str(j) + str(i)] += ans_dict[str(j-1) + str(w)];

    return ans_dict[str(k) + str(n)];

if __name__ == "__main__" :
    T = int(input());

    for t in range(T) :
        k = int(input());
        n = int(input());

        print(ans(k,n));
