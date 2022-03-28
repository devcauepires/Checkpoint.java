// Cauê Pires - 1TSDVJ - Manh�
package CheckpointPackage;

public class UsaGeometria {
	
        public class AreaQuadrado {

		public static void main(String[] args) {

			float l;

			System.out.println("Digite um valor para l (lado) ");
			Scanner ler = new Scanner(System.in);
			r = ler.nextFloat();
			
			A = l * l;
			
			System.out.println("Valor da area "+A);
			
			

		}

	}
	
	public class AreaRetangulo {

		public static void main(String[] args) {

			float l, a;

			System.out.println("\n digite um valor para l (lado) ");
			Scanner ler = new Scanner(System.in);
			r = ler.nextFloat();
			
			System.out.println("\n digite um valor para a (Altura) ");
			Scanner ler = new Scanner(System.in);
			r = ler.nextFloat();
			
			A = l * a;
			
			System.out.println("\n Valor da area "+A);
			
			

		}

	}
	
	public class AreaTriangulo {

		public static void main(String[] args) {

			float l, a;

			System.out.println("\n digite um valor para l (lado) ");
			Scanner ler = new Scanner(System.in);
			r = ler.nextFloat();
			
			System.out.println("\n digite um valor para a (altura) ");
			Scanner ler = new Scanner(System.in);
			r = ler.nextFloat();
			
			A = (l * a) / 2;
			
			System.out.println("\n Valor da area "+A);
			
			

		}

	}
	
	public class AreaCircunferencia {

		public static void main(String[] args) {

			float r, A;

			System.out.println("\n digite um valor para R ");
			Scanner ler = new Scanner(System.in);
			r = ler.nextFloat();
			
			A = 3,14 * (r ^ 2);
			
			System.out.println("\n Valor da area "+A);
			
			

		}

	}

}
