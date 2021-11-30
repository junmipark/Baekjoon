if __name__ == "__main__" :
    T = int(input());

    for t in range(T) :
        num = input().split();

        x = int(num[0]);
        y = int(num[1]) - 1;

        k = 1;

        i = 0;
        
        while x < y :
            if x + k <= y :
                if (y-x) % k != 0 :
                    x += k;
                    i += 1;
                else :
                    x += k;
                    k += 1;
                    i += 1;
            else :
                k -= 1;
                
        print( i+1 );
