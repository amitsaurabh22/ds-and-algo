/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
 */
boolean checkBST(Node root) {

	if(root== null){
		return true;
	}

	return parse(root);
}

boolean parse(Node current){
	Node l=current.left;
	boolean val1=false;
	boolean val2=false;
	if(l!=null ){

		if(current.data > l.data ) {
			val1= parse(l);
		}else{
			return false;

		}

	}else {

		return true;
	}

	Node r=current.right;
	if(r!=null ){
		if( current.data < r.data ) {
			val2= parse(r);
		}
		else{
			return false;
		}

	}else{
		return true;

	}

	return val1 && val2;
}
