package main;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Chestt extends JFrame implements MouseListener{
	JPanel pnlHairyArea = new JPanel(new GridLayout(7,1));
	JButton btnSubmit = new JButton("SUBMIT");
	JTextField txtCA = new JTextField();
	JTextField txtHED = new JTextField();
	JTextField txtHSA = new JTextField();
	JCheckBox chkIB = new JCheckBox("COUGH");

	JCheckBox chkITC= new JCheckBox("SHORTNESS BREATH");

	JCheckBox chkBI = new JCheckBox("RAPID BREATH");
	
	JCheckBox chkCG = new JCheckBox("UNEXPLAINED WEIGHT LOSS");
	JCheckBox chkCKS= new JCheckBox("HEARTHBURN");

	JCheckBox chkFP = new JCheckBox("CHRONIC COUGH");
	
	JCheckBox chkLJ = new JCheckBox("HOARSENESS");
	
	private String username;
	public Chestt(String username) {
		this.username =username;
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(600,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		JPanel pnlHairyArea = new JPanel(new GridLayout(5,1));
		pnlHairyArea.add(chkIB); pnlHairyArea.add(chkITC); pnlHairyArea.add(chkBI);pnlHairyArea.add(chkCG);pnlHairyArea.add(chkCKS);pnlHairyArea.add(chkFP);pnlHairyArea.add(chkLJ);
		
		setLayout(new GridLayout(5,1)); 
		add(new JLabel("HAIRY AREA"));
		add(new JLabel("Enter the problem you have with your nose."));
		add(new JLabel("(You can choose one or more options.)"));
		add(pnlHairyArea);
		add(btnSubmit);
		btnSubmit.addMouseListener(this);

}
	
	ArrayList<String> selectedCheckBoxes = new ArrayList<>();
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnSubmit) {
			ArrayList<JCheckBox> allCheckBoxes = new ArrayList<>();
			allCheckBoxes.add(chkIB); allCheckBoxes.add(chkITC);
			allCheckBoxes.add(chkBI); allCheckBoxes.add(chkCG);allCheckBoxes.add(chkCKS);allCheckBoxes.add(chkFP);allCheckBoxes.add(chkLJ);
			for (JCheckBox jCheckBox : allCheckBoxes) {
				if (jCheckBox.isSelected()) {
					selectedCheckBoxes.add(jCheckBox.getText());
				}
			}
			if(selectedCheckBoxes.isEmpty() == false) {
				Results r = new Results(username, selectedCheckBoxes);
				r.setVisible(true);
				dispose();
			}
		
        } 
		
		// TODO Auto-generated method stub
		
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
