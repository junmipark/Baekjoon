if __name__ == "__main__" :
    seq = list();
    res = dict();

    for i in range(10) :
        seq.append(int(input()) % 42);
        res[seq[i]] = 1;

    print(len(res));
