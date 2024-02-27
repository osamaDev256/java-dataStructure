package Lap7;

public class TreeNode <E>{
	private E item;
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode() {
	item = null;
	parent = null;
	left = null;
	right = null;
	}
	public void setItem(E e) {
		item = e;
		}

	public void setParent(TreeNode<E> n) { 
		parent = n; 
		}

	public void setLeft(TreeNode<E> n) {
		left = n; 
		}

	public void setRight(TreeNode<E> n) {
		right = n;
		}

	public E getItem() {
		return item; 
		}

	public TreeNode<E> getParent() { 
		return parent;
		}
	public TreeNode<E> getLeft() {
		return left;
		}
	public TreeNode<E> getRight() { 
		return right; 
		}
}
