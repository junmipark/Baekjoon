if __name__ == "__main__" :

    T = int(input());

    for j in range(T) :
        INPUT = input().split();

        R = int(INPUT[0]);
        S = INPUT[1];
        for C in S :
            for i in range(R) :
                print(C, end="");
        print();
