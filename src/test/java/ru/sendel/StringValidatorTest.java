package ru.sendel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    @Test
    void validate() {
        assertTrue(StringValidator.isValid("\"12345678901\""));
        assertTrue(StringValidator.isValid("\"111\";\"123\";\"222\""));
        assertTrue(StringValidator.isValid("\"111\";\"123\";\"222\""));
        assertTrue(StringValidator.isValid("\"300\";;\"100\""));


        assertFalse(StringValidator.isValid(""));
        assertFalse(StringValidator.isValid("8383\"200000741652251"));
        assertFalse(StringValidator.isValid("79855053897\"83100000580443402\";\"200000133000191"));
    }

}