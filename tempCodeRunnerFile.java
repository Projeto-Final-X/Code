import java.util.Random;

public class CopiaFor {

	public static void main(String[] args) {

		//(1) cria o array "a" e o preenche com uma sequência de números

		int [] a = new int[5];
		Random numeros = new Random();
		for (int i=0; i < a.length; i++) {
			a[i]=numeros.nextInt();
			System.out.println("a[" + i + "]=" + a[i]);
		}
		System.out.println();

		//(2) Copia o conteúdo de "a" para "b" com o uso de laço for

		int [] b = new int[a.length];                //primeiro é preciso
		reservar espaço para b
		for (int i=0; i < a.length; i++) b[i]=a[i];  //agora podemos copiar

		//(3) exibe o conteúdo de "b"
		for (int i=0; i < a.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}

	}
}