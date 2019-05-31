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
    content: null,
    imgURLs: null,
    vidURL: null
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
        if (this.data.imgList.length !== 0) {
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
    wx.showLoading({
      title: '发表中',
    });
    let that = this;
    console.log('form发生了submit事件，携带数据为：', e.detail.value);
    console.log(this.data.imgList);
    let imgURLs = [];
    let count = 0;
    for (let i =0;i<that.data.imgList.length;i++) {
      let index = i;
      wx.uploadFile({
        url: 'https://sm.ms/api/upload',
        filePath: that.data.imgList[i],
        name: 'smfile',
        success: res => {
          let data = JSON.parse(res.data);
          imgURLs.push(data.data.url);
          console.log(imgURLs);
          if(count===that.data.imgList.length-1){
            that.submitToDatabase();
          }
        },
        complete(res) {
          count = count + 1;
        }
      });
    }



    that.setData({
      content: e.detail.value.content,
      imgURLs: imgURLs
    });
  },
  submitToDatabase : function () {
    let that = this;
    let imgUrls = that.data.imgURLs;
    let imgdata = {};
    let vidUrl = that.data.vidURL;

    if (imgUrls.length>0){
      for(let i=0; i<imgUrls.length;i++) {
        imgdata[i+1]=imgUrls[i];
      }
    }
    wx.request({
      url: 'http://localhost:8080/api/course/post', // 仅为示例，并非真实的接口地址
      method: 'POST',
      data: {
        uid: wx.getStorageSync("uid"),
        content: '{"content":"' + this.data.content + '"}',
        imgUrls: JSON.stringify(imgdata),
        vidUrl: vidUrl
      },
      header: {
        'content-type': 'application/x-www-form-urlencoded' // 默认值
      },
      success(res) {
        wx.hideLoading();
        wx.showToast({
          title: '发表成功',
        });
        console.log(res.data);
      }
    });
  }
});