import java.util.ArrayList;
import java.util.List;

public class AllDispalyParent extends AllDisplay{
		private String message;
		private List<AllDisplay>children;
		
		public AllDispalyParent(String message){
			this.message = message;
			this.children = new ArrayList<>();
		}
		
		@Override
		public String getMessage() {
			return message;
		}

		@Override
		public void setMessage(String message) {
			this.message = message;
		}

		

		public void removeChildTag(HtmlTag htmlTag){
			children.remove(htmlTag);
		}
		

		public List<AllDisplay>getChildren(){
			return children;
		}


		public void generateMessages() {
			
			for(AllDispaly msg : children){
				System.out.println(message);
			}
			
			
		}


		
		
		
		
		  @Override
		  public void outPut_Msg(String message){
			  System.out.println("here :"+ message);
		  }
		}
	
