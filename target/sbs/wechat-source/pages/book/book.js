// pages/me/me.js
const app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isTap: 1,
    booklist:[],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    this.timeSort();
    console.log('onLoad')
    let that = this;
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
        console.log(res.data.data.data)
        let book = res.data.data.data;
        that.setData({
          booklist: book
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
        selected: 2
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

  timeSort: function() {
    let list = this.data.booklist;

    function f(a, b) {
      return a.timestamp - b.timestamp;
    }

    this.setData({
      booklist: list.sort(f),
      isTap: 1
    })
  },

  nameSort: function() {
    let list = this.data.booklist;

    function f(a, b) {
      return a["title"].localeCompare(b["title"])
    }

    this.setData({
      booklist: list.sort(f),
      isTap: 2
    })
  },

  show: function() {
    wx.showToast({
      title: 'Hello!',
      icon: "none"
    });
  },
  searchIcon(e) {
    let key = e.detail.value.toLowerCase();
    let list = this.data.booklist;
    for (let i = 0; i < list.length; i++) {
      let a = key;
      let b = list[i].title.toLowerCase();
      list[i].isShow = b.search(a) !== -1;
    }
    this.setData({
      booklist: list
    })
  },
  seeBook: function() {
    wx.navigateTo({
      url: '/pages/book/content'
    })
  }
});