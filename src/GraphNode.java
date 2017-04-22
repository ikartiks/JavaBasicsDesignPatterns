
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GraphNode {
	
	List<GraphNode> toNodes;
	static List<String> visitedNodes=new ArrayList<String>();
	String data;

	public static void main(String[] args) {
		GraphNode one=new GraphNode("One");
		GraphNode two=new GraphNode("two");
		GraphNode three =new GraphNode("three");
		GraphNode four =new GraphNode("four");
		one.setToNodes(Arrays.asList(two,three));
		two.setToNodes(Arrays.asList(one));
		three.setToNodes(Arrays.asList(one,two,four));
		
		visitedNodes.clear();
		System.out.println(pathExists(one, four));
		visitedNodes.clear();
		System.out.println(pathExists(four, one));
	}
	
	
	
	public GraphNode(String data) {
		super();
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb=new StringBuilder();
		sb.append(data+" - ");
		for (Iterator iterator = toNodes.iterator(); iterator.hasNext();) {
			GraphNode graphNode = (GraphNode) iterator.next();
			sb.append(graphNode.getData()+", ");
		}
		return sb.toString();
	}



	public void findPath(GraphNode from, GraphNode to){
		
	}
	
	public static boolean pathExists(GraphNode from, GraphNode to){
		
		
		if(visitedNodes.contains(from.getData())){
			//System.out.println("node already visited "+from.getData());
			return false;
		}
		
		List<GraphNode> nodes=from.getToNodes();//one - 2,3
		if(nodes==null){
			visitedNodes.add(from.getData());
			return false;
		}
		
		visitedNodes.add(from.getData());
		for (Iterator iterator = nodes.iterator(); iterator.hasNext();) {
			GraphNode graphNode = (GraphNode) iterator.next();
			if(graphNode.getData().equals(to.getData())){
				return true;
			}else if(graphNode.getToNodes()!=null ){
				
				if( (!visitedNodes.contains(graphNode.getData())) && (!graphNode.getData().equals(from.getData()))){
					
					//System.out.println("from "+from.getData() +" child "+graphNode.getData());
					boolean op=pathExists(graphNode, to);
					if(op)
						return true;
					else
						continue;
				}
			}
		}
		
		//System.out.println("visited "+from.getData());
		return false;
	}
	
	public List<GraphNode> getToNodes() {
		return toNodes;
	}

	public void setToNodes(List<GraphNode> toNodes) {
		this.toNodes = toNodes;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
