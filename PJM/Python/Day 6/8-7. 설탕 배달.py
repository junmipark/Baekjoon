def ans(N) :
    N_3 = N;
    N_5 = N;
    for b in range(N) :
        if (N-3*b) % 5 == 0 :
            
            tmp_3 = b;
            tmp_5 = (N - tmp_3 * 3) // 5;

            if tmp_3 + tmp_5 > N_3 + N_5 or tmp_3 < 0 or tmp_5 < 0 :
                continue;
            else :
                N_3 = tmp_3;
                N_5 = tmp_5;

    if N_3*3 + N_5*5 != N :
        return -1;
    else :
        return N_3 + N_5;

if __name__ == "__main__" :
    N = int(input());

    print(ans(N));
