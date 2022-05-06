/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Compiler;

/**
 *
 * @author joaqu
 */
public class SemanticAnalyzer {
    private SymbolTable symbolTable;
    private ParseTree parseTree;

    public SemanticAnalyzer(SymbolTable symbolTable, ParseTree parseTree) {
        this.symbolTable = symbolTable;
        this.parseTree = parseTree;
    }
    
    public void verifyParseTree(){
        /*
            This function will verify the parse treee
        */
    }
    
    
}
