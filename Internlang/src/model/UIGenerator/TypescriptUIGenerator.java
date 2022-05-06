/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UIGenerator;

import model.UIGenerator.Button.TypescriptButton;
import model.UIGenerator.Button.UIButton;
import model.UIGenerator.Window.TypescriptWindow;

/**
 *
 * @author joaqu
 */
public class TypescriptUIGenerator implements UIGenerator{

    @Override
    public UIButton createButton() {
        return new TypescriptButton();
    }

    @Override
    public UIElement createWindow() {
        return new TypescriptWindow();
    }
    
}
