/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UIGenerator.Button;

import model.UIGenerator.UIElement;

/**
 *
 * @author joaqu
 */
public class JavaButton implements UIButton{
    
    @Override
    public void render() {
        System.out.println("render java button");
    }
    
    @Override
    public void onClick() {
        System.out.println("button clicked");
    }
}
