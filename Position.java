//Interface for Position ADT, has only one method
public interface Position<E>
{
	public E element() throws InvalidPositionException;
}