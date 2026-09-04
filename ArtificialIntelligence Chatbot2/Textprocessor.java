public class TextProcessor {

    // Cleans user input by lowercasing and removing extra spaces/punctuation
    public String cleanText(String message) {
        if (message == null) {
            return "";
        }

        // Convert to lowercase
        String cleaned = message.toLowerCase().trim();

        // Remove special characters/punctuation
        cleaned = cleaned.replaceAll("[^a-z0-9 ]", "");

        // Convert multiple spaces to a single space
        cleaned = cleaned.replaceAll("\\s+", " ");

        return cleaned;
    }
}