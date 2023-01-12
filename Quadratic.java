public class Quadratic {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        double bsq = Math.pow(b, 2);
        double result1 =  (-b + Math.sqrt(bsq - (4 * a * c))) / (2 * a);
        double result2 =  (-b - Math.sqrt(bsq - (4 * a * c))) / (2 * a);
        System.out.println(result1 + "," + result2);
        



    }
}
