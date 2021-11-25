if __name__ == "__main__" :
    s = input().split();

    words = dict();

    for word in s :
        if word in words :
            words[word] += 1;
        else :
            words[word] = 1;

    res = 0;
    for word in words :
        res += words[word];

    print(res);
