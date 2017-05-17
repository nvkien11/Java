import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class frmGiaiThua73 {

	private JFrame frmTnhGiaiTha;
	private JTextField txtNhap;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGiaiThua73 window = new frmGiaiThua73();
					window.frmTnhGiaiTha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmGiaiThua73() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTnhGiaiTha = new JFrame();
		frmTnhGiaiTha.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frmTnhGiaiTha.setTitle("T\u00CDNH GIAI TH\u1EEAA");
		frmTnhGiaiTha.setBounds(100, 100, 417, 265);
		frmTnhGiaiTha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTnhGiaiTha.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDnh Giai Th\u1EEBa C\u1EE7a X");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(131, 28, 152, 30);
		frmTnhGiaiTha.getContentPane().add(lblNewLabel);
		
		JLabel lblNhpX = new JLabel("Nh\u1EADp X :");
		lblNhpX.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNhpX.setBounds(48, 69, 65, 30);
		frmTnhGiaiTha.getContentPane().add(lblNhpX);
		
		JLabel lblKtQu = new JLabel("K\u1EBFt Qu\u1EA3 :");
		lblKtQu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKtQu.setBounds(48, 110, 65, 30);
		frmTnhGiaiTha.getContentPane().add(lblKtQu);
		
		txtNhap = new JTextField();
		txtNhap.setBounds(140, 75, 191, 20);
		frmTnhGiaiTha.getContentPane().add(txtNhap);
		txtNhap.setColumns(10);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setColumns(10);
		txtKQ.setBounds(140, 116, 191, 20);
		frmTnhGiaiTha.getContentPane().add(txtKQ);
		
		JButton btnTinh = new JButton("T\u00EDnh");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nhap=Integer.parseInt(txtNhap.getText());
				int KQ=1;
				
				if (nhap<0)
				{
					KQ = -1;
				}
				//else{
					for(int i = 1; i <= nhap; i++)
					{
							KQ = KQ * i;
					}
				//}
				txtKQ.setText(String.valueOf(KQ));
			}
		});
		btnTinh.setBounds(140, 168, 89, 23);
		frmTnhGiaiTha.getContentPane().add(btnTinh);
		
		JButton btnNhapLai = new JButton("Nh\u1EADp L\u1EA1i");
		btnNhapLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Scanner nhaplai = new Scanner(System.in);
				//txtNhap.setText(String.valueOf(null));
				//int nhap=Integer.parseInt(txtNhap.getText());
			}
		});
		btnNhapLai.setBounds(242, 168, 89, 23);
		frmTnhGiaiTha.getContentPane().add(btnNhapLai);
	}
}
