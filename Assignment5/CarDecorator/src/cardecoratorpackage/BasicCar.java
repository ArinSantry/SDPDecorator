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
public class BasicCar implements Car {
    @Override
    public String getDesc()
    {
        return "Basic car";
    }
    
    @Override
    public double getPrice()
    {
        return 4000;
    }
}
