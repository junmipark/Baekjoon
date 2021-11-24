if __name__ == "__main__" :
    cnt = int(input());

    for i in range(cnt) :
        for k in range(cnt-i-1) :
            print(' ', end='');
        for j in range(i+1) :
            if (j==i) :
                print('*');
            else :
                print('*', end='');
