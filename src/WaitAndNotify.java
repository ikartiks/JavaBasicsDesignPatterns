import java.util.ArrayList;

class Manufacturer{
	
	private static Manufacturer manufacturer;
	
	private ArrayList<String> resources=new ArrayList<String>();
	ResourceUser waitingUser;
	
	private Manufacturer() {
	}
	
	public static Manufacturer getInstance(){
		
		if(manufacturer != null)
			return manufacturer;
		else{
			manufacturer = new Manufacturer();
			manufacturer.startCreatingResources();
			return manufacturer;
		}	
	}
	
	public void provideResources(ResourceUser resourceUser){
		if(resources.size()>0){
			resourceUser.resource = resources.get(0);
			resources.remove(0);
			
			System.out.println("providing resource to "+resourceUser);
		}else{
			try {
				synchronized (resourceUser) {
					waitingUser = resourceUser;
					System.out.println("making "+resourceUser+" wait");
					waitingUser.wait();
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	private void startCreatingResources(){
		
		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
					startCreatingResources();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		System.out.println("creating resource");
		resources.add(System.currentTimeMillis()+"");
		if(waitingUser!=null){
			
			System.out.println("providing waiting user "+waitingUser+" with resource");
			waitingUser.resource = resources.get(0);
			resources.remove(0);
			synchronized (waitingUser) {
				waitingUser.notify();
				waitingUser = null;
			}
			
		}
	}
}

class ResourceUser{
	
	
	private int resourceId;
	public String resource;
	
	public ResourceUser(int resourceId) {
		// TODO Auto-generated constructor stub
		this.resourceId = resourceId;
	}
	
	@Override
	public String toString() {
		return resourceId+"";
	}
}

public class WaitAndNotify {
	public static void main(String[] args) {
		
		
		
		Manufacturer m = Manufacturer.getInstance();
		
		ResourceUser resourceUser=new ResourceUser(1);
		m.provideResources(resourceUser);
		
		resourceUser=new ResourceUser(2);
		m.provideResources(resourceUser);
		
		resourceUser=new ResourceUser(3);
		m.provideResources(resourceUser);
		
		resourceUser=new ResourceUser(4);
		m.provideResources(resourceUser);
		
		resourceUser=new ResourceUser(5);
		m.provideResources(resourceUser);
		
		resourceUser=new ResourceUser(6);
		m.provideResources(resourceUser);
	}
}
