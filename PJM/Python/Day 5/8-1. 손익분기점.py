# A = 고정비용 B = 가변비용 C = 책정된 가격
# A + B * n = C * n
# A = (C-B) * n
# n = A / (C-B)

if __name__ == "__main__" :
    price = input().split();

    A = int(price[0]);
    B = int(price[1]);
    C = int(price[2]);

    if C-B == 0 :
        n = -1;
    else :
        n = A / (C-B);

    if  n < 0 : n = -1;
    else : n += 1;

    print(int(n));
