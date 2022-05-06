/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CodeGenerator;

import model.Compiler.ParseTree;
import model.Compiler.SymbolTable;
import model.UIGenerator.Button.UIButton;
import model.UIGenerator.JavaUIGenerator;
import model.UIGenerator.UIElement;
import model.UIGenerator.UIGenerator;

/**
 *
 * @author joaqu
 */
public class JavaCodeGenerator implements CodeGenerator{
    
    private UIGenerator uiGenerator;

    public JavaCodeGenerator() {
        this.uiGenerator = new JavaUIGenerator();
    }
    
    @Override
    public String generate(ParseTree parseTree, SymbolTable symbolTable) {
        /*
        
            This function will generate Java code based on the parseTree and SymbolTable
        
            To render UI, the class only needs to use the uiGenerator Object and its methods depending on what the code needs to render
        
        */
        
        // Example of creating and rendering UIElement
        UIButton button1 = uiGenerator.createButton();
        button1.render();
        button1.onClick();
        
        // should return generated code
        return "";
    }
}
