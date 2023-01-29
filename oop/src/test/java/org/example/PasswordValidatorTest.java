package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상, 최대 12자 이하면 예외가 발생하지 않는다.") //해당 테스트코드의 의로를 적어둠
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> Passwordvalidate.validate("serverwizard"))
                .doesNotThrowAnyException();
        //assertThatCode는 코드 가독성 즉 어떤것이 안됬을 때의 경우를 처리한다
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다")
    @Test
    void validatePasswordTest2() {
        assertThatCode(() -> Passwordvalidate.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야한다.");
    }
}
