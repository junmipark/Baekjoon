def ans(X) :
    pre = 1;
    post = 1;
    n = 1;
    
    x = 1;

    
    while x>= 1 and x<=10000000 :
        if X > ((pre + post) * n) / 2 :
            x += n;
        while x <= ((pre + post) * n) / 2:
            if x == X :
                if (pre + post) % 2 == 1 :
                    return str(pre) + "/" + str(post);
                else :
                    return str(post) + "/" + str(pre);
            pre = pre + 1;
            post = post - 1;
            x += 1;
        n += 1;
        post = n;
        pre = 1;
            
if __name__ == "__main__" :
    X = int(input());

    print(ans(X));
  
