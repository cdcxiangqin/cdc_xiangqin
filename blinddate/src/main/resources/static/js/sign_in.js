$(document).ready(function() {
    $("#verifyButton").click(function () {
        //删除空格
        var username = $.trim($("input[name='username']").val());
        var password = $.trim($("input[name='password']").val());
        // alert(username);
        var authenticateCommand = {
            "username":$("input[name='username']").val(),
            "password":$("input[name='password']").val()
        };
        console.info(authenticateCommand);
        if (username=="" || password=="") {
            alert("用户名或密码不能为空");
        } else {
            // alert("提交数据");
            $.ajax({
                url:"/user/login",
                type:"POST",
                dataType:"json",
                cache:false,
                contentType: 'application/json;charset=utf-8',
                async:false,
                data:JSON.stringify(authenticateCommand),
                success:function(data){
                    // alert(JSON.stringify(data));
                    // alert("dsadasdsadsad");
                    // // window.open("http://www.baidu.com");
                    // // $(window).attr("location","/index");
                    top.location.href = "/index";

                }
            })
        }
    });

});
