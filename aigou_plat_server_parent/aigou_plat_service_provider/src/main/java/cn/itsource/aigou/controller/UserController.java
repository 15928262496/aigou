package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.User;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author 苏波
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if(user != null){
            if("admin".equals(user.getUsername()) && "123456".equals(user.getPassword())){
                return new AjaxResult();
            }
        }
        return AjaxResult.me().setMsg("登录失败!!!").setSuccess(false).setObject("这是一段描述");
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public AjaxResult test(){
        return new AjaxResult();
    }
}
