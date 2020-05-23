package editor;

import javax.swing.*;

public class TextEditor extends JFrame {
    public TextEditor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setTitle("TextArea");
        initComponents();
        setVisible(true);
        setLayout(null);
    }

    private void initComponents() {
        JTextArea textArea = new JTextArea();
        textArea.setName("TextArea");
        textArea.setBounds(40, 20,150, 25);
        add(textArea);
    }
}
