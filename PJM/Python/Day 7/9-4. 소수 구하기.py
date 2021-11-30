if __name__ == "__main__" :

    num = input().split();
    M = int(num[0]);
    N = int(num[1]);


    for i in range(M, N+1) :
        j = 2;
        while j*j <= i :
            if i % j == 0 :
                break;
            j += 1;
        if i % j != 0 :
            print(i);
