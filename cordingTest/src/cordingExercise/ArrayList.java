package cordingExercise;

public class ArrayList {
	
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	public boolean addLast(Object element) {
		
		elementData[size] = element;
		size++;
		return true;
	}
	
	public boolean add(int index,Object element) {
		
		int newSize = size - 1;
		
		for(int i = size; i > index ; i--) { 
			elementData[size] = elementData[newSize];
		}
		
		elementData[index] = element;
		size++;
		
		return true;
	}
	
	public boolean addFirst(Object element) {
				
		return add(0,element);
	}
	
	public Object get(int index) {
		return elementData[index];
		
	}
}
