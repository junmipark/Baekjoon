if __name__ == "__main__" :
    cnt = int(input());

    for i in range(cnt) :
        num = input().split();

        a = int(num[0]);
        b = int(num[1]);

        str_sum = "Case #" + str(i+1) + ": " + num[0] + " + " + num[1] + " = " + str(a+b);
        print(str_sum);
