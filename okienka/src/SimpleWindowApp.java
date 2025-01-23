import javax.swing.*;

import java.awt.*;

public class SimpleWindowApp {

    public static final String FRAME_TITLE = "Aplikacja okiennicowa";

    public static final String WELCOME_TEXT = "Witaj w mojej aplikacji!";

    public static final String CLOSE_BUTTON_TEXT = "Wyjdź";

    public static final String JUST_TEXT = "o";


    public static Component createAndShowGUI() {

        JFrame frame = new JFrame(FRAME_TITLE);
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1280, 720);

        JLabel welcomeLabel = createWelcomeLabel();

        frame.getContentPane().add(welcomeLabel, BorderLayout.CENTER);

        JPanel controlPanel = createControlPanel(frame);

        frame.getContentPane().add(controlPanel, BorderLayout.SOUTH);

       // frame.getContentPane().add(createAndShowGUI(), BorderLayout.NORTH);

        frame.setVisible(true);

        return null;
    }

    private static JLabel createWelcomeLabel() {

        return new JLabel(WELCOME_TEXT, JLabel.CENTER);

    }

    private static JPanel createControlPanel(JFrame frame) {

        JPanel panel = new JPanel();

        JButton closeButton = new JButton(CLOSE_BUTTON_TEXT);

        closeButton.addActionListener(e -> frame.dispose());

        panel.add(closeButton);

        return panel;

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(SimpleWindowApp::createAndShowGUI);

    }

}
 