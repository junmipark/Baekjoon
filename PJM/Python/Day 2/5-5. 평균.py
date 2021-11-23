if __name__ == "__main__" :

    size = int(input());
    score = input().split();

    M = 0;
    SUM = 0;

    for i in range(size) :
        n = int(score[i]);
        if n > M :
            M = n;
        SUM += n;

    print(SUM/M*100/size);
