package org.example.password;

import org.example.password.PasswordGeneratePolicy;

public class CorrectFixedPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
