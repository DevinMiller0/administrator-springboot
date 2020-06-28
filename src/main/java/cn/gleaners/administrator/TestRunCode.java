package cn.gleaners.administrator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WangDeSheng
 * @date 2020/6/13 13:51
 * description：
 */
public class TestRunCode {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("hello", "world");
        System.out.println(map.get("hello"));

        System.out.println(map.get("hi"));
        if (map.get("hi") == null) {
            System.out.println("is empty");
        }
    }

    public static String getStart0Count(String num) {
        int count = num.length() - String.valueOf(Integer.parseInt(num)).length();
        return num.substring(count);
    }
}
