if __name__ == "__main__" :
    M = int(input());
    N = int(input());

    s = 0;
    m = 0;

    for i in range(M, N+1) :
        for j in range(2, i+1) :
            if i % j == 0:
                if i == j :
                    if m == 0 :
                        m = i;
                    s += i;
                else :
                    break;
            else :
                continue;
    if s == 0 :
        print(-1);
    else :
        print(s);
        print(m);
