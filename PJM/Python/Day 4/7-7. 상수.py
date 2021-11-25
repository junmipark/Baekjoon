if __name__ == "__main__" :
    nums = input().split();

    n1 = int(nums[0]);
    n2 = int(nums[1]);

    a1 = n1%10*100 + (n1//10)%10*10 + (n1//100)%100;
    a2 = n2%10*100 + (n2//10)%10*10 + (n2//100)%100;

    if a1 > a2 :
        print(a1);
    else :
        print(a2);
