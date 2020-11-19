package edu;

public class FunctionZadanie1 implements FunctionsToEvaluate
{
    public double trueValue;

    public FunctionZadanie1(double trueValue) {
        this.trueValue = trueValue;
    }

    public double getTrueValue() {
        return trueValue;
    }

    public void setTrueValue(double trueValue) {
        this.trueValue = trueValue;
    }

    @Override
    public String toString() {
        return "FunctionZadanie1{" +
                "trueValue=" + trueValue +
                '}';
    }

    @Override
    public double functionValue(double c)
    {
        double g = 9.81;
        double t = 10.0;
        double v = 40.0;
        double m = 68.1;
        return ((g*m)/c)*(1-Math.exp((-c*t)/m))-v;
    }
}
