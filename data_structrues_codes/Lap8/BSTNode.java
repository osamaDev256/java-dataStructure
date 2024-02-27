package Lap8;

public class BSTNode <k,T>{
	private k key; 
	private T data; 
	private BSTNode<k,T> left; 	
	private BSTNode<k,T> right; 
	public BSTNode( ) {
		left = right = null; 
		}
	public BSTNode(k key, T data){ 
		this.key = key;
		this.data = data;
		left = right = null;
	}  
public BSTNode(k key, T data, BSTNode<k,T> left, BSTNode<k,T> right){ 
		this.key = key; 
		this.data = data;
		this.left = left; 
		this.right = right; 
	  }
	public k getKey() { 
		return key; 
		}
	public void setKey(k key) {
		this.key = key;
		}
	public T getData() { 
		return data; 
		}
	public void setData(T data) { 
		this.data = data;
		}
	public BSTNode<k,T> getLeft() {
		return left; 
		}
	public void setLeft(BSTNode<k,T> left) { 
		this.left = left;
		}
	public BSTNode<k,T> getRight() {
		return right; 
		}
	public void setRight(BSTNode<k,T> right) { 
		this.right = right; }
	public boolean isLeaf(){
		return (left == null) && (right == null); }
}

