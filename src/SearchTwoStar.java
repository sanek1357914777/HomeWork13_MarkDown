public class SearchTwoStar extends Main {
    private static int x = 0;

    static StringBuilder stringModify(String string) {
        sbTemp.setLength(0);
        x = string.indexOf("*");
        if (x == -1) return null;
        if (string.charAt(x) != string.charAt(x + 1)) return null;
        SetFreeSpaces.addspace(sbTemp);
        sbTemp.append("<p>").append(string);
        do {
            x = sbTemp.indexOf("**");
            sbTemp.replace(x, x + 2, "<strong>");
            x = sbTemp.indexOf("**");
            sbTemp.replace(x, x + 2, "</strong>");
        }
        while (sbTemp.indexOf("**") != -1);
        if (sbTemp.indexOf("</p>") == -1)
            sbTemp.append("</p>\n");
        sb.append(sbTemp);
        return sbTemp;
    }
}

