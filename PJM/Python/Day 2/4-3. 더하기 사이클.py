if __name__ == "__main__" :
    num = int(input());
    origin = num;
    
    cnt = 0;
    while 1 :
        a = num // 10;
        b = num % 10;

        c = a+b;
        num = b * 10  + c % 10;
        cnt += 1;
        if num == origin :
            break;

    print(cnt);
