public class SearchLink extends Main {

    static void stringModify(String string, StringBuilder sbTemp) {
        int startIndexReplace = sbTemp.indexOf("[") + 1;
        int endIndexReplace = sbTemp.indexOf("]");
        int startTargetReplace = sbTemp.indexOf("http");
        int endTargetReplace = sbTemp.lastIndexOf("com") + 3;
        sbTempModify.setLength(0);


        if (startIndexReplace != 0 && endIndexReplace != 0 && startTargetReplace != 0 && endTargetReplace != 0) {
            if (sbTemp.indexOf("   ") == -1) {
                SetFreeSpaces.addspace(sbTempModify);
                sbTempModify.append("<p>");
            }
            sbTempModify.append(sbTemp.substring(0, startIndexReplace - 1) + "<a href = ''")
                    .append(sbTemp.substring(startTargetReplace, endTargetReplace) + "''>");
            sbTempModify.append(sbTemp.substring(startIndexReplace, endIndexReplace) + "</a>")
                    .append(sbTemp.substring(endTargetReplace + 2));


        }
        if (sbTempModify.indexOf("</p>") == -1) sbTempModify.append("</p>\n");
        sb.append(sbTempModify);
    }
}
