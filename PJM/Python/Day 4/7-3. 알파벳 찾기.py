if __name__ == "__main__" :
    N = ord('z') - ord('a');

    alpha = dict();
    
    for i in range(N+1) :
        alpha[ord('a') + i] = '-1';

    S = input();

    for s in S :
        if ord(s) in alpha :
            if alpha[ord(s)] == '-1' :
                alpha[ord(s)] = str(S.index(s));
                
    print(' '.join(alpha.values()).rstrip());
