// pages/course/post.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    cindex: null,
    sindex: null,
    picker: ['第一章','第二章','新建章'],
    pickerSection: ['第一节','第二节','新建节'],
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
  PickercChange(e) {
    console.log(e);
    console.log(this.data.index);
    this.setData({
      cindex: e.detail.value
    })
  },
  PickersChange(e) {
    console.log(e);
    console.log(this.data.index);
    this.setData({
      sindex: e.detail.value
    })
  },
});