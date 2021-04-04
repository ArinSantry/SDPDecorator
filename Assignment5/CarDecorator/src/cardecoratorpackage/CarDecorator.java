/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardecoratorpackage;

/**
 *
 * @author erins
 */
public abstract class CarDecorator implements Car {
    
    @Override
    public String getDesc()
    {
        return "Add-ons";
    }
    
}
