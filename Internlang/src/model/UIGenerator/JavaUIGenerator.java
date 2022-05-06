/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UIGenerator;

import model.UIGenerator.Button.JavaButton;
import model.UIGenerator.Button.UIButton;
import model.UIGenerator.Window.JavaWindow;

/**
 *
 * @author joaqu
 */
public class JavaUIGenerator implements UIGenerator{
    
    @Override
    public UIButton createButton() {
        return new JavaButton();
    }

    @Override
    public UIElement createWindow() {
        return new JavaWindow();
    }
}
