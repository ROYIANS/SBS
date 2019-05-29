package cn.royians.sbs.controller;

import cn.royians.sbs.pojo.Message;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.GroupService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/group")
public class GroupController {
    private final
    GroupService groupService;
    
    private final
    CommonService commonService;

    @Autowired
    public GroupController(GroupService groupService, CommonService commonService) {
        this.groupService = groupService;
        this.commonService = commonService;
    }

    @PostMapping("add")
    @ResponseBody
    public Message add(@RequestParam String name, @RequestParam String avatar, @RequestParam Integer uid) {
        try {
            String data = groupService.add(name, avatar, uid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @GetMapping("{gid}")
    @ResponseBody
    public Message get(@PathVariable Integer gid) {
        try {
            JSONObject data = groupService.get(gid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/join")
    @ResponseBody
    public Message join(@RequestParam Integer uid, @RequestParam String code) {
        try {
            String data = groupService.join(uid, code);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/del/{gid}")
    @ResponseBody
    public Message join(@PathVariable Integer gid) {
        try {
            String data = groupService.del(gid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("edit/{gid}")
    @ResponseBody
    public Message edit(@PathVariable Integer gid, @RequestParam String name, @RequestParam String avatar) {
        try {
            String data = groupService.edit(gid, name, avatar);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/quit")
    @ResponseBody
    public Message quit(@RequestParam Integer uid) {
        try {
            String data = groupService.quit(uid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/{gid}/users")
    @ResponseBody
    public Message getGroupUsers(@PathVariable Integer gid) {
        try {
            List<JSONObject> data = groupService.getGroupUsers(gid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }

    @PostMapping("/del/user/{uid}")
    @ResponseBody
    public Message delUserInGroup(@PathVariable Integer uid) {
        try {
            String data = groupService.delUser(uid);
            return commonService.setSuccessMessage(data);
        }
        catch (Exception e) {
            return commonService.setFailureMessage(e);
        }
    }
}
