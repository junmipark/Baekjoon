if __name__ == "__main__" :
    x = int(input());
    y = int(input());

    quadrant = 0;

    if x > 0 :
        if y > 0 :
            quadrant = 1;
        else :
            quadrant = 4;
    else :
        if y > 0 :
            quadrant = 2;
        else :
            quadrant = 3;

    print(quadrant);
