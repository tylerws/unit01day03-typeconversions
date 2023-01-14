// well commented and laid out; nice work
class DoubleOps {
    public static void main(String[] args) {
        System.out.println("user provided arguments: " + args[0] + " and " + args[1]);

        // demo of Math.abs
        double firstArgument = Double.parseDouble(args[0]);
        double absresult;
        absresult = Math.abs(firstArgument);
        System.out.println("Math.abs(" + args[0] + ") = " + absresult);

        // demo of Math.sin
        double sinresult;
        sinresult = Math.sin(firstArgument);
        System.out.println("Math.sin(" + args[0] + ") = " + sinresult);

        // demo of Math.pow
        double secondArgument = Double.parseDouble(args[1]);
        double powresult;
        powresult = Math.pow(firstArgument, secondArgument);
        System.out.println("Math.pow(" + args[0] + ", " +  args[1] + ") = " + powresult);

        // demo of squre root
        double sqrtresult;
        sqrtresult = Math.sqrt(firstArgument);
        System.out.println("Math.sqrt(" + args[0] + ") = " + sqrtresult);
    
    }
}