package com.sparta.codeKata;


/*
링크 :  https://school.programmers.co.kr/learn/courses/30/lessons/12930
제목 : 이상한 문자 만들기
 */

public class NO12930 {

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s){
        String[] str = s.split("");

        String answer = "";
        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }

        return answer;
    }
}
