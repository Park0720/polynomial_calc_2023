package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTests {
    @Test
    @DisplayName("1 + 1 == 2")
    void t1() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 == 3")
    void t2() {
        assertThat(Calc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 2 == 3")
    void t3() {
        assertThat(Calc.run("2 + 2")).isEqualTo(4);
    }

    @Test
    @DisplayName("1000 + 280 == 1280")
    void t4() {
        assertThat(Calc.run("1000 + 280")).isEqualTo(1280);
    }

    @Test
    @DisplayName("50 - 30 == 20")
    void t5() {
        assertThat(Calc.run("50 - 30")).isEqualTo(20); // 구현
    }
    @Test
    @DisplayName("5 - 3 == 2")
    void t6() {
        assertThat(Calc.run("5 - 3")).isEqualTo(2); // 구현
    }
    @Test
    @DisplayName("100 - 20 == 80")
    void t7() {
        assertThat(Calc.run("100 - 20")).isEqualTo(80); // 구현
    }
    @Test
    @DisplayName("10 + 20 + 30 == 60")
    void t8() {
        assertThat(Calc.run("10 + 20 + 30")).isEqualTo(60);
    }
    @Test
    @DisplayName("100 - 20 - 30 == 50")
    void t10() {
        assertThat(Calc.run("100 - 20 - 30")).isEqualTo(50);
    }
    @Test
    @DisplayName("100 + 20 - 30 == 90")
    void t11() {
        assertThat(Calc.run("100 + 20 - 30")).isEqualTo(90);
    }
    @Test
    @DisplayName("10 * 10 == 100")
    void t12() {
        assertThat(Calc.run("10 * 10")).isEqualTo(100);
    }
    @Test
    @DisplayName("10 * -10  == -100")
    void t13() {
        assertThat(Calc.run("10 * -10")).isEqualTo(-100);
    }
    @Test
    @DisplayName("10 * 10 * 10 == 1000")
    void t14() {
        assertThat(Calc.run("10 * 10 * 10")).isEqualTo(1000);
    }
    @Test
    @DisplayName("10 + 5 * 2 == 20")
    void t15() {
        assertThat(Calc.run("10 + 5 * 2")).isEqualTo(20);
    }
    @Test
    @DisplayName("20 + 10 + 5 * 2 == 40")
    void t16() {
        assertThat(Calc.run("20 + 10 + 5 * 2")).isEqualTo(40);
    }

    @Test
    @DisplayName("10 * 20 + 10 + 5 * 2 == 220")
    void t17() {
        assertThat(Calc.run("10 * 20 + 10 + 5 * 2")).isEqualTo(220);
    }
    @Test
    @DisplayName("(10 + 20) == 30")
    void t18() {
        assertThat(Calc.run("(10 + 20)")).isEqualTo(30);
    }
    @Test
    @DisplayName("((10 + 20)) == 30")
    void t19() {
        assertThat(Calc.run("((10 + 20))")).isEqualTo(30);
    }
    @Test
    @DisplayName("(((10 + 20))) == 30")
    void t20() {
        assertThat(Calc.run("(((10 + 20)))")).isEqualTo(30);
    }
    @Test
    @DisplayName("(20 + 20) + 20 == 60")
    void t21() {
        assertThat(Calc.run("(20 + 20) + 20")).isEqualTo(60);
    }
    @Test
    @DisplayName("((20 + 20)) + 20 == 60")
    void t22() {
        assertThat(Calc.run("((20 + 20)) + 20")).isEqualTo(60);
    }
    @Test
    @DisplayName("(20 + 20) * 20 == 800")
    void t23() {
        assertThat(Calc.run("(20 + 20) * 20")).isEqualTo(800);
    }
    @Test
    @DisplayName("(10 + 20) * 3 == 90")
    void t24() {
        assertThat(Calc.run("(10 + 20) * 3")).isEqualTo(90);
    }
    @Test
    @DisplayName("10 + (10 + 5) == 25")
    void t25() {
        assertThat(Calc.run("10 + (10 + 5)")).isEqualTo(25);
    }
    @Test
    @DisplayName("-(10 + 5) == -15")
    void t26() {
        assertThat(Calc.run("-(10 + 5)")).isEqualTo(-15);
    }
}
