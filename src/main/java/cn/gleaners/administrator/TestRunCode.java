package cn.gleaners.administrator;

/**
 * @author WangDeSheng
 * @date 2020/6/13 13:51
 * description：
 */
public class TestRunCode {
    public static void main(String[] args) {

        System.out.println(getStart0Count("00001124200"));
    }

    public static String getStart0Count(String num) {
        int count = num.length() - String.valueOf(Integer.parseInt(num)).length();
        return num.substring(count);
    }
}
