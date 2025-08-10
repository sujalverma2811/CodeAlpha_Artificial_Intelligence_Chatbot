public class Chatbot {

    public String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi") || input.contains("hyy")) {
            return "Hello! How can I help you today?";
        } else if (input.contains("how are you")) {
            return "I'm doing great, thank you for asking!";
        } else if (input.contains("bye")) {
            return "Goodbye! Have a great day!";
        }else if (input.contains("weather")) {
            return "I can’t check live weather yet, but I bet it’s sunny somewhere!";
        } else if (input.contains("joke")) {
            return "Why don’t skeletons fight? They don’t have the guts.";
        } else {
            return "I'm not sure how to respond to that.";
        }
    }
}
// hii, hello , hyy
// how are you
// bye
// weather
// joke 
