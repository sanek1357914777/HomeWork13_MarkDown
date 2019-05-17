public class Main {
    static StringBuilder sb = new StringBuilder();
    static StringBuilder sbTemp = new StringBuilder();
    static StringBuilder sbTempModify = new StringBuilder();

    public static void main(String[] args) {
        String string = "##Header line\n" +
                "Simple line *with* em\n" +
                "Simple **line** with strong\n" +
                "Line with link [Link to google]( https://www.google.com ) in center\n" +
                "Line **with** *many* **elements** and link [Link to FB]( https://www.facebook.com )";

        String[] splitString = Markdown.newstr(string);
        SearchHead.Search(splitString[0]);

        for (int i = 1; i < splitString.length; i++) {
            SearchTwoStar.stringModify(splitString[i]);
            SearchOneStar.stringModify(splitString[i], sbTemp);
            SearchLink.stringModify(splitString[i], sbTemp);

        }
        System.out.println(sb);
    }
}
