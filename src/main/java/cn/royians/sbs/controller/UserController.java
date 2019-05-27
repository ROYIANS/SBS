package cn.royians.sbs.controller;

import cn.royians.sbs.pojo.MUser;
import cn.royians.sbs.pojo.Message;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @PostMapping("rol")
    @ResponseBody
    public Message registerOrLogin(@RequestParam String JSCODE, @RequestParam String INFO) {
        Message message = new Message();
        try {
            MUser user = userService.registerOrLogin(JSCODE);
            if (user.getuNickname() == null) {
                // userService.updateUserInfo(INFO, userInfo);
            } else {
//                MUser old = userService.findUserByUID(user.getUid());
//                if (!old.getUserSessionKey().equals(userInfo.getUserSessionKey())) {
//                    userService.updateUserInfo(INFO, userInfo);
//                }
            }
            Map<String, String> data = new HashMap<>();
//            data.put("uid", userService.findUserByUID(userInfo.getUid()).getUid().toString());
//            data.put("session_key", userService.findUserByUID(userInfo.getUid()).getUser3rdKey());
            message.setData(data);
            message.setCode("200");
            message.setStatus("success");
        } catch (Exception e) {
            message.setData(e);
            message.setCode("-1");
            message.setStatus("error");
        }
        return message;
    }
}
