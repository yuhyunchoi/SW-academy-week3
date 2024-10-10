public class Exam6 {

    static double innerProduct(double[] x, double[] y){
        double result = 0;
        
        for(int i = 0; i < x.length; i++){
            result += x[i]*y[i];
        }
        return result;
    }
    
    static double[][] outerProduct(double[] x, double[] y){

    }

    public static void main(String[] args) {
        double[] x = {1.1, 2.2, 3.3, 4.4};
        double[] y = {1.9, 2.4, 5.4, 5.3};
        
        System.out.println(innerProduct(x, y));
        
    }
  
}
