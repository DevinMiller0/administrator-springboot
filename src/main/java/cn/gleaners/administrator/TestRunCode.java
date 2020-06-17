package cn.gleaners.administrator;

/**
 * @author WangDeSheng
 * @date 2020/6/13 13:51
 * description：
 */
public class TestRunCode {
    public static void main(String[] args) {

//        char[] arr = "12233340".toCharArray();
//        for (char c : arr) {
//            System.out.println(c);
//        }

        String testString = "G6SD4F5GR2S9";

        for (int i = 0; i < testString.length(); i++) {

        }
    }

    public static String getStart0Count(String num) {
        int count = num.length() - String.valueOf(Integer.parseInt(num)).length();
        return num.substring(count);
    }
}
