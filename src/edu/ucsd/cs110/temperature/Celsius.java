package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = this.getValue();
        temp = temp*1.8f+32;
        return new Fahrenheit(temp);
    }

    public String toString()
    {
        return ""+getValue()+" C";
    }
}
