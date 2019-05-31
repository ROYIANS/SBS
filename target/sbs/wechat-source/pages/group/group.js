// pages/me/me.js
const app = getApp();

Page({

    /**
     * 页面的初始数据
     */
    data: {
        isTap: '1',
        gid : null,
        data: null
    },

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
        if (typeof this.getTabBar === 'function' &&
            this.getTabBar()) {
            this.getTabBar().setData({
                selected: 3
            })
        }
        this.setData({
            gid: wx.getStorageSync("gid")
        });
        this.getGroupInfo();
    },

    getGroupInfo: function() {
        let that = this;
        wx.request({
            url: 'http://localhost:8080/api/group/'+wx.getStorageSync("gid"),
            header: {
                'content-type': 'application/json'
            },
            success: function(res) {
                let data = res.data.data;
                that.setData({
                    data: data,
                });
                console.log(res.data);
            },
            fail(res) {
                console.log(res)
            }
        });
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
    goto: function (e) {
        let data = e.currentTarget.dataset;
        const url = data.path;
        wx.navigateTo({
            url: url,
        })
    },
    tapIT: function (e) {
        let data = e.currentTarget.dataset;
        this.setData({
            isTap: data.tap,
        });
    },

    getScancode:function(){
        wx.scanCode({
            success: (res) => {
                console.log(res);
            }
        });
    },
});