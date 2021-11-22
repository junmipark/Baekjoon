if __name__ == "__main__" :
    input_num = input().split();

    num1 = int(input_num[0]);
    num2 = int(input_num[1]);

    if num1 > num2 :
        print(">");
    elif num1 < num2 : 
        print("<");
    else :
        print("==")
