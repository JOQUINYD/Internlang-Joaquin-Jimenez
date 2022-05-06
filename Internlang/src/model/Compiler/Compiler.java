/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Compiler;

import model.CodeGenerator.CodeGenerator;
import model.CodeGenerator.CodeGeneratorFactory;
import model.CodeGenerator.CsharpCodeGenerator;
import model.CodeGenerator.JavaCodeGenerator;
import model.CodeGenerator.PythonCodeGenerator;
import model.CodeGenerator.TargetLanguage;
import model.CodeGenerator.TypescriptCodeGenerator;

/**
 *
 * @author joaqu
 */
public class Compiler {
    private Lexer lexer;
    private Parser parser;
    private SemanticAnalyzer semanticAnalyzer;
    private CodeGenerator codeGenerator;
    
    public String compile(String code, TargetLanguage targetLanguage){
        SymbolTable symbolTable = new SymbolTable();
        ParseTree parseTree = new ParseTree();
        
        this.lexer = new Lexer(code);
        this.parser = new Parser(symbolTable, parseTree);
        this.semanticAnalyzer = new SemanticAnalyzer(symbolTable, parseTree);
        
        this.parser.parse(this.lexer.scan());
        this.semanticAnalyzer.verifyParseTree();
        
        this.codeGenerator = CodeGeneratorFactory.createCodeGenerator(targetLanguage);
        
        return this.codeGenerator.generate(parseTree, symbolTable);
    }
}
