if __name__ == "__main__" :

    N = int(input());

    seq = input();

    SUM = 0;
    for i in range(N) :
        SUM += int(seq[i]);

    print(SUM);
