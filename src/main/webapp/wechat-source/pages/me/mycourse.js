// pages/me/me.js
const app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    courses: [],
    imgList: [],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.initItem();
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
    wx.showNavigationBarLoading(); //在标题栏中显示加载
    let that = this;
    //模拟加载
    setTimeout(function() {
      that.initItem();
      // complete
      wx.hideNavigationBarLoading(); //完成停止加载
      wx.stopPullDownRefresh(); //停止下拉刷新
    }, 1500);
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
    this.loadmore();
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

  initItem: function() {
    let that = this;
    that.setData({
      isLoad: true,
      courses: []
    });
    wx.request({
      url: 'http://localhost:8080/api/user/course/'+wx.getStorageSync("uid"),
      header: {
        'content-type': 'application/json'
      },
      data: {
        t: new Date()
      },
      success: function(res) {
        let data = res.data.data;

        if(data.courses.length<15){
          that.setData({
            isLoad: false
          });
        }
        that.setData({
          courses: data.courses
        });
        console.log(res.data.data.courses)
      },
      fail(res) {
        console.log(res)
      }
    });
  },
  previewImage: function (e) {
    let current=e.target.dataset.src;
    let index = e.target.dataset.index;
    let list = [];
    let imgUrls = this.data.courses[index-1]['imgUrls'];
    for(let key in imgUrls){
      list.push(imgUrls[key]);
    }
    this.setData({
      imgList: list
    });
    wx.previewImage({
      current: current, // 当前显示图片的http链接
      urls: this.data.imgList // 需要预览的图片http链接列表
    })
  },
  loadmore: function() {
    let _this = this;
    _this.setData({
      isLoad: true,
    });
    setTimeout(function() {
      for (let i = 0; i <= 5; i++) {
        if (_this.data.listData.length > 50) {
          _this.setData({
            isLoad: false,
          });
          break;
        }
        wx.request({
          url: 'http://localhost:8080/api/user/course/'+wx.getStorageSync("uid"),
          //json数据地址
          data: {
            t: new Date()
          },
          headers: {
            'Content-Type': 'application/json'
          },
          success: function(res) {
            let listData = _this.data.courses;
            listData.push(res.data.data.courses);
            _this.setData({
              courses: listData
            })
          }
        })
      }
    }, 1000)
  },
  goInto : function (e) {
    wx.navigateTo({
      url: '/pages/index/detail?cid='+e.target.dataset.cid,
    })
  }
});