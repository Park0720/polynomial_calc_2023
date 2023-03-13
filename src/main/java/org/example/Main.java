package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
    }
}

class Calc {
    public static int run(String exp) {
        // 단일항이 입력되면 바로 리턴
        if ( !exp.contains(" ") ) return Integer.parseInt(exp);

        boolean needToMulti = exp.contains(" * ");
        boolean needToPlus = exp.contains(" + ") || exp.contains(" - ");

        boolean needToCompound = needToMulti && needToPlus;

        if ( needToCompound ) {
            String[] bits = exp.split(" \\+ ");

            String newExp = Arrays.stream(bits)
                    .mapToInt(Calc::run)
                    .mapToObj(e -> e + "")
                    .collect(Collectors.joining(" + "));

            return run(newExp);
        }
        else if ( needToPlus ) {
            exp = exp.replaceAll("- ", "+ -");

            String[] bits = exp.split(" \\+ ");

            int sum = 0;

            for (int i = 0; i < bits.length; i++) {
                sum += Integer.parseInt(bits[i]);
            }

            return sum;
        }
        else if ( needToMulti ) {
            String[] bits = exp.split(" \\* ");

            int sum = 1;

            for (int i = 0; i < bits.length; i++) {
                sum *= Integer.parseInt(bits[i]);
            }

            return sum;
        }

        throw new RuntimeException("올바른 계산식이 아닙니다.");
    }



    /* static int run(String exp) {
        int answer = 1;
        exp = exp.replaceAll("- ", "+ -");
        if (exp.contains("+") && exp.contains("*")) {
            String[] bits = exp.split(" \\+ ");
            for (int i = 0; i < bits.length; i++) {
                if (bits[i].contains("*")) {
                    String[] bits2 = bits[i].split(" \\* ");
                    for (int j = 0; j < bits2.length; j++) {
                        answer *= Integer.parseInt(bits2[j]);
                        bits[i]=answer+"";
                    }
                    i=0;
                    answer += Integer.parseInt(bits[i]);
                }
            }
        } else if (exp.contains("+")) {
            answer = 0;
            String[] bits = exp.split(" \\+ ");
            for (int i = 0; i < bits.length; i++) {
                answer += Integer.parseInt(bits[i]);
            }
        }
        else if (exp.contains("*")) {
            answer = 1;
            String[] bits = exp.split(" \\* ");
            for (int i = 0; i < bits.length; i++) {
                answer *= Integer.parseInt(bits[i]);
            }
        }
        return answer;
    } */
}