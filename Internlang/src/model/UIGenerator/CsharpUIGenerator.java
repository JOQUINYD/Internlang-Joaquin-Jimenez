/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UIGenerator;

import model.UIGenerator.Button.CsharpButton;
import model.UIGenerator.Button.UIButton;
import model.UIGenerator.Window.CsharpWindow;

/**
 *
 * @author joaqu
 */
public class CsharpUIGenerator implements UIGenerator{

    @Override
    public UIButton createButton() {
        return new CsharpButton();
    }

    @Override
    public UIElement createWindow() {
        return new CsharpWindow();
    }
    
}
