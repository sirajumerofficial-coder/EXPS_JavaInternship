import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatbotGUI {

    JFrame frame;
    JTextArea chatArea;
    JTextField inputField;
    JButton sendButton;

    Textprocessor processor;
    DecisionEngine engine;


    public ChatbotGUI(Textprocessor processor,
                      DecisionEngine engine) {

        this.processor = processor;
        this.engine = engine;


        // Main Window
        frame = new JFrame("My AI Chatbot");

        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());


        // Chat Area
        chatArea = new JTextArea();

        chatArea.setEditable(false);

        chatArea.setLineWrap(true);

        chatArea.setWrapStyleWord(true);

        frame.add(
            new JScrollPane(chatArea),
            BorderLayout.CENTER
        );


        // Bottom Panel
        JPanel bottomPanel = new JPanel();

        bottomPanel.setLayout(new BorderLayout());


        // Input + Button
        inputField = new JTextField();

        sendButton = new JButton("Send");


        bottomPanel.add(
            inputField,
            BorderLayout.CENTER
        );

        bottomPanel.add(
            sendButton,
            BorderLayout.EAST
        );


        frame.add(
            bottomPanel,
            BorderLayout.SOUTH
        );


        // Button Event Listener
        sendButton.addActionListener(
            new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    sendMessage();
                }
            }
        );


        // Enter Key Event
        inputField.addActionListener(
            new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                    sendMessage();
                }
            }
        );


        frame.setVisible(true);
    }


    public void sendMessage() {

        String message = inputField.getText();


        if (message.trim().isEmpty()) {

            return;
        }


        // Text Processor
        String cleanText =
                processor.cleanText(message);


        // Display user message
        chatArea.append(
                "You: " + cleanText + "\n"
        );


        // Decision Engine
        String response = engine.getResponse(cleanText);
                

        // Display bot response
        chatArea.append(  "Bot: " + response + "\n\n"
            
        );


        // Clear input
        inputField.setText("");
    }
}