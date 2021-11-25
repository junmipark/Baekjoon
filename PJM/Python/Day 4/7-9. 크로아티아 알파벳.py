if __name__ == "__main__" :
    alpha = [];

    string = input().strip();

    i = 0;
    while i < len(string) :
        if i < len(string)-1 :
            croatia = string[i:i+2];
            if croatia == "dz" and i<len(string)-2 and string[i+2] == '=' :
                alpha.append("dz=");
                i += 3;
                continue;
            elif croatia in ["c=", "c-", "d-", "lj", "nj", "s=", "z="] :
                alpha.append(croatia);
                i += 2;
                continue;
        alpha.append(string[i]);
        i += 1;
        
    print(len(alpha));
