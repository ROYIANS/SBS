// pages/course/post.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    index: null,
    picker: ['图文','视频'],
    imgList: [],
    textareaValue: '',
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
  PickerChange(e) {
    console.log(e);
    console.log(this.data.index);
    this.setData({
      index: e.detail.value
    })
  },
  ChooseImage() {
    wx.chooseImage({
      count: 9, //默认9
      sizeType: ['original', 'compressed'], //可以指定是原图还是压缩图，默认二者都有
      sourceType: ['album'], //从相册选择
      success: (res) => {
        if (this.data.imgList.length != 0) {
          this.setData({
            imgList: this.data.imgList.concat(res.tempFilePaths)
          })
        } else {
          this.setData({
            imgList: res.tempFilePaths
          })
        }
      }
    });
  },
  ViewImage(e) {
    wx.previewImage({
      urls: this.data.imgList,
      current: e.currentTarget.dataset.url
    });
  },
  DelImg(e) {
    wx.showModal({
      title: 'Vidorra',
      content: '确定要删除这张图片吗？',
      cancelText: '再看看',
      confirmText: '确认',
      success: res => {
        if (res.confirm) {
          this.data.imgList.splice(e.currentTarget.dataset.index, 1);
          this.setData({
            imgList: this.data.imgList
          })
        }
      }
    })
  },
  textareaInput(e) {
    this.setData({
      textareaValue: e.detail.value
    })
  },
  formSubmit: function(e) {
    let that = this;
    console.log('form发生了submit事件，携带数据为：', e.detail.value);
    console.log(this.data.imgList);
    wx.uploadFile({
      url: 'https://sm.ms/api/upload',
      filePath: that.data.imgList[0],
      name: 'smfile',
      success: res => {
        console.log('上传成功：', res.data);
      }
    });
  },
  test : function () {
    wx.chooseImage({
      success (res) {
        const tempFilePaths = res.tempFilePaths;
        wx.uploadFile({
          url: 'https://sm.ms/api/upload', //仅为示例，非真实的接口地址
          filePath: tempFilePaths[0],
          name: 'file',
          success (res){
            const data = res.data;
            console.log(data)
            //do something
          },
          fail(res) {
            console.log(res);
            console.log(filePath);
            console.log(that.data.imgList[0]);
          }
        })
      }
    })
  }
});