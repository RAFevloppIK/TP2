
public class AllDispalyChild extends AllDisplay{
  @Override
  public void outPut_Msg(String message){
	  System.out.println(message);
  }

@Override
public void setMessage(String message) {
	this.message = message;
	
}

@Override
public String getMessage() {
	return message;
}
}
