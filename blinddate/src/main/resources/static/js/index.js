$(document).ready(function () {
    //signin向接口请求跳转登录页面
    $("#signin").click(function () {
        window.location.href="/signin";
    })

    //signup向接口请求跳转注册页面
    $("#signup").click(function () {
        window.location.href="/registerPage";
    })
});