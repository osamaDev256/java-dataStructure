package Tree;

public class BTNode <E> {
	private E item;
	private BTNode<E> left;
	private BTNode<E> right;
	
	public BTNode() {
		item = null;
		left = right = null;
		}
	public void setItem(E e){
		item = e;
		}
	public void setLeft(BTNode<E> n){ 
		left = n; 
		}
	public void setRight(BTNode<E> n){
		right = n;
		}
        public E getItem(){
		return item;
		}
	public BTNode<E> getLeft(){
		return left;
		}
	public BTNode<E> getRight(){ 
		return right;
		}
	public boolean isLeaf() {
            return (left == null && right == null);
        }
   
}
