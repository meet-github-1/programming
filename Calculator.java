import java.util.*;
public class Calculator{
        private int precision;
        public Calculator(int precision){
            this.precision=precision;
        }
	public double add(double a,double b) {
		return Doule.parseDouble(String.format("%."+Integer.toString(precision)+"f",a+b));
	}
	public double subtract(double a,double b) {
		return Doule.parseDouble(String.format("%."+Integer.toString(precision)+"f",a-b));;
	}
	public double multiply(double a,double b) {
		return Doule.parseDouble(String.format("%."+Integer.toString(precision)+"f",a*b));;
	}
	public double divide(double a,double b){
		if(b==0) {
			if(a>0)
				return Double.POSITIVE_INFINITY;
			else
				return Double.NEGATIVE.INFINITY;

		}
		return Doule.parseDouble(String.format("%."+Integer.toString(precision)+"f",a/b));;
	}
    public static void main(String[] args) {
    	Calculator c1=new Calculator();
    	Scanner in=new Scanner(System.in);
    	double a=10.1;
        double b=20.0;
        double result=c1.add(a,b);
        double exre=30.1;
        System.out.println(result==exre);

    }
}
