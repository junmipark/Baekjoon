import sys

if __name__ == "__main__" :
    cnt = int(sys.stdin.readline().rstrip());

    for i in range(cnt) :
        num = sys.stdin.readline().rstrip().split();
        a = int(num[0]);
        b = int(num[1]);
        print(a+b);
