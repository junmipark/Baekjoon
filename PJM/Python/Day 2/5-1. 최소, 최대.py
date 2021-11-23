if __name__ == "__main__" :
    size = int(input());
    seq = input().rstrip().split();

    min_seq = int(seq[0]);
    max_seq = int(seq[0]);

    for i in range(1, size) :
        n = int(seq[i]);
        if n < min_seq :
            min_seq = n;
        if n > max_seq :
            max_seq = n;

    print(str(min_seq) + " " + str(max_seq));
