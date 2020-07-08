package cn.gleaners.administrator.mapper;

import cn.gleaners.administrator.model.AdminEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:54
 * description：
 */
@Mapper
public interface ILoginMapper {
    AdminEntity login(@Param("username") String username, @Param("password") String password);
}
