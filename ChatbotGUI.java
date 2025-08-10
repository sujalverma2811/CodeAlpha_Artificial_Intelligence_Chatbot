import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatbotGUI {
    private Chatbot chatbot;

    public ChatbotGUI() {
        chatbot = new Chatbot();

        JFrame frame = new JFrame("Java Chatbot 🤖");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        JButton sendButton = new JButton("Send");

        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        frame.add(inputPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = inputField.getText();
                if (!userInput.trim().isEmpty()) {
                    chatArea.append("You: " + userInput + "\n");
                    String response = chatbot.getResponse(userInput);
                    chatArea.append("Bot: " + response + "\n\n");
                    inputField.setText("");
                }
            }
        });

        inputField.addActionListener(e -> sendButton.doClick());

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ChatbotGUI();
    }
}
