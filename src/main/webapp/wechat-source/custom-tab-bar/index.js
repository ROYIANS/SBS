const app = getApp();
Component({
    data: {
        selected: 0,
    },
    properties: {},
    lifetimes: {
        //组件的生命周期函数
        attached() {

        },
        created() {
        },
    },
    methods: {
        switchTab(e) {
            const data = e.currentTarget.dataset;
            const url = data.path;
            wx.switchTab({url});
        },
        publish: function () {
            wx.switchTab({
                url: '/pages/index2/index2',
            })
        },
    }
});