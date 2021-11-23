if __name__ == "__main__" :
    time = input().split();

    hour = int(time[0]);
    minute = int(time[1]);

    if hour == 0 :
        hour = 24;

    tot = hour * 60 + minute;
    after = tot - 45;

    hour = after // 60;
    minute = after % 60;

    if hour == 24:
        hour = 0;
    
    print(str(hour) + " " + str(minute));
