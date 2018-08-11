$(document).ready(function () {
    //signin向接口请求跳转登录页面
    $("#signin").click(function () {
        window.location.href="/signin";
    })

    //signup向接口请求跳转注册页面
    $("#signup").click(function () {
        window.location.href="/registerPage";
    })

    //退出
    $("#loginout").click(function () {
        $.ajax({
            url:"/user/unlogin",
            type:"POST",
            dataType:"json",
            cache:false,
            contentType: 'application/json;charset=utf-8',
            async:false,
            data:"{}",
            success:function(data){
                window.location.href="/signin";
            }
        })
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

    // 根据是否登陆显示推荐对象
    $.ajax({
        url:"/user/getSelf",
        type:"POST",
        dataType:"json",
        cache:false,
        contentType: 'application/json;charset=utf-8',
        async:false,
        data:JSON.stringify({"":""}),
        success:function(data){
            var result = data.result;
            if ("fail" == result){
               $("#slide4").hide();
            }

        }
    })

    // 请求推荐对象列表
    $.ajax({
        url:"/user/getUserList",
        type:"POST",
        dataType:"json",
        cache:false,
        contentType: 'application/json;charset=utf-8',
        async:false,
        data:"{}",
        success:function(data){
            // console.info(data);
            var list = data.list;
            var line = list.size;
            if(line>=8) {
                line = 8;
            }
            var i
            for(var item in list){
                $("#userdiv" + item).css("display","block");
                 console.info(list[item].username);
                $("#userdiv" + item+" .employeename").text(list[item].name);
                $("#userdiv" + item+" .department-line").text(list[item].department);
                $("#userdiv" + item+" .age-line").text(list[item].age);
                $("#userdiv" + item+" .caption").attr("href","/otheruserpage?username="+list[item].username)
            }
        }
    })
});
