if __name__ == "__main__" :
    cnt = int(input());

    for i in range(cnt) :
        for j in range(i+1) :
            if (j==i) :
                print('*');
            else :
                print('*', end='');
