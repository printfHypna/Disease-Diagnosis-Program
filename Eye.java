package aray�zgeli�tirme;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Eye extends JFrame implements MouseListener{
	JPanel pnlHairyArea = new JPanel(new GridLayout(7,1));
	JButton btnSubmit = new JButton("SUBMIT");
	JTextField txtCA = new JTextField();
	JTextField txtHED = new JTextField();
	JTextField txtHSA = new JTextField();
	JCheckBox chkIB = new JCheckBox("TUNNEL VISION");

	JCheckBox chkITC= new JCheckBox("ITCHING OR BURNING SENSATION IN THE EYE");

	JCheckBox chkBI = new JCheckBox("BLURRED VISION");
	
	JCheckBox chkCG = new JCheckBox("EYE PAIN");
	JCheckBox chkCKS= new JCheckBox("REDNESS");

	JCheckBox chkFP = new JCheckBox("LIGHT SENSIVITY");
	
	JCheckBox chkLJ = new JCheckBox("EYE FATIGUE");
	public Eye() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(400,700);
		
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
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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