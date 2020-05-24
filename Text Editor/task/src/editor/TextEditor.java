package editor;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        JTextField fileNameField = new JTextField();
        JButton saveButton = new JButton("Save");
        JButton loadButton = new JButton("Load");
        JTextArea textArea = new JTextArea(20, 20);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);

        fileNameField.setName("FilenameField");
        fileNameField.setColumns(7);
        add(fileNameField);

        saveButton.setName("SaveButton");
        saveButton.setBounds(100, 70, 100, 30);
        saveButton.addActionListener(actionEvent -> whiteFile(fileNameField.getText(), textArea.getText()));
        add(saveButton);

        loadButton.setName("LoadButton");
        loadButton.setBounds(100, 70, 100, 30);
        loadButton.addActionListener(actionEvent -> textArea.setText(readFile(fileNameField.getText())));
        add(loadButton);

        textArea.setName("TextArea");
        textArea.setBounds(40, 20,150, 20);

        scrollableTextArea.setName("ScrollPane");
        getContentPane().add(scrollableTextArea);
    }

    String readFile(String pathToFile) {
        try {
            return Files.readString (Paths.get ("./Text Editor/task/" + pathToFile));
        } catch(IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
            return "";
        }
    }

    void whiteFile(String pathToFile, String text) {

        try (OutputStream outputStream = new FileOutputStream("./Text Editor/task/" + pathToFile, false)) {
            outputStream.write(text.getBytes());
        } catch(IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}