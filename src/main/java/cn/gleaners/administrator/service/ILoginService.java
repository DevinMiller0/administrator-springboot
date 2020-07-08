package cn.gleaners.administrator.service;

import cn.gleaners.administrator.model.AdminEntity;

/**
 * @author WangDeSheng
 * @date 2020/6/12 17:25
 * description：
 */
public interface ILoginService {
    AdminEntity login(String username, String password);
}
