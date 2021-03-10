
public class myQueue {
	
	private int size;
	
	int [] fila;
	
	private int cabecalho, ultimo;
	
	
	public myQueue(int size)
	{
		this.size = size;
		this.fila = new int [size];
		this.cabecalho = this.ultimo = 0;

	}
	
	public boolean filaVazia()
	{
		return this.ultimo == this.cabecalho;
	}
	
	public boolean filaCheia()
	{
		int proxi = (this.ultimo + 1) % this.size;
		return (proxi == this.cabecalho);
	}
	
	public boolean enqueue(int elemento)
	{
		
		if(filaCheia()) return false;
		
		int proxi = (this.ultimo + 1) % size;
		this.fila[proxi] = elemento;
		this.ultimo = proxi;
		return true;
	}
	
	public boolean dequeue()
	{
		if(filaVazia()) return false;
		
		this.cabecalho = (this.cabecalho + 1) % size;
		return true;
	}
	
	public void imprimirFila()
	{
		if (filaVazia()) 
		{
			System.out.println("Fila Vazia!");
			return;
		}
		
		System.out.print("Fila:\n");
		while (this.ultimo != this.cabecalho)
		{
			System.out.print(this.fila[this.cabecalho + 1]);
			dequeue();
		}
	}

}
