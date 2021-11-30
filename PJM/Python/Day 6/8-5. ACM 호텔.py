def ans(H, W, N) :
    if N == 1:
        return "101";

    h = 1;
    w = 1;
    i = 1;

    while i <= H * W :
        while h <= H :
            if i == N :
                if w < 10 :
                    return str(h) + "0" + str(w);
                else :
                    return str(h) + str(w);

            h += 1;
            i += 1;
        h = 1;
        w += 1;
            
if __name__ == "__main__" :
    T = int(input());

    for t in range(T) :
         num = input().split();
         H = int(num[0]);
         W = int(num[1]);
         N = int(num[2]);

         print(ans(H, W, N));
