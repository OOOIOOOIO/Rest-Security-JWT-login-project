package com.sh.restsecurityjwt.exception.type;

public class JwtTokenExpiredException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public JwtTokenExpiredException(String message) {
        super(message);
    }
}
