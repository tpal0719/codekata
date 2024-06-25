package com.sparta.codeKata;

/*
링크 :  https://school.programmers.co.kr/learn/courses/30/lessons/68935
제목 : 3진법 뒤집기
 */
public class NO68935 {
    public static void main(String[] args) {
        System.out.println(solution(45));
    }

    public static int solution(int n){
        int answer = 0;
        while(n > 0) {
            answer *= 3;
            answer += n % 3;
            n /= 3;
        }
        return answer;
    }
}
