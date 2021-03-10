
public class myArray {
	
	private int size;
	
	int [] array;
	
	private int ultimo;
	
	public myArray(int size)
	{
		this.size = size;
		this.array = new int[size];
		this.ultimo = -1;
	}
	
	public int getTamanhoAtual()
	{
		return this.ultimo + 1;
	}
	
	public void arrayCheio()
	{	
		if(this.ultimo == this.size - 1) arrayResize();

	}
	
	public int getTamanhoTotal()
	{
		return this.size;
	}
	
	public void arrayResize()
	{
		this.size *= 2;
		int[] tmp = new int[this.size];
		//[1,2] = [0, 0, 0, 0];
	    System.arraycopy(this.array,0,tmp,0,array.length); 
	    //[1,2] = [1, 2, 0, 0];
	    this.array = tmp;
	    //[1 ,2, 0, 0]
	}
	
	public boolean arrayVazio()
	{
		return (this.ultimo == -1);
	}
	
	public boolean add(int elemento)
	{
		arrayCheio();
		
		this.array[this.ultimo + 1] = elemento;
		this.ultimo++;
		return true;
		
	}
	
	public boolean remove(int pos)
	{
		if(arrayVazio())
		{
			System.out.println("Array Vazio");
			return false;
		}
		
		if (pos < 0 || pos > this.ultimo)
		{
			System.out.println("Posição inválida");
			return false;
		}
		
		for (int i = pos; i < this.ultimo; i++)
		{
			this.array[i] = this.array[i + 1];
		}
		
		this.ultimo--;
		
		System.out.println("Elemento removido com sucesso!");
		return true;
	}
	
	public void search(int elemento)
	{
		if(arrayVazio())
		{
			System.out.println("Array Vazio");
			
		}
		
		
		for (int i = 0; i <= this.ultimo; i++)
		{
			if(this.array[i] == elemento) 
				{
					System.out.println("Elemento localizado na posição: " + i);
					return;
				}
			
		}
		
		System.out.println("Elemento não encontrado!");

			
		
	}

	
	public boolean modify(int pos, int elem)
	{
		if(!arrayVazio())
		{
			if (pos >= 0 && pos < this.ultimo + 1)
			{
				this.array[pos] = elem;
				return true;
			}
			else
			{
				System.out.println("Posição inválida!");
				return false;
			}
		}
		System.out.println("Array vazio!");
		return false;
		
	}
	
	public void listarArray()
	{
		if(arrayVazio())
		{
			System.out.println("Array vazio!");
			return;
		}
		
		System.out.print("Array: \n");
		
		for (int i = 0; i <= this.ultimo; i++)
		{
			System.out.print(this.array[i]);
		}
		
	}
}
