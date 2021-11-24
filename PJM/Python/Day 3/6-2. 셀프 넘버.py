def generate(n) :
    sum = 0;

    sum += n;
    
    while 1 :
        if n//10 == 0 and n%10 == 0 : 
            break;
        
        sum += n%10;
        n = n//10;
    
    return sum;

if __name__ == "__main__" :
    gen = dict();
    for i in range(10000) :
        gen[generate(i)] = 1;

    for i in range(10000) :
        if i in gen :
            continue;
        print(i);
