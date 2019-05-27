package cn.royians.sbs.service.impl;

import cn.royians.sbs.pojo.Message;
import cn.royians.sbs.service.CommonService;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {

    @Override
    public Message setSuccessMessage(Object data) {
        Message message = new Message();
        message.setData(data);
        message.setCode("200");
        message.setStatus("success");
        return message;
    }

    @Override
    public Message setFailureMessage(Exception e) {
        Message message = new Message();
        message.setData(e);
        message.setCode("-1");
        message.setStatus("error");
        return message;
    }
}
