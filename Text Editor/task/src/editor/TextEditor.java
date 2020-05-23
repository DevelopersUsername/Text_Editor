package editor;

import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {
    public TextEditor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 420);
        setTitle("Text Editor");
        initComponents();
        setVisible(true);
        setLayout(null);
    }

    private void initComponents() {

        getContentPane().setLayout(new FlowLayout());

        JTextArea filenameField = new JTextArea(1, 10);
        filenameField.setName("FilenameField");
        filenameField.setBounds(10, 5, 5, 5);
        add(filenameField);

        JButton saveButton = new JButton("Save");
        saveButton.setName("SaveButton");
        saveButton.setBounds(100, 70, 100, 30);
        add(saveButton);

        JButton loadButton = new JButton("Load");
        loadButton.setName("LoadButton");
        loadButton.setBounds(100, 70, 100, 30);
        add(loadButton);

        JTextArea textArea = new JTextArea(20, 20);
        textArea.setName("TextArea");
        textArea.setBounds(40, 20,150, 20);

        JScrollPane scrollableTextArea = new JScrollPane(textArea);
        scrollableTextArea.setName("ScrollPane");
        getContentPane().add(scrollableTextArea);
    }
}
