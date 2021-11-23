if __name__ == "__main__" :
    seq = list();

    for i in range(9) :
        seq.append(int(input()));

    res = seq[0];
    idx = 0;

    for i in range(9) :
        if seq[i] > res :
            res = seq[i];
            idx = i;

    print(res);
    print(idx+1);
