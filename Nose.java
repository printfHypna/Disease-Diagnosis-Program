package main;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Nose extends JFrame implements MouseListener{
	JPanel pnlNose = new JPanel(new GridLayout(4,1));
	JButton btnSubmit = new JButton("SUBMIT");
	JTextField txtCA = new JTextField();
	JTextField txtHED = new JTextField();
	JTextField txtHSA = new JTextField();
	JCheckBox chkRunnyNose = new JCheckBox("RUNNY NOSE");

	JCheckBox chkRsos= new JCheckBox("REDUCED SENSE OF SMELL");

	JCheckBox chkNasalCongestion = new JCheckBox("NASAL CONGESTION");
	
	JCheckBox chkSneeze = new JCheckBox("SNEEZE");
	
	private String username;
	
	public Nose(String username) {
		
		this.username = username;
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		JPanel pnlNose = new JPanel(new GridLayout(4,1));
		
		pnlNose.add(chkRunnyNose); pnlNose.add(chkRsos);
		pnlNose.add(chkNasalCongestion);pnlNose.add(chkSneeze);
		
		
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("NOSE"));
		add(new JLabel("Enter the problem you have with your nose"));
		add(new JLabel("(You can choose one or more options.)"));
		add(pnlNose);
		add(btnSubmit);
		btnSubmit.addMouseListener(this);
		
	}
	
	ArrayList<String> selectedCheckBoxes = new ArrayList<>();
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnSubmit) {
			ArrayList<JCheckBox> allCheckBoxes = new ArrayList<>();
			allCheckBoxes.add(chkRunnyNose); allCheckBoxes.add(chkRsos);
			allCheckBoxes.add(chkNasalCongestion); allCheckBoxes.add(chkSneeze);
			for (JCheckBox jCheckBox : allCheckBoxes) {
				if (jCheckBox.isSelected()) {
					selectedCheckBoxes.add(jCheckBox.getText());
				}
			}
			Results r = new Results(username, selectedCheckBoxes);
			r.setVisible(true);
		
        } 
			
	}
	 public ArrayList<String> getSelectedCheckBoxes() {
	        return selectedCheckBoxes;
	    }


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
