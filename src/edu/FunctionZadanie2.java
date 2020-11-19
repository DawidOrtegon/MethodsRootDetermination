package edu;

public class FunctionZadanie2 implements FunctionsToEvaluate
{
    public double trueValue;

    public FunctionZadanie2(double trueValue) {
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
        return "FunctionZadanie2{" +
                "trueValue=" + trueValue +
                '}';
    }

    @Override
    public double functionValue(double x)
    {
        return Math.exp(x-(Math.sqrt(x)))-x;
    }

    public double firstDerivative(double x)
    {
        return Math.exp(x-(Math.sqrt(x)))*(1-(1/(2*Math.sqrt(x))))-1;
    }
}
