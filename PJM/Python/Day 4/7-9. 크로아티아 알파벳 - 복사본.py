# 다른 사람 답안

if __name__ == "__main__" :
    a = input()

    a = a.replace("c=", "!")\
        .replace("c-", "!")\
        .replace("dz=", "!")\
        .replace("d-", "!")\
        .replace("lj", "!")\
        .replace("nj", "!")\
        .replace("s=", "!")\
        .replace("z=", "!")
    print(len(a))
