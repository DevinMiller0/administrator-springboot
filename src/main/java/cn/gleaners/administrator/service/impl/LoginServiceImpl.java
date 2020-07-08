package cn.gleaners.administrator.service.impl;

import cn.gleaners.administrator.mapper.ILoginMapper;
import cn.gleaners.administrator.model.AdminEntity;
import cn.gleaners.administrator.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangDeSheng
 * @date 2020/6/12 17:26
 * description：
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    ILoginMapper loginMapper;

    @Override
    public AdminEntity login(String username, String password) {
        return loginMapper.login(username, password);
    }
}
