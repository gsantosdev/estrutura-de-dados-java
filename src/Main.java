
public class Main {

	public static void main(String[] args) {

		myStack p = new myStack(10);
		
		p.push(1);
		p.push(2);
		p.push(3);
		p.imprimirPilha();
		
		System.out.println();
		
		myQueue f = new myQueue(10);
		
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.imprimirFila();
		
		System.out.println();

		myArray arr = new myArray(5);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(3);
		arr.add(3);
		
		arr.listarArray();
		System.out.println();
		System.out.println("Tamanho Atual: " + arr.getTamanhoAtual());
		
		
	}

}
