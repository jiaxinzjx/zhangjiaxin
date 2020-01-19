package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.po.User;
import com.example.demo.po.UserCriteria;
import com.example.demo.util.ResultList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public ResultList findUserById(String id){
        ResultList res=new ResultList();
        User u=userMapper.selectByPrimaryKey(id);
        if(u!=null){
            res.setObj(u);
        }else{
            res.setStatus("500");
            res.setMessage("error");
        }
        return res;
    }
    public ResultList findAllUsers(){
        ResultList res = new ResultList();
        UserCriteria uc = new UserCriteria();
        List<User> list = userMapper.selectByExample(uc);
        if(list.size()>0){
            res.setList(list);
        }else{
            res.setStatus("500");
            res.setMessage("error");

        }


        return res;
    }

    public ResultList findAllUsersByUnameAndPsw(String uname,String psw){
        ResultList res = new ResultList();
        UserCriteria uc = new UserCriteria();
        uc.createCriteria().andVusernameEqualTo(uname).andVpasswordEqualTo(psw);
        List<User> list = userMapper.selectByExample(uc);
        if(list.size()>0){
            res.setList(list);
        }else{
            res.setStatus("500");
            res.setMessage("error");

        }


        return res;
    }




    public ResultList addUser(User user){
        ResultList res = new ResultList();
        int a = userMapper.insert(user);
        if(a>0){
            res.setMessage("addSuccess");
        }else{
            res.setStatus("500");
            res.setMessage("error");
        }
        return res;
    }


    public ResultList modifyUser(String id,String nick){
        ResultList res = new ResultList();
        User user = userMapper.selectByPrimaryKey(id);
        user.setVnickname(nick);
        int a = userMapper.updateByPrimaryKey(user);
        if(a>0){
            res.setMessage("modifySuccess");

        }else{
            res.setMessage("error");
            res.setStatus("500");
        }
        return res;
    }


    public ResultList delUser(String id){
        ResultList res = new ResultList();
        int a = userMapper.deleteByPrimaryKey(id);
        if(a>0){
            res.setMessage("delSuccess");
        }else{
            res.setStatus("500");
            res.setMessage("error");
        }
        return res;
    }
}
