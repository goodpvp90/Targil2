package tree;

public class Node {

	private int count = 0;
	private Node[] children = new Node['z' - 'a' + 1];
	
	

	
	public int num(String s) {
		if(s.equals(""))
			return count;
		return children[s.charAt(0) - 'a'].num(s.substring(1));
	}
	
	
	public void add(String s) {
		if(s == "") {
			count = count + 1;
			return;
		}
		int index = s.charAt(0) - 'a';
		if(children[index] == null)
			children[index] = new Node();
		children[index].num(s.substring(1));
	}
}
