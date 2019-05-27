package cn.royians.sbs.service;

import cn.royians.sbs.pojo.Message;

public interface CommonService {
    Message setSuccessMessage(Object data);
    Message setFailureMessage(Exception e);
}
