import java.io.*;
		import java.io.File;
		import java.io.FileWriter;
		import java.io.IOException;
		
public class FileAllMessages implements IJournal{
    @Override
	public void outPut_Msg(String message) {
		
		        File chemin = new File("messagesStock.txt");
		       
		        FileWriter wr = new FileWriter();
		        wr.write(message);
		        wr.flush();
		        wr.close();
											}
												}
	
