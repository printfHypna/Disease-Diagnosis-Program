package arayüzgeliştirme;
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
public class HairyArea extends JFrame implements MouseListener {
	
	JPanel pnlHairyArea = new JPanel(new GridLayout(4,1));
	JButton btnSubmit = new JButton("SUBMIT");
	JTextField txtCA = new JTextField();
	JTextField txtHED = new JTextField();
	JTextField txtHSA = new JTextField();
	JCheckBox chkIB = new JCheckBox("HEADACHE");

	JCheckBox chkITC= new JCheckBox("LIGHT SENSIVITY");

	JCheckBox chkBI = new JCheckBox("NAUSEA");
	
	JCheckBox chkCG = new JCheckBox("COUGH");
	JCheckBox chkCKS= new JCheckBox("CHEEKS");

	JCheckBox chkFP = new JCheckBox("FACIAL PAIN");
	
	JCheckBox chkLJ = new JCheckBox("LOCKJAW");
	
	private String username;
	
	
	public HairyArea(String username) {
		this.username = username;
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
		setLocationRelativeTo(null);
		setTitle("Disease Diagnosis Program");
		
		JPanel pnlNose = new JPanel(new GridLayout(7,1));
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
			Results r = new Results(username, selectedCheckBoxes);
			r.setVisible(true);
		
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
