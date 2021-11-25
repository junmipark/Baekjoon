if __name__ == "__main__" :
    N = int(input());

    res = 0;
    for n in range(N) :
        word = input();

        ans = dict();
        flag = False;
        for i in range(len(word)) :
            if word[i] in ans :
                if ans[word[i]]+1 < i :
                    flag = True;
                    break;
            ans[word[i]] = i;

        if flag is not True :
            res += 1;
            
    print(res);
