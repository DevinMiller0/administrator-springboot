package cn.gleaners.administrator;


import cn.gleaners.administrator.model.TestModel;
import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/13 13:51
 * description：
 */
public class TestRunCode {
    public static void main(String[] args) {

        //A2FBD8E8  A2FBD8E8
        String s ="";

        List<TestModel> list = JSON.parseArray(s, TestModel.class);

        System.out.println(list.size());
    }
}
