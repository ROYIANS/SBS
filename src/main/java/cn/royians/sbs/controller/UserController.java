package cn.royians.sbs.controller;

import cn.royians.sbs.pojo.MUser;
import cn.royians.sbs.pojo.Message;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/user")
public class UserController {
    private final
    UserService userService;

    private final
    CommonService commonService;

    @Autowired
    public UserController(UserService userService, CommonService commonService) {
        this.userService = userService;
        this.commonService = commonService;
    }

    @PostMapping("/rol")
    @ResponseBody
    public Message registerOrLogin(@RequestParam String JSCODE, @RequestParam String INFO) {
        try {
            MUser user = userService.registerOrLogin(JSCODE);
            if (user.getuNickname() == null) {
                userService.updateUserInfo(INFO, user);
            } else {
                MUser old = commonService.findUserByUID(user.getuId());
                if (!old.getuSessionKey().equals(user.getuSessionKey())) {
                    userService.updateUserInfo(INFO, user);
                }
            }
            Map<String, String> data = new HashMap<>();
            data.put("uid", commonService.findUserByUID(user.getuId()).getuId().toString());
            data.put("session_key", commonService.findUserByUID(user.getuId()).getU3rdKey());
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @GetMapping("/{uid}")
    @ResponseBody
    public Message getUserInfo(@PathVariable Integer uid) {
        try {
            JSONObject data = userService.getUserInfoByUID(uid);
            return commonService.setSuccessMessage(data);
        } catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @GetMapping("/book/{uid}")
    @ResponseBody
    public Message getUsersBooks(@PathVariable Integer uid){
        try {
            JSONObject data = userService.getBooksOfUID(uid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e){
            return commonService.setFailureMessage(e);
        }
    }

    @GetMapping("/course/{uid}")
    @ResponseBody
    public Message getUserCourses(@PathVariable Integer uid){
        try {
            JSONObject data = userService.getCoursesOfUID(uid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e){
            return commonService.setFailureMessage(e);
        }
    }
}
