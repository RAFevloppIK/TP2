import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddDateAndClass implements IJournal{

	@Override
	public void outPut_Msg(String message) {

		String className = this.getClass().getName();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();


        System.out.println("\n ça etait generé par la classe: "+ className +"\t. Date :"+format.format(date));
	}}