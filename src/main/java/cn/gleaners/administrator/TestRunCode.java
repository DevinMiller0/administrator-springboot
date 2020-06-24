package cn.gleaners.administrator;

import java.util.Arrays;

/**
 * @author WangDeSheng
 * @date 2020/6/13 13:51
 * description：
 */
public class TestRunCode {
    public static void main(String[] args) {

//        System.out.println("f030".replaceFirst("^0*", ""));
        String s = "OK LOGIN=M NPLC={F00D,0};{F00D,0};{F00D,0};{F00D,0};";
        String s1 = "NPLC={F00D,0};{F00D,0};{F00D,0};{F00D,0};";
        String m = "";
        if (s.indexOf("OK LOGIN=M NPLC=") == 0) {
            m = s.substring(16);
        }

        m = m.replace("{", "").replace("}", "");
        String[] arr = m.split(";");
        System.out.println(arr.length);
        for (String i : arr) {
            System.out.println(i);
        }

    }

    public static String getStart0Count(String num) {
        int count = num.length() - String.valueOf(Integer.parseInt(num)).length();
        return num.substring(count);
    }
}
