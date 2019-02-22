import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;

public class Musicplayer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Musicplayer frame = new Musicplayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Musicplayer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton button = new JButton("\u64AD\u653E\u6216\u6682\u505C");
		contentPane.add(button, BorderLayout.SOUTH);
		
		JButton button_1 = new JButton("\u4E0A\u4E00\u9996");
		contentPane.add(button_1, BorderLayout.WEST);
		
		JButton button_2 = new JButton("\u4E0B\u4E00\u9996");
		contentPane.add(button_2, BorderLayout.EAST);
		
		JList list = new JList();
		contentPane.add(list, BorderLayout.CENTER);
	}

}
