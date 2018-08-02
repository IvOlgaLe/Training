package longest_word;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.util.HashMap;

public class LongestWordGUI extends JFrame {
    // Текстовые поля
    JTextField textTypeField;

    public LongestWordGUI() {
        super("The longest word search");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Create text field
        textTypeField = new JTextField("Type a sentence and press the Enter key", 50);
        // Font
        textTypeField.setFont(new Font(null, Font.PLAIN, 12));
        textTypeField.setHorizontalAlignment(JTextField.LEFT);
        // Listener
        textTypeField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sentence = textTypeField.getText();
                LongestWord longestWordObject = new LongestWord();
                HashMap<String, Object> result = longestWordObject.getResult(sentence);
                String text = "Sentence: " + sentence +
                        "; Length of sentence = " + result.get("sentenceLength") +
                        "; The longest word: " + result.get("theLongestWord") +
                        "; Length of the longest word = " + result.get("maxLength");
                JOptionPane.showMessageDialog(null,
                        "<html><table width=400>" + text);
            }
        });
        // Create panel with text field
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.CENTER));
        contents.add(textTypeField);
        setContentPane(contents);
        setSize(600, 130);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LongestWordGUI();
    }
}
