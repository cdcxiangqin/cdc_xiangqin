$(document).ready(function() {
    $("#verifyButton").click(function () {
        var username = $("input[name='username']").val();
        var password = $("input[name='password']").val();
        // alert(username);
        var authenticateCommand = {
            "username":$("input[name='username']").val(),
            "password":$("input[name='password']").val()
        };
        console.info(authenticateCommand);
        if (username=="" || password=="") {
            alert("用户名或密码不能为空");
        } else {
            alert("gyutyutui");
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
                    window.location.href="/templates/html/success.html";
                    // window.open("/templates/success.html");
                }
            })
        }
    });

});
