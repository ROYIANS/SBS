// pages/me/me.js
const app = getApp();
Page({

    /**
     * 页面的初始数据
     */
    data: {
        isTap: 1,
        booklist: [{
            title: 'Spring0 入门1',
            time: '2019.05.30',
            author: 'ROYIANS',
            timestamp: 1510,
            isShow: true
        }, {
            title: 'Apring0 入门2',
            time: '2019.04.30',
            author: 'ROYIANS',
            timestamp: 1400,
            isShow: true
        }, {
            title: '在Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        }, {
            title: '不Spring0 入门3',
            time: '2019.05.03',
            author: 'ROYIANS',
            timestamp: 1410,
            isShow: true
        },],
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        this.timeSort();
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

    timeSort: function () {
        let list = this.data.booklist;

        function f(a, b) {
            return a.timestamp - b.timestamp;
        }

        this.setData({
            booklist: list.sort(f),
            isTap: 1
        })
    },

    nameSort: function () {
        let list = this.data.booklist;

        function f(a, b) {
            return a["title"].localeCompare(b["title"])
        }

        this.setData({
            booklist: list.sort(f),
            isTap: 2
        })
    },

    show: function () {
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
    goto: function (e) {
        let data = e.currentTarget.dataset;
        const url = data.path;
        wx.navigateTo({
            url: url,
        })
    },
    seeBook: function () {
        wx.navigateTo({
            url: '/pages/book/content'
        })
    }
});