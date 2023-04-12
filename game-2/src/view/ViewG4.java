package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ViewG4 extends JFrame {

    private JButton btnBack;

    public ViewG4(){
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);

		btnBack = new JButton("back");
		btnBack.setBounds(341, 19, 90, 29);
		this.getContentPane().add(btnBack);
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

     public void addG4toMain( ActionListener action){
        btnBack.addActionListener(action);
    }
}
