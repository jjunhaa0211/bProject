package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("페스워드 초기화 여부를 판단한다.")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        //whin
        user.initPassword(new CorrectFixedPasswordGenrator());

        //then
        assertThat(user.getPassword()).isNotNull();
    }
}