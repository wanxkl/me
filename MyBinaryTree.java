/**
 * 写一个二叉树
 * */
public class MyBinaryTree {
  private MyNode root;//根节点
	private MyBinaryTree left;//左子树
	private MyBinaryTree right;//右子树
	
	/**
	 * 添加一个数
	 * 将数值插入到二叉树中，比当前结点小或等于当前结点的插在当前结点的左侧，比当前结点大的数插在当前结点的右侧，每次从根结点开始递归比较
	 * */
	public void addData(int n){
		if(root==null){
			root = new MyNode();
			root.setData(n);
		}else{
			int data = root.getData();
			if(n<=data){
				if(this.left==null)
					this.left = new MyBinaryTree();
				this.left.addData(n);
			}else{
				if(this.right==null)
					this.right = new MyBinaryTree();
				this.right.addData(n);
			}
		}
	}
	/**
	 * 先序排序
	 * */
	public void preorder(){
		if(this.root!=null)
			System.out.print(root.getData()+",");
		if(this.left!=null)
			this.left.preorder();
		if(this.right!=null)
			this.right.preorder();
	}
	/**
	 * 中序排序
	 * */
	public void inorder(){
		if(this.left!=null)
			this.left.inorder();
		if(this.root!=null)
			System.out.print(root.getData()+",");
		if(this.right!=null)
			this.right.inorder();
	}
	/**
	 * 后序排序
	 * */
	public void postorder(){
		if(this.left!=null)
			this.left.postorder();
		if(this.right!=null)
			this.right.postorder();
		if(this.root!=null)
			System.out.print(root.getData()+",");
	}

	
	public static void main(String[] args) {
		int[] arr = {2, 8, 7, 4 ,9,3,1,6,7,5};
		MyBinaryTree bt = new MyBinaryTree();
		for(int i=0;i<arr.length;i++){
			bt.addData(arr[i]);
		}
		System.out.println("先序：");
		bt.preorder();
		System.out.println("\n中序：");
		bt.inorder();
		System.out.println("\n后序：");
		bt.postorder();
	}

}
/**
 * 节点对象
 * */
class MyNode {
	private int data;//存储的数据

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
