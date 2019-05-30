// pages/us/login.js
Page({

    /**
     * 页面的初始数据
     */
    data: {},

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {

    },

    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function () {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function () {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function () {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function () {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    },
    userInfoHandler: function (e) {
        // console.log(wx.getStorageSync("session_key"));
        if (e.detail.userInfo) {
            // console.log(e.detail.userInfo);
            wx.showLoading({
                title: '登录中',
            });
            wx.login({
                success: function (res) {
                    var code = res.code;
                    if (code) {
                        // console.log('获取用户登录凭证：' + code);
                        wx.request({
                            url: 'http://192.168.1.7:8080/api/user/rol', // 仅为示例，并非真实的接口地址
                            method: 'POST',
                            data: {
                                JSCODE: code,
                                INFO: JSON.stringify(e.detail.userInfo)
                            },
                            header: {
                                'content-type': 'application/x-www-form-urlencoded' // 默认值
                            },
                            success(res) {
                                wx.hideLoading();
                                if (res.data.code === "200") {
                                    wx.showToast({
                                        title: '登录成功',
                                    });
                                    let data = res.data.data;
                                    wx.setStorageSync("uid", data.uid);
                                    wx.setStorageSync("session_key", data.session_key);
                                    wx.request({
                                        url: 'http://192.168.1.7:8080/api/user/' + wx.getStorageSync("uid"),
                                        //json数据地址
                                        headers: {
                                            'Content-Type': 'application/json'
                                        },
                                        success: function (res) {
                                            // console.log(res.data);
                                        }
                                    });
                                    wx.switchTab({
                                        url: '/pages/index/index'
                                    })
                                }
                                // console.log(res.data);
                            }
                        })
                    } else {
                        // console.log('获取用户登录态失败：' + res.errMsg);
                    }
                },
                fail: function () {
                    wx.hideLoading();
                    wx.showToast({
                        title: '登录超时',
                    })
                }
            });
            this.setData({
                userinfo: e.detail.userInfo
            })
            //用户按了允许授权按钮
        } else {
            wx.showToast({
                title: '你取消了授权，将无法使用本小程序',
                icon: "none"
            });

            //用户按了拒绝按钮
        }
    },
});