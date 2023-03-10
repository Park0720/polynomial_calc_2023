package org.example;

public class Main {
    public static void main(String[] args) {
    }
}

class Calc {
    static int run(String exp) {
        int answer = 1;
        exp = exp.replaceAll("- ", "+ -");
        if (exp.contains("+")) {
            answer = 0;
            String[] bits = exp.split(" \\+ ");
            for (int i = 0; i < bits.length; i++) {
                answer += Integer.parseInt(bits[i]);
            }
        } else if (exp.contains("*")) {
            answer = 1;
            String[] bits = exp.split(" \\* ");
            for (int i = 0; i < bits.length; i++) {
                answer *= Integer.parseInt(bits[i]);
            }
        }
        return answer;
    }
}