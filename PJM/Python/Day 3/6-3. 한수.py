def isSequence(n) :
    flag = False;

    a0 = n % 10;
    a1 = (n//10) % 10;

    d = a0 - a1;
    
    while 1 :
        if n//10 == 0: 
            break;

        an = n % 10;
        an1 = (n//10) % 10;

        dn = an - an1;

        if dn != d :
            flag = True;
            break;
        n = n//10;
    
    return flag;

if __name__ == "__main__" :
    seq = dict();
    testNum = int(input());

    for i in range(1, testNum+1) :
        if isSequence(i) :
            continue;
        seq[i] = 1;
    print(len(seq));
    
