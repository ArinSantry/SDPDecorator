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
public class LeatherSeats extends CarDecorator {
    
    public final Car car;
    
    public LeatherSeats(Car car)
    {
        this.car = car;
    }
    
    @Override
    public String getDesc()
    {
        return car.getDesc() + ", leather seats";
    }
    
    @Override
    public double getPrice()
    {
        return car.getPrice() + 500;
    }
    
}
