if __name__ == "__main__" :
    word = input();

    cnt = dict();
    for c in word :
        c = c.lower();
        if c in cnt :
            cnt[c] += 1;
        else :
            cnt[c] = 1;

    res_max = 0;
    res = '?';

    for c in cnt :
        if cnt[c] > res_max :
            res_max = cnt[c];
            res = c.upper();
        elif cnt[c] == res_max :
            res = '?';
        
    print(res);
