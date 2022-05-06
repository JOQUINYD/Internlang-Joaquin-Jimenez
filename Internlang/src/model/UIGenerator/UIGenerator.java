/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model.UIGenerator;

import model.UIGenerator.Button.UIButton;

/**
 *
 * @author joaqu
 */
public interface UIGenerator {
    public UIButton createButton();
    public UIElement createWindow();
    
    /*
        as we increase the number of UIElements, we need to add the corresponding methods in this interface
        that way, all classes that implement it, will have the same methods to create them
    */
}
