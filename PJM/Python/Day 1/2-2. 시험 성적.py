if __name__ == "__main__" :
    year = int(input());

    flag = 0;

    if year % 400 == 0 :
        flag = 1;
    elif year % 4 == 0 and year % 100 != 0 :
        flag = 1;

    print(flag);
