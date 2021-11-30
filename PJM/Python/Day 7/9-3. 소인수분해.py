if __name__ == "__main__" :
    N = int(input());

    i = 2;
    
    while N != 1 :
        if N % i == 0 :
            N = N // i;
            print(i);
        else :
            i += 1;
