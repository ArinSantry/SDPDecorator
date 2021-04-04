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
public class V8Engine extends CarDecorator {
    
    private final Car car;
    
    public V8Engine(Car car)
    {
        this.car = car;
    }
    
    @Override
    public String getDesc()
    {
        return car.getDesc() + ", V8 engine";
    }
    
    @Override
    public double getPrice()
    {
        return car.getPrice() + 3000;
    }
    
}
