public class SearchHead extends Main {
    static StringBuilder Search(String string) {

        if (string.startsWith("#")) {
            sb.append("<html>\n" +
                    "<body>\n");
            int startText = 1;
            int j = 0;

            while (string.charAt(j) == string.charAt(0)) {
                startText++;
                j++;
            }
            SetFreeSpaces.addspace(sb);
            sb.append("<h2>").append(string.substring(j)).append("</h2>\n");

            return sb;
        }
        return null;
    }
}