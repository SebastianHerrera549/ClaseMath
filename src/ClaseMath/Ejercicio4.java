package ClaseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double var1 = (double) (Math.random() * 50) + 1;
		double var2 = (double) (Math.random() * 50) + 1;
		System.out.println("la primera variable es :"+Math.round(var1));
		System.out.println("la segunda variable es :"+Math.round(var2));
		System.out.println("la variable Mayor es :"+ Math.round(Math.max(var2,var1)));
	}

}
