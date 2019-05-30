// pages/me/me.js
const app = getApp();
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
        if (typeof this.getTabBar === 'function' &&
            this.getTabBar()) {
            this.getTabBar().setData({
                selected: 1
            });
            console.log(this.getTabBar().data.selected);
        }
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
        setTimeout(function () {
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

    initItem: function () {
        let _this = this;
        _this.setData({
            title: "加载中...",
            isLoad: false,
            listData: []
        });
        for (let i = 0; i <= 5; i++) {
            wx.request({
                url: 'https://api.imjad.cn/hitokoto/?encode=json',
                //json数据地址
                headers: {
                    'Content-Type': 'application/json'
                },
                success: function (res) {
                    let listData = _this.data.listData;
                    res.data["avatarUrl"] = "https://img.52z.com/upload/news/image/20181011/20181011092002_29968.jpg";
                    listData.push(res.data);
                    _this.setData({
                        listData: listData
                    })
                }
            })
        }
    },
    previewImage: function (e) {
        let current = e.target.dataset.src;
        wx.previewImage({
            current: current, // 当前显示图片的http链接
            urls: this.data.imgalist // 需要预览的图片http链接列表
        })
    },
    loadmore: function () {
        let _this = this;
        _this.setData({
            title: "加载中...",
            isLoad: false,
        });
        setTimeout(function () {
            for (let i = 0; i <= 5; i++) {
                if (_this.data.listData.length > 50) {
                    _this.setData({
                        title: "- 我是有底线的 -",
                        isLoad: true,
                    });
                    break;
                }
                wx.request({
                    url: 'https://api.imjad.cn/hitokoto/?encode=json',
                    //json数据地址
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    success: function (res) {
                        let listData = _this.data.listData;
                        res.data["avatarUrl"] = "https://img.52z.com/upload/news/image/20181011/20181011092002_29968.jpg";
                        listData.push(res.data);
                        _this.setData({
                            listData: listData
                        })
                    }
                })
            }
        }, 1000)
    },
    gotoLogin: function () {
        wx.switchTab({
            url: '/pages/me/me',
        })
    }
});