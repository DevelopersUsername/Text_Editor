package editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextEditor extends JFrame {
    public TextEditor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 420);
        setLocationRelativeTo(null);
        setTitle("Text Editor");
        initComponents();
        setVisible(true);
        setLayout(null);
    }

    private void initComponents() {

        getContentPane().setLayout(new FlowLayout());

        // Menu

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        menuFile.setName("MenuFile");
        menuFile.setMnemonic(KeyEvent.VK_F);

        // Menu items
        JMenuItem menuLoad = new JMenuItem("Load");
        menuLoad.setName("MenuLoad");
        menuFile.add(menuLoad);

        JMenuItem menuSave = new JMenuItem("Save");
        menuSave.setName("MenuSave");
        menuFile.add(menuSave);

        JMenuItem menuExit = new JMenuItem("Exit");
        menuExit.setName("MenuExit");
        menuFile.addSeparator();
        menuFile.add(menuExit);

        menuBar.add(menuFile);
        setJMenuBar(menuBar);


        // Elements
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
        add(saveButton);

        loadButton.setName("LoadButton");
        loadButton.setBounds(100, 70, 100, 30);
        add(loadButton);

        textArea.setName("TextArea");
        textArea.setBounds(40, 20,150, 20);

        scrollableTextArea.setName("ScrollPane");
        getContentPane().add(scrollableTextArea);


        // Listeners
        saveButton.addActionListener(actionEvent -> saveText(fileNameField.getText(), textArea.getText()));
        menuSave.addActionListener(actionEvent -> saveText(fileNameField.getText(), textArea.getText()));
        loadButton.addActionListener(actionEvent -> textArea.setText(loadText(fileNameField.getText())));
        menuLoad.addActionListener(actionEvent -> textArea.setText(loadText(fileNameField.getText())));
        menuExit.addActionListener(actionEvent -> System.exit(0));
    }

    String loadText(String pathToFile) {

        try {
            return new String(Files.readAllBytes(Paths.get("./Text Editor/task/" + pathToFile)));
        } catch(IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
            return "";
        }
    }

    void saveText(String pathToFile, String text) {

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(pathToFile))) {
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println("Cant save file" + e);
        }
    }
}