package cn.royians.sbs.service.impl;

import cn.royians.sbs.mapper.MGroupMapper;
import cn.royians.sbs.service.CommonService;
import cn.royians.sbs.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {
    private final
    MGroupMapper groupMapper;

    private final
    CommonService commonService;

    @Autowired
    public GroupServiceImpl(MGroupMapper groupMapper, CommonService commonService) {
        this.groupMapper = groupMapper;
        this.commonService = commonService;
    }
}
