/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.CodeGenerator;

import model.Compiler.ParseTree;
import model.Compiler.SymbolTable;

/**
 *
 * @author joaqu
 */
public interface CodeGenerator {
    public String generate(ParseTree parseTree, SymbolTable symbolTable);
}
