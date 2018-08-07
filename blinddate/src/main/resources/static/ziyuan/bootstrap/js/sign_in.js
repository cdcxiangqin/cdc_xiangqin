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
            $.ajax({
                url:"/api/authenticate",
                type:"POST",
                dataType:"json",
                cache:false,
                contentType: 'application/json;charset=utf-8',
                async:false,
                data:JSON.stringify(authenticateCommand),
                success:function(data){
                    alert(JSON.stringify(data));
                    window.location.href="/success.html";
                    // window.open("/ziyuan/success.html");
                }
            })
        }
    });

});
