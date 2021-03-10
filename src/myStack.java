
public class myStack {
	
	private int size;
	
	int [] pilha;
	
	private int topo;
	
	public myStack(int size)
	{
		this.size = size;
		this.pilha = new int[size];
		this.topo = -1;
	}
	
	public boolean pilhaVazia()
	{
		return this.topo == -1;
	}
	
	public boolean pilhaCheia()
	{
		return this.topo == this.size - 1;
	}
	
	public boolean push(int elemento)
	{
		if(pilhaCheia()) return false;
		
		this.pilha[this.topo + 1] = elemento;
		this.topo++;
		return true;
	}
	
	public boolean pop()
	{	
		if(pilhaVazia()) return false;
		
		this.topo--;
		return true;
	}
	
	public int getTopo()
	{		
		return this.pilha[this.topo];
	}
	
	public int getSize()
	{
		return this.topo + 1;
	}
	
	public void imprimirPilha()
	{
		if(pilhaVazia())
		{
			System.out.println("Pilha vazia!");
		}
		else
		{
			System.out.print("Pilha:\n");
			while (this.topo != -1)
			{
				System.out.print(getTopo());
				pop();
			}	
		}
	}	
}
