if __name__ == "__main__" :
    N = int(input());
    
    num = input().split();

    i = 0;
    s = 2;
    cnt = 0;
    
    for n in num :
        nn = int(n);
        for m in range(2, nn+1) :
            if nn % m == 0 :
                if nn == m :
                    i+=1;
                    break;
                else :
                    break;
            else :
                continue;
    print(i);
