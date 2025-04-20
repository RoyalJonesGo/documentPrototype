public class TextDocument implements Document{
    private int filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(int filePath, String encoding, int wordCount){
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone(){
        return new TextDocument(filePath, encoding, wordCount);
    }

    @Override
    public void open(){
        System.out.println("Opening Text Document: meeting_notes.txt with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType(){
        return "Text, Path: meeting_notes.txt, Encoding: " + encoding + ", Words: " + wordCount;
    }
}
