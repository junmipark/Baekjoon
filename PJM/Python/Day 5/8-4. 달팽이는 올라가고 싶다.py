# V: 나무 막대 높이, A: 낮에 올라가는 거리, B: 밤에 미끄러지는 거리

import math;

if __name__ == "__main__" :
    D = input().split(); # D : Distance

    A = int(D[0]);
    B = int(D[1]);
    V = int(D[2]);

    n = (V-B) / (A-B)

    print(math.ceil(n));
