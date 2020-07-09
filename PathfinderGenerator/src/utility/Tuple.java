package utility;
/**
 * Sert pour représenté un élément dans la base de données.
 * @author Mentra20
 *
 * @param <E> Element X
 * @param <T> Element Y
 */
public class Tuple<E,T>{
    private E x;
    private T y;
    
    public Tuple(E x, T y){
        this.x = x;
        this.y = y;
    }
    
    public E getX(){
        return x;
    }
    public T getY(){
        return y;
    }
}