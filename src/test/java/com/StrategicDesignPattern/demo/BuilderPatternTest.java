package com.StrategicDesignPattern.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BuilderPatternTest {

    @Test
    public void CarTest()
    {
        Car car =new CarBuilder()
                .setName("Audi")
                .setCarType("Sedan")
                .setEngineCC("2000")
                .setFuelType("Diesel")
                .getCarObject();
        assertEquals(car.getName(),"Audi");
        assertEquals(car.getCarType(),"Sedan");
        assertEquals(car.getEngineCC(),"2000");
        assertEquals(car.getFuelType(),"Diesel");
        assertEquals(car.getSunroof(),null);
        assertEquals(car.getInteriorType(),null);
    }
}
