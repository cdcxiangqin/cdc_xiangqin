$(document).ready(function () {
    //signin向接口请求跳转登录页面
    $("#signin").click(function () {
        window.location.href="/signin";
    })

    //signup向接口请求跳转注册页面
    $("#signup").click(function () {
        window.location.href="/registerPage";
    })

    //登陆后跳回index页面
    $.ajax({
        url:"/user/getSelf",
        type:"POST",
        dataType:"json",
        cache:false,
        contentType: 'application/json;charset=utf-8',
        async:false,
        data:JSON.stringify({"test":"test"}),
        success:function(data){
            var result = data.result;
            if ("success" == result){
                // $("#logindiv").hide();
                var username = data.user.username;
                $("#logindiv").css("display","none");
                $("#userdiv").css("display","block");
                $("#loginname").text(username);
                $("#loginout").text("退出");
            }else{
                $("#userdiv").css("display","none");
                $("#logindiv").css("display","block");
            }

        }
    })
    //注册后跳回index页面
    $.ajax({
        url:"/user/getSelf",
        type:"POST",
        dataType:"json",
        cache:false,
        contentType: 'application/json;charset=utf-8',
        async:false,
        data:JSON.stringify({"test":"test"}),
        success:function(data){
            var result = data.result;
            if ("success" == result){
                // $("#logindiv").hide();
                var username = data.user.username;
                $("#logindiv").css("display","none");
                $("#userdiv").css("display","block");
                $("#loginname").text(username);
                $("#loginout").text("退出");
            }else{
                $("#userdiv").css("display","none");
                $("#logindiv").css("display","block");
            }

        }
    })
});
