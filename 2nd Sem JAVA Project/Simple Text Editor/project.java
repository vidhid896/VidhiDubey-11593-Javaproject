public class project {
    public static void main(String[] args) {

        Document doc = new Document();

        doc.addText("Hello World");
        System.out.println("Text after adding:");
        doc.displayText();

        doc.reverseText();
        System.out.println("Text after reverse:");
        doc.displayText();

        doc.clearText();
        System.out.println("Text after clear:");
        doc.displayText();
    }
}

class Document {

    private StringBuffer textBuffer;

    public Document() {
        textBuffer = new StringBuffer();
    }

    public void addText(String input) {
        textBuffer.append(input);
    }

    public void clearText() {
        textBuffer.setLength(0);
    }

    public void reverseText() {
        textBuffer.reverse();
    }

    public void deleteText(int start, int end) {
        if (start >= 0 && end <= textBuffer.length() && start < end) {
            textBuffer.delete(start, end);
        } else {
            System.out.println("Invalid range");
        }
    }

    public void displayText() {
        if (textBuffer.length() == 0) {
            System.out.println("<empty>");
        } else {
            System.out.println(textBuffer.toString());
        }
    }
}
