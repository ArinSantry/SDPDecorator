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
public class AllWheelDrive extends CarDecorator {
    private final Car car;
    
    public AllWheelDrive(Car car)
    {
        this.car = car;
    }
    
    @Override
    public String getDesc()
    {
        return car.getDesc() + ", all wheel drive";
    }
    
    @Override
    public double getPrice()
    {
        return car.getPrice() + 1000;
    }
}
