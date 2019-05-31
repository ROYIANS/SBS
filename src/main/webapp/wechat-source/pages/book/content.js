// pages/index/detail.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        imgalist: [
            'https://image.weilanwl.com/img/square-1.jpg',
            'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=76488821,1544190324&fm=26&gp=0.jpg',
            'https://image.weilanwl.com/img/square-1.jpg'
        ],
        modalName: null,
        selectedFlag: [false, false, false, false]
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
    previewImage: function (e) {
        let current = e.target.dataset.src;
        wx.previewImage({
            current: current, // 当前显示图片的http链接
            urls: this.data.imgalist // 需要预览的图片http链接列表
        })
    },

    showModal(e) {
        console.log("jjj");
        this.setData({
            modalName: e.currentTarget.dataset.target
        })
    },
    hideModal(e) {
        this.setData({
            modalName: null
        })
    },
    goto: function (e) {
        let data = e.currentTarget.dataset;
        const url = data.path;
        wx.navigateTo({
            url: url,
        })
    },
    changeToggle:function(e){
        let index = e.currentTarget.dataset.index;
        this.data.selectedFlag[index] = !this.data.selectedFlag[index];

        this.setData({
            selectedFlag: this.data.selectedFlag
        })
    },
    hold: function () {
        
    },
    prev: function () {
        
    },
    next: function () {
        
    }
});