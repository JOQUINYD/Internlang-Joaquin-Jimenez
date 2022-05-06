/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UIGenerator;

import model.UIGenerator.Button.PythonButton;
import model.UIGenerator.Button.UIButton;
import model.UIGenerator.Window.PythonWindow;

/**
 *
 * @author joaqu
 */
public class PythonUIGenerator implements UIGenerator{

    @Override
    public UIButton createButton() {
        return new PythonButton();
    }

    @Override
    public UIElement createWindow() {
        return new PythonWindow();
    }
    
}
