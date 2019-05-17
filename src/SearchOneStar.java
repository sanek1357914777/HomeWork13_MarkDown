public class SearchOneStar extends Main {
    private static int x = 0;

    static StringBuilder stringModify(String string, StringBuilder sbTemp) {
        sbTempModify.setLength(0);
        if (sbTemp.length() == 0) {
            sbTemp.append(string);
        }
        x = sbTemp.indexOf("*");
        if (x == -1) return null;
        if (sbTemp.charAt(x) == sbTemp.charAt(x + 1)) return null;

        if (sbTemp.indexOf("   ") == -1) {
            SetFreeSpaces.addspace(sbTempModify);
            sbTempModify.append("<p>");
        }
        sbTempModify.append(sbTemp);
        do {
            x = sbTempModify.indexOf("*");
            sbTempModify.replace(x, x + 1, "<em>");
            x = sbTempModify.indexOf("*");
            sbTempModify.replace(x, x + 1, "</em>");
        }
        while (sbTempModify.indexOf("*") != -1);
        if (sbTempModify.indexOf("</p>") == -1) sbTempModify.append("</p>\n");
        sb.append(sbTempModify);
        return sbTempModify;
    }
}

