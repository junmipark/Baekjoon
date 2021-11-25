if __name__ == "__main__" :
    dial = dict();

    for c in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ' :
        if c in 'ABC' :
            dial[c] = 1;
        elif c in 'DEF' :
            dial[c] = 2;
        elif c in 'GHI' :
            dial[c] = 3;
        elif c in 'JKL' :
            dial[c] = 4;
        elif c in 'MNO' :
            dial[c] = 5;
        elif c in 'PQRS' :
            dial[c] = 6;
        elif c in 'TUV' :
            dial[c] = 7;
        elif c in 'WXYZ' :
            dial[c] = 8;
    
    call = input();

    min_call = 0;

    for c in call :
        min_call += dial[c];

    min_call += (len(call)) * 2;
    
    print(min_call);
