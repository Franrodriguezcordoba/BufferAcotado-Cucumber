package bufferAcotado;

import java.util.ArrayList;


public class bufferAcotado<T>
{
	private int capacidad;
	private ArrayList<T> buffer;
	
	public bufferAcotado(int capacidad)
	{
		this.capacidad = capacidad;
		buffer = new ArrayList<T>(capacidad);
		if(this.capacidad <= 0)
		{
			throw new IllegalArgumentException("Precondition: capacidad must not be 0 or negative");
		}
	}
	
	
	public void put(T element)
	{
		if(this.isFull()==true)
		{
			throw new IllegalStateException("Precondition: the buffer is full");
		}
		this.buffer.add(element);
	}
	
	
	public T get()
	{
		if(isEmpty()==true)
		{
			throw new IllegalStateException("Precondition: the buffer is empty");
		}
		return this.buffer.remove(this.buffer.size()-1);
	}
	
	
	public int size()
	{
		return this.buffer.size();
	}
	
	
	public boolean isFull()
	{
		if(this.buffer.size()==this.capacidad)
		{
			return true;
		}			
		return false;
	}
	
	
	public boolean isEmpty()
	{
		if(this.buffer.size()==0)
		{
			return true;
		}
		return false;
	}
}