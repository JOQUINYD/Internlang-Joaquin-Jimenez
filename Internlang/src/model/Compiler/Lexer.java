/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Compiler;

import java.util.ArrayList;

/**
 *
 * @author joaqu
 */
public class Lexer {
    private String code;

    public Lexer(String code) {
        this.code = code;
    }
       
    public ArrayList<Token> scan(){
        ArrayList<Token> tokens = new ArrayList<Token>();
        /*
            this function will create an array list of the tokens identified in the code
        */
        return tokens;
    }
}
