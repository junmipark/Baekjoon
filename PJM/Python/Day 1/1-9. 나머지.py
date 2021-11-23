if __name__ == "__main__" :
    num1 = int(input());
    num2 = int(input());
    res = list();

    for i in range(3) :
        res.append((num1 * (num2%10)));
        print(res[i]);
        num2 = num2 // 10;
    print(res[0] + res[1]*10 + res[2]*100);
