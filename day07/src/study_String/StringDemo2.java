package study_String;

public class StringDemo2 {
    /*
    获取两个字符串中最大相同子串，比如：
    str1 = "asnnshelloubdiwb";str2 = "wshelloww"
    提示：将短的那个串进行长度依次递减的子串与较长的子串进行比较。
    */
    public String getMaxSameString(String str1, String str2) {
        String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
        String minStr = (str1.length() <= str2.length()) ? str1 : str2;
        int length = minStr.length();
        for (int i = 0;i < length;i++) {
            for (int x = 0,y = length - 1;y <= length;x++,y++){
                String subStr = minStr.substring(x, y);
                if (maxStr.contains(subStr)){
                    return subStr;
                }
            }
        }
        return null;
    }
}
