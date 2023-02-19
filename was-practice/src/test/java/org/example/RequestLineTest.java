package org.example;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class RequestLineTest {

    @Test
    void create() {
        RequstLine requestLine = new RequstLine("GET /calculate?operand1=11&operator=*&operand2=55 HTTP/1.1");

        assertThat(requestLine).isNotNull();
        assertThat(requestLine).isEqualTo(new RequstLine("GET", "/calculate", "operand1=11&operator=*&operand2=55"));
    }
}
