package edu;

public class Main {

    public static void main(String[] args)
    {
        FunctionZadanie1 func = new FunctionZadanie1(40);
        BisectionMethod metBisection = new BisectionMethod();
        double error = 1.0E-15;

        System.out.println("BISECTION METHOD");
        metBisection.bisectionMethod(func, 12, 16, error);
        FunctionZadanie2 func2 = new FunctionZadanie2(3.3891);
        // metBisection.bisectionMethod(func2, -10, 20, 100);
        System.out.println("\n\n");
        System.out.println("FALSE POSITION METHOD");
        FalsePositionMethod metFalse = new FalsePositionMethod();
        metFalse.falseMethod(func2, 2, 4, error);
        System.out.println("\n\n");
        System.out.println("FIXED POINT METHOD");
        FixedPointMethod fixedPointMethod = new FixedPointMethod();
        fixedPointMethod.fixedPoint(func2, 0.1, 50, error);
        System.out.println("\n\n");
        System.out.println("NEWTON RAPHSON METHOD");
        NewtonRaphsonMethod newtonRaphsonMethod = new NewtonRaphsonMethod();
        newtonRaphsonMethod.nRmethod(func2, 3, 10, error);
        System.out.println("\n\n");
        System.out.println("SECANT METHOD");
        SecantMethod secantMethod = new SecantMethod();
        secantMethod.secantMethod(func2, 2,3,error,10);



    }
}
