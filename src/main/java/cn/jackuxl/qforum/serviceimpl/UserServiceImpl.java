package cn.jackuxl.qforum.serviceimpl;

import cn.jackuxl.qforum.mapper.UserMapper;
import cn.jackuxl.qforum.model.User;
import cn.jackuxl.qforum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        return userMapper.register(user);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }

    @Override
    public User getUserBySessionId(String sessionId) {
        return userMapper.getUserBySessionId(sessionId);
    }

    @Override
    public int setUserName(int id, String newName) {
        return userMapper.setUserName(id, newName);
    }

    @Override
    public int setPassword(int id, String newPassword) {
        return userMapper.setPassword(id, newPassword);
    }

    @Override
    public void setSessionId(int id, String newSessionId) {
        userMapper.setSessionId(id, newSessionId);
    }

    @Override
    public void setLastLoginIp(int id, String ip) {
        userMapper.setLastLoginIp(id, ip);
    }
}
