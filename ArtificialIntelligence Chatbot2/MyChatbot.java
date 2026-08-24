public class MyChatbot {
     

    public static void main(String[] args) {

        // TextProcessor object
        Textprocessor processor =
                new Textprocessor();


        // DecisionEngine object
        DecisionEngine engine =
                new DecisionEngine();


        // GUI object
        ChatbotGUI gui =  new ChatbotGUI(processor, engine);
                
    }
}

