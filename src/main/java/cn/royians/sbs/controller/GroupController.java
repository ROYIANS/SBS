package cn.royians.sbs.controller;

import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
