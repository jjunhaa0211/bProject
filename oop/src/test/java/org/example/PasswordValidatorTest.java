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
    }
}
