public class DecisionEngine {

    public String getResponse(String message) {

        if (message.equals("hello") || message.equals("hi")) {

            return "Hello! How can I help you?";

        }

        else if (message.equals("how are you")) {

            return "I am fine. Thank you for asking!";

        }

        else if (message.equals("what is your name")) {

            return "My name is JavaBot.";

        }

        else if (message.equals("who are you")) {

            return "I am a Java based rule based chatbot.";

        }

        else if (message.equals("what can you do")) {

            return "I can answer some frequently asked questions.";

        }

        else if (message.equals("help")) {

            return "You can ask me about my name, purpose, capabilities or say hello.";

        }

        else if (message.equals("what is java")) {

            return "Java is a popular object oriented programming language.";

        }

        else if (message.equals("what is nlp")) {

            return "NLP stands for Natural Language Processing. It helps computers process human language.";

        }

        else if (message.equals("thank you") || message.equals("thanks")) {

            return "You are welcome!";

        }

        else if (message.equals("bye") || message.equals("goodbye")) {

            return "Goodbye! Have a nice day.";

        }

        else {

            return "Sorry, I don't understand your question.";
        }
    }
}
