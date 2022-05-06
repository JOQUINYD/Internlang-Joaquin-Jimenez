/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.CodeGenerator;

/**
 *
 * @author joaqu
 */
public class CodeGeneratorFactory {
    public static CodeGenerator createCodeGenerator(TargetCode targetCode){
        return switch (targetCode) {
            case PYTHON -> new PythonCodeGenerator();
            case JAVA -> new JavaCodeGenerator();
            case CSHARP -> new CsharpCodeGenerator();
            case TYPESCRIPT -> new TypescriptCodeGenerator();
            default -> null;
        };
    }
}
