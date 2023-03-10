package org.example;

public class Main {
    public static void main(String[] args) {
    }
}

class Calc {
    static int run(String exp) {
        int answer = 0;
        if (exp.contains("+")) {
            String[] bits = exp.split(" \\+ ");
            for (int i = 0; i < bits.length; i++) {
                answer += Integer.parseInt(bits[i]);
            }
        } else if (exp.contains("-")) {
            String[] bits = exp.split(" - ");
            int a = Integer.parseInt(bits[0]);
            int b = Integer.parseInt(bits[1]);
            return a - b;
        }
        return answer;
    }
}