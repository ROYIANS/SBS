package cn.royians.sbs.service.impl;

import cn.royians.sbs.pojo.MUser;
import cn.royians.sbs.service.UserService;
import cn.royians.sbs.util.HttpClientExample;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public MUser registerOrLogin(String jscode) {
//        try {
//            String APPID = "";
//            String SECRET = "";
//            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + APPID + "&secret=" + SECRET + "&js_code=" + JSCODE + "&grant_type=authorization_code";
//            HttpClientExample http = new HttpClientExample();
//            JSONObject jsonObject = http.sendGet(url);
//            if (this.findUserByOpenID(jsonObject.getString("openid")) == null) {
//                BbsUserInfo userInfo = new BbsUserInfo();
//                userInfo.setUserOpenid(jsonObject.getString("openid"));
//                userInfo.setUserSessionKey(jsonObject.getString("session_key"));
//                userInfoMapper.insertSelective(userInfo);
//                BbsUserTrans userTrans = new BbsUserTrans();
//                userTrans.setUid(this.findUserByOpenID(jsonObject.getString("openid")).getUid());
//                userTrans.setUserLikePids("{\"pids\": []}");
//                userTrans.setUserCollectionPids("{\"pids\": []}");
//                userTrans.setUserFocusUids("{\"uids\": []}");
//                userTrans.setUserFollowerUids("{\"uids\": []}");
//                userTrans.setUserRefer("{\"data\": []}");//{"data": [{"pid": "1", "uid": "1"}]}
//                userTransMapper.insertSelective(userTrans);
//            }
//            if (!this.findUserByOpenID(jsonObject.getString("openid")).getUserSessionKey().equals(jsonObject.getString("session_key"))) {
//                BbsUserInfo userInfo = this.findUserByOpenID(jsonObject.getString("openid"));
//                userInfo.setUserSessionKey(jsonObject.getString("session_key"));
//                return userInfo;
//            }
//            return this.findUserByOpenID(jsonObject.getString("openid"));
//        } catch (Exception e) {
//            System.out.println(e);
            return null;
//        }
    }
}
