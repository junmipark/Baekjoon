if __name__ == "__main__" :
    seq = [ 0 for i in range(10) ];

    n1 = int(input());
    n2 = int(input());
    n3 = int(input());

    res = n1 * n2 * n3;

    while 1 :
        if res // 10 == 0 and res % 10 == 0 :
            break;
        n = res % 10;
        seq[n] += 1;

        res = res // 10;

    for n in seq :
        print(n);
