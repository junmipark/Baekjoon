if __name__ == "__main__" :
    case_num = int(input());

    for i in range(case_num) :
        student = input().split();
    
        size = int(student.pop(0));

        tot = 0;
        
        for j in range(size) :
            tot += int(student[j]);

        avg = tot/size;

        cnt = 0;
        
        for j in range(size) :
            if int(student[j]) > avg :
                cnt += 1;

        res = (cnt/size) * 100;
        str_res = '%0.3f'% res;
        
        print(str_res + "%");
