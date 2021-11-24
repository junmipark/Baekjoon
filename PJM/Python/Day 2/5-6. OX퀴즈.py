if __name__ == "__main__" :
    cnt = int(input());
    
    for i in range(cnt) :
        ans = input();

        num = 0;
        score = 0;
        for OX in ans :
            if OX == 'O' :
                num += 1;
            else :
                num = 0;
            score += num;
        print(score);
