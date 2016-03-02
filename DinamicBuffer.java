package interfaceQuiz;

public class DinamicBuffer implements BufferInterFace {

	Comparable [] buffer = new Comparable [1];
	int currIdx = 0;
	
	
	
	@Override
	public boolean add(Comparable obj) {
		
		if (currIdx == buffer.length -1 )
		{
			Comparable [] newBuff = new Comparable [buffer.length * 2];
			for (int i=0;i<=currIdx;i++)
			{
				newBuff[i]=buffer[i];
			}
			buffer = newBuff;
		}

		buffer[currIdx++]=obj;

		return true;
	}

	@Override
	public boolean remove(Comparable obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable getObject(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getObject(Comparable obj) {
	
		int i=0;
		for( Comparable o : buffer)
		{
			if ( o.equals(obj))
				return i;
			i++;
		}
		
		return -1;
	}

	@Override
	public int getCapacity() {
		return buffer.length;
	}

	@Override
	public int getSize() {
		return this.currIdx +1;
	}

	@Override
	public void sort() {
		
	}

}
