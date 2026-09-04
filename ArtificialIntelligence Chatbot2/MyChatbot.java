public class MyChatbot {
     

    public static void main(String[] args) {

        // TextProcessor object
        TextProcessor processor =   new TextProcessor();

                


        // DecisionEngine object
        DecisionEngine engine =
                new DecisionEngine();


        // GUI object
        ChatbotGUI gui =  new ChatbotGUI(processor, engine);
                
    }
}

