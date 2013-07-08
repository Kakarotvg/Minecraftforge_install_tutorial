import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menubar extends JMenuBar implements ActionListener {

    private static final long serialVersionUID = 1L;

    public Menubar() {
        
        this.setBackground(Color.darkGray);

        JMenu first = new JMenu("File");
        first.setMnemonic(KeyEvent.VK_F);
        JMenu second = new JMenu("View");
        second.setMnemonic(KeyEvent.VK_V);
        JMenu sub = new JMenu("Sites");
        sub.setMnemonic(KeyEvent.VK_S);
        
        first.setBackground(Color.darkGray);
        second.setBackground(Color.darkGray);
        sub.setBackground(Color.lightGray);

        JMenuItem close = new JMenuItem("Close", KeyEvent.VK_C);
        close.setBackground(Color.lightGray);
        close.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(ABORT);
            }

        });

        JMenuItem Facebook = new JMenuItem("Facebook", KeyEvent.VK_A);
        Facebook.setBackground(Color.lightGray);
        Facebook.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You can contact me on Facebook at Http://www.facebook.com/Kakarotvg.");
                System.exit(ABORT);
            }

        });

        JMenuItem Twitter = new JMenuItem("Twitter", KeyEvent.VK_T);
        Twitter.setBackground(Color.lightGray);
        Twitter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You can contact me on Twitter at Http://www.twitter.com/Kakarotvg.");
                System.exit(ABORT);
            }

        });

        JMenuItem email = new JMenuItem("email", KeyEvent.VK_E);
        email.setBackground(Color.lightGray);
        email.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You can email me at kakarotvgtube@gmail.com.");
                System.exit(ABORT);
            }

        });
        
        first.add(close);
        second.add(sub);
        sub.add(Facebook);
        sub.add(Twitter);
        sub.add(email);

        add(first);
        add(second);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
