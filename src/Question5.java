public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean findPath(GraphNode start, GraphNode end) {
		GraphNode startNode = start;
		while (start.next != null) {
			if (start.next.data == end.data) {
				return true;
			}
			start = start.next;

		}
		return false;
	}

	class GraphNode {
		GraphNode next;
		int data;
	}

	public class LinkedList {
		GraphNode first;

		void insert(int val) {
			GraphNode x = new GraphNode();
			x.data = val;
			if (first == null)
				first = x;
			else {
				GraphNode temp = first;
				while (temp.next != null)
					temp = temp.next;
				temp.next = x;
			}
		}
	}

}
