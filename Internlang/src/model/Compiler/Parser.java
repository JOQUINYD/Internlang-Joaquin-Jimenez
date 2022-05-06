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
public class Parser {
    private SymbolTable symbolTable;
    private ParseTree parseTree;

    public Parser(SymbolTable symbolTable, ParseTree parseTree) {
        this.symbolTable = symbolTable;
        this.parseTree = parseTree;
    }
    
    public void parse(ArrayList<Token> tokens){
        /*
            this function will add information regarding attribute type, scope, dimension, line of reference, use, etc in the symbolTable
            this function will fill the parseTree based on the ArrayList of tokens
        */
    }
    
}
