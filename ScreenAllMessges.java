import javax.swing.JOptionPane;

public class ScreenAllMessges implements IJournal {

	@Override
	public void outPut_Msg(String message) {
		
		JOptionPane.showMessageDialog(null,"InfoBox: " + message);

		
    }

		  
	

}
