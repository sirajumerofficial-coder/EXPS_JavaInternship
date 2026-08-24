public class Textprocessor {

    public String cleanText(String message) {

        // Lowercase
        String cleanText = message.toLowerCase();

        // Extra spaces remove
        cleanText = cleanText.trim();

        // Punctuation remove
        cleanText = cleanText.replaceAll("[^a-z0-9 ]", "");

        // Multiple spaces ko single space
        cleanText = cleanText.replaceAll("\\s+", " ");

        return cleanText;
    }
}