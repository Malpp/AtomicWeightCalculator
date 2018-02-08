package com.v41.tp1.modele;

public class Token {
    private String content;
    private TokenType type;

    public Token(String content, TokenType type){
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public TokenType getType() {
        return type;
    }
}
