// pages/index/detail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    content: null,
    imgList: [],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
    wx.request({
      url: 'http://localhost:8080/api/course/'+ options.cid,
      header: {
        'content-type': 'application/json'
      },
      success: function(res) {
        let data = res.data.data;
        that.setData({
          content: data
        });
        console.log(res.data.data)
      },
      fail(res) {
        console.log(res)
      }
    });
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
  previewImage: function (e) {
    let current=e.target.dataset.src;
    let list = [];
    let imgUrls = this.data.content['imgUrls'];
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
});