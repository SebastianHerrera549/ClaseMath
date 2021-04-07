package ClaseMath;

public class Ejercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1 = (int) (Math.random() * 10) + 1;
		int nota2 = (int) (Math.random() * 10) + 1;
		int nota3 = (int) (Math.random() * 10) + 1;
		int nota4 = (int) (Math.random() * 10) + 1;
		int nota5 = (int) (Math.random() * 10) + 1;
		double prom= (nota1+nota2+nota3+nota4+nota5)/5;
		System.out.println("la primera nota es :"+nota1);
		System.out.println("la segunda nota es :"+nota2);
		System.out.println("la tercera nota es :"+nota3);
		System.out.println("la cuarta nota es :"+nota4);
		System.out.println("la quinta nota es :"+nota5);
		System.out.println("El promedio de la nota es  "+prom);
		
	}

}
