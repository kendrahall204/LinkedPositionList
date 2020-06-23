//Interface for the PositionList ADT
import java.util.Iterator;
public interface PositionList<E>
{
	public int size();
	public boolean isEmpty();
	public Position<E> first() throws EmptyListException;
	public Position<E> last() throws EmptyListException;
	public Position<E> after(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	public Position<E> before(Position<E> p) throws InvalidPositionException, BoundaryViolationException;
	public Position<E> addFirst(E e);
	public Position<E> addLast(E e);
	public Position<E> addAfter(Position<E> p, E e) throws InvalidPositionException;
	public Position<E> addBefore(Position<E> p, E e) throws InvalidPositionException;
	public E remove(Position<E> p) throws InvalidPositionException;
	public E set(Position<E> p, E e) throws InvalidPositionException;
}