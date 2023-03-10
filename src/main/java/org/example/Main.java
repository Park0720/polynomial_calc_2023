package org.example;

public class Main {
    public static void main(String[] args) {
    }
}

class Calc {
    static int run(String exp) {
        int answer = 0;
        exp = exp.replaceAll("- ", "+ -");
        String[] bits = exp.split(" \\+ ");
        for (int i = 0; i < bits.length; i++) {
            answer += Integer.parseInt(bits[i]);
        }
        return answer;
    }
}