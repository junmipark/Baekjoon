if __name__ == "__main__" :
    num = input().split();

    N = int(num[0]);
    X = int(num[1]);

    seq = input().split();

    res = list();
    for n in seq :
        if int(n) < X :
            res.append(n);

    print(' '.join(res));
