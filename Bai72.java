import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai72 {

	private JFrame frmHanTnh;
	private JTextField txtTong;
	private JTextField txtSoMoi;
	private JTextField txtSoCu;
	private JTextField txtTien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai72 window = new Bai72();
					window.frmHanTnh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bai72() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHanTnh = new JFrame();
		frmHanTnh.setTitle("H\u00D3A \u0110\u01A0N T\u00CDNH TI\u1EC0N");
		frmHanTnh.setBounds(100, 100, 376, 316);
		frmHanTnh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHanTnh.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDnh gi\u00E1 ti\u1EC1n theo ch\u1EC9 s\u1ED1");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(105, 11, 183, 37);
		frmHanTnh.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Ch\u1EC9 s\u1ED1 c\u0169");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(45, 79, 83, 21);
		frmHanTnh.getContentPane().add(lblNewLabel_2);
		
		JLabel lblChSMi = new JLabel("Ch\u1EC9 s\u1ED1 m\u1EDBi");
		lblChSMi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblChSMi.setBounds(45, 111, 83, 21);
		frmHanTnh.getContentPane().add(lblChSMi);
		
		JLabel lblTong = new JLabel("T\u1ED5ng s\u1ED1 \u0111i\u1EC7n");
		lblTong.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTong.setBounds(45, 143, 83, 21);
		frmHanTnh.getContentPane().add(lblTong);
		
		JLabel lblThanhTien = new JLabel("Th\u00E0nh ti\u1EC1n");
		lblThanhTien.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblThanhTien.setBounds(45, 175, 83, 21);
		frmHanTnh.getContentPane().add(lblThanhTien);
		
		txtTong = new JTextField();
		txtTong.setEditable(false);
		txtTong.setBounds(149, 144, 139, 20);
		frmHanTnh.getContentPane().add(txtTong);
		txtTong.setColumns(10);
		
		txtSoMoi = new JTextField();
		txtSoMoi.setColumns(10);
		txtSoMoi.setBounds(149, 112, 139, 20);
		frmHanTnh.getContentPane().add(txtSoMoi);
		
		txtSoCu = new JTextField();
		txtSoCu.setColumns(10);
		txtSoCu.setBounds(149, 80, 139, 20);
		frmHanTnh.getContentPane().add(txtSoCu);
		
		txtTien = new JTextField();
		txtTien.setEditable(false);
		txtTien.setColumns(10);
		txtTien.setBounds(149, 176, 139, 20);
		frmHanTnh.getContentPane().add(txtTien);
		
		JLabel lblNewLabel_1 = new JLabel("VND");
		lblNewLabel_1.setBounds(298, 182, 46, 14);
		frmHanTnh.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("T\u00EDnh");
		btnNewButton.addActionListener(new ActionListener() {
			/*int SoCu=Integer.parseInt(txtSoCu.getText());
			int SoMoi=Integer.parseInt(txtSoMoi.getText());
			int Tong=SoMoi-SoCu;
			int Tien=Tong*1000;
			*/
			public void actionPerformed(ActionEvent arg0) {
				int SoCu=Integer.parseInt(txtSoCu.getText());
				int SoMoi=Integer.parseInt(txtSoMoi.getText());
				int Tong=SoMoi-SoCu;
				int Tien = 0;
				//int Tien=Tong*1000;
				if(Tong>300)
				{
					Tien +=(Tong-300)*5000;
					//Tong=300;
				}
				if(Tong>200)
				{
					Tien +=(Tong-200)*4000;
				}
				if(Tong>100)
				{
					Tien +=(Tong-100)*3000;
				}
				if(Tong>50)
				{
					Tien +=(Tong-50)*2000;
				}
				
				Tien+=Tong*500;
				txtTong.setText(String.valueOf(Tong));
				txtTien.setText(String.valueOf(Tien));
			}
		});
		btnNewButton.setBounds(199, 227, 89, 23);
		frmHanTnh.getContentPane().add(btnNewButton);
	}
}
