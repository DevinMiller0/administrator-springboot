package cn.gleaners.administrator.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:54
 * description：
 */
@Mapper
public interface LoginMapper {
    void login(String username,String password);
}
