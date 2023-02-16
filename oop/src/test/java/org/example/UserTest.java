package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("페스워드가 요구상황에 부합하지 않아 초기화가 되지 않는다")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        //whin
        user.initPassword(new WrongFixedPasswordGenrator());

        //then
        assertThat(user.getPassword()).isNull();
    }
}