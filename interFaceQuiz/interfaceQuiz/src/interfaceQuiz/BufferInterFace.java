package interfaceQuiz;

public interface BufferInterFace {

	public boolean add (Comparable obj);
	public boolean remove (Comparable  obj);
	public Comparable  getObject(int index);
	public int getObject(Comparable  obj);  
	public int getCapacity();
	public int getSize();
	public void sort();

	
}
