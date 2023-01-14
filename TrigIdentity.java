// good
public class TrigIdentity {
    public static void main(String[] args) {
        System.out.println("user provided arguments: " + args[0]);
        double theta = Double.parseDouble(args[0]);
        
        double thetasin = Math.sin(theta);
        double thetacos = Math.cos(theta);

        double sinsq = Math.pow(thetasin, 2);
        double cossq = Math.pow(thetacos, 2);
        
        
        double result;
        result = sinsq + cossq;
        System.out.println("(" + args[0] + ") = " + result);
        
    }
}
