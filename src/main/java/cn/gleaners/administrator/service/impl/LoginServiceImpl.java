package cn.gleaners.administrator.service.impl;

import cn.gleaners.administrator.mapper.LoginMapper;
import cn.gleaners.administrator.model.AdminEntity;
import cn.gleaners.administrator.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangDeSheng
 * @date 2020/6/12 17:26
 * description：
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public AdminEntity login(String username, String password) {
        return loginMapper.login(username, password);
    }
}
