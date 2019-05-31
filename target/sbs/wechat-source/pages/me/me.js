// pages/me/me.js
const app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    courses: [],
    booklist: [],
    userInfo: {
      avatarUrl: "", //用户头像
      nickname: "" //用户昵称
    }
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    let that = this;
    /**
     * 获取用户信息
     */
    let data = wx.getStorageSync('user');
    let userinfo = {
      avatarUrl: data.avatarUrl,
      nickname: data.nickName
    }
    this.setData({
      userInfo: userinfo
    });

    wx.request({
      url: 'http://localhost:8080/api/book/list', //仅为示例，并非真实的接口地址
      method: 'GET',
      data: {
        'gid': '1'
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded' // 默认值
      },
      success(res) {
        console.log(res.data.data)
        let book = res.data.data;
        that.setData({
          booklist: book.data
        });
      }
    });

    wx.request({
      url: 'http://localhost:8080/api/user/course/' + wx.getStorageSync("uid"),
      header: {
        'content-type': 'application/json'
      },
      data: {
        t: new Date()
      },
      success: function(res) {
        let data = res.data.data;
        that.setData({
          courses: data.courses
        });
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {
    if (typeof this.getTabBar === 'function' &&
      this.getTabBar()) {
      this.getTabBar().setData({
        selected: 4
      })
    }
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  },

  goto: function(e) {
    let data = e.currentTarget.dataset;
    const url = data.path;
    wx.navigateTo({
      url: url,
    })
  },
});