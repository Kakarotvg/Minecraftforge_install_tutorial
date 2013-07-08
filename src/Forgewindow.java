import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Forgewindow extends JFrame {

    private static final long serialVersionUID = 1L;

    JLabel label, label1, label2, label3, label4, label5, label6, labela, labelb, labels, labelc, label7, label8, label9, label10, label11, label12, label13, label14, label15, label16, label17, label18, label19, label20, label21, label22;
    JRadioButton b1, b2;
    ButtonGroup group;

    public Forgewindow() {
        super("Minecraft Forge Tutorial");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);

        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBackground(Color.gray);

        Menubar m = new Menubar();
        setJMenuBar(m);

        JPanel p = new JPanel();
        p.setBackground(Color.lightGray);
        JPanel p2 = new JPanel(new GridBagLayout());
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.setAlignmentX(LEFT_ALIGNMENT);
        p2.setBackground(Color.lightGray);
        JPanel p3 = new JPanel(new GridBagLayout());
        p3.setAlignmentX(LEFT_ALIGNMENT);
        p3.setBackground(Color.lightGray);

        b1 = new JRadioButton("Was the installation Succesful?");
        b1.setActionCommand("Great thats good.");
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Great you can exit this application now and play minecraft!!");
            }

        });
        b2 = new JRadioButton("Was the installation UnSuccesful?");
        b2.setActionCommand("Thats too bad.");
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Thats too bad. Go into the view menu, and it will show you some sites where you can contact me");
            }

        });
        group = new ButtonGroup();
        group.add(b1);
        group.add(b2);

        JButton b = new JButton("Exit");

        JButton c = new JButton("Next");

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);

            }

        });

        c.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Good now you have Minecraft forge installed!!");
                System.exit(EXIT_ON_CLOSE);

            }

        });

        label = new JLabel("Welcome to the Minecraft forge 1.6 install tutorial.");
        labela = new JLabel("                                                        ");
        labelb = new JLabel("WINDOWS INSTALLATION:");
        label1 = new JLabel("Step 1: Run minecraft 1.6.1 from the new launcher. Let it get set up then press Quit Game.");
        label2 = new JLabel("Step 2: Download the latest version of the minecraft forge installer from Http://www.files.minecraftforge.net.");
        label3 = new JLabel("Step 3: Run the Minecraft forge Installer and direct the path to your .minecraft folder(should be already done).");
        label4 = new JLabel("Step 4: Click ok and let the installer finish installing minecraft forge.");
        label5 = new JLabel("Step 5: Run the minecraft launcher. Click profiles and click forge. Run minecraft and let forge setup.");
        label6 = new JLabel("Step 6: Enjoy Minecraft forge.  To install other mods follow the directions of how to install them.");
        labels = new JLabel("---------------------------------------------------------------------------------------------------");
        labelc = new JLabel("MAC INSTALLATION:");
        label7 = new JLabel("Open up terminal and type in this code:  chflags nohidden ~/Library.");
        label8 = new JLabel("Step 1: Run minecraft 1.6.1 from the new launcher. Let it get set up then press Quit Game.");
        label9 = new JLabel("Step 2: Download the latest version of the minecraft forge installer from Http://www.files.minecraftforge.net.");
        label10 = new JLabel("Step 3: Run the minecraft forge installer and direct it to your minecraft folder in (user/Library/Application Support/minecraft");
        label11 = new JLabel("Step 4: Click ok and let the installer finish installing minecraft forge.");
        label12 = new JLabel("Step 5: Run the minecraft launcher. Click profiles and click forge. Run minecraft and let forge setup.");
        label13 = new JLabel("Step 6: Enjoy Minecraft forge.  To install other mods follow the directions of how to install them.");
        label14 = new JLabel("---------------------------------------------------------------------------------------------------");
        label15 = new JLabel("LINUX INSTALLATION:");
        label16 = new JLabel("Make sure hidden files are shown");
        label17 = new JLabel("Step 1: Run minecraft 1.6.1 from the new launcher. Let it get set up then press Quit Game.");
        label18 = new JLabel("Step 2: Download the latest version of the minecraft forge installer from Http://www.files.minecraftforge.net.");
        label19 = new JLabel("Step 3: Run the minecraft forge installer and direct it to your .minecraft folder in (home/user/.minecraft).");
        label20 = new JLabel("Step 4: Click ok and let the installer finish installing minecraft forge.");
        label21 = new JLabel("Step 5: Run the minecraft launcher. Click profiles and click forge. Run minecraft and let forge setup.");
        label22 = new JLabel("Step 6: Enjoy Minecraft forge.  To install other mods follow the directions of how to install them.");

        p.add(b);
        p.add(c);

        gbc.gridx = 0;
        gbc.gridy = 0;
        p2.add(label, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        p2.add(labela, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        p2.add(labelb, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        p2.add(label1, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        p2.add(label2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        p2.add(label3, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        p2.add(label4, gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;
        p2.add(label5, gbc);
        gbc.gridx = 0;
        gbc.gridy = 8;
        p2.add(label6, gbc);
        gbc.gridx = 0;
        gbc.gridy = 9;
        p2.add(labels, gbc);
        gbc.gridx = 0;
        gbc.gridy = 10;
        p2.add(labelc, gbc);
        gbc.gridx = 0;
        gbc.gridy = 11;
        p2.add(label7, gbc);
        gbc.gridx = 0;
        gbc.gridy = 12;
        p2.add(label8, gbc);
        gbc.gridx = 0;
        gbc.gridy = 13;
        p2.add(label9, gbc);
        gbc.gridx = 0;
        gbc.gridy = 14;
        p2.add(label10, gbc);
        gbc.gridx = 0;
        gbc.gridy = 15;
        p2.add(label11, gbc);
        gbc.gridx = 0;
        gbc.gridy = 16;
        p2.add(label12, gbc);
        gbc.gridx = 0;
        gbc.gridy = 17;
        p2.add(label13, gbc);
        gbc.gridx = 0;
        gbc.gridy = 18;
        p2.add(label14, gbc);
        gbc.gridx = 0;
        gbc.gridy = 19;
        p2.add(label15, gbc);
        gbc.gridx = 0;
        gbc.gridy = 20;
        p2.add(label16, gbc);
        gbc.gridx = 0;
        gbc.gridy = 21;
        p2.add(label17, gbc);
        gbc.gridx = 0;
        gbc.gridy = 22;
        p2.add(label18, gbc);
        gbc.gridx = 0;
        gbc.gridy = 23;
        p2.add(label19, gbc);
        gbc.gridx = 0;
        gbc.gridy = 24;
        p2.add(label20, gbc);
        gbc.gridx = 0;
        gbc.gridy = 25;
        p2.add(label21, gbc);
        gbc.gridx = 0;
        gbc.gridy = 26;
        p2.add(label22, gbc);
        gbc.gridx = 0;
        gbc.gridy = 27;

        p3.add(b1, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        p3.add(b2, gbc);

        add(p, BorderLayout.SOUTH);
        add(p2, BorderLayout.NORTH);
        add(p3, BorderLayout.CENTER);

    }
}
