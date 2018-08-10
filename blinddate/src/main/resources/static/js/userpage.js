$(document).ready(function () {
    $.ajax({
        url:"/user/getSelf",
        type:"POST",
        dataType:"json",
        cache:false,
        contentType: 'application/json;charset=utf-8',
        async:false,
        data:"{}",
        success:function(data){
            // alert(data);
            var user = data.user;
            $("#id").innerHTML(user.id);
            $("#username").innerHTML(user.username);
            $("#password").innerHTML(user.password);
            $("#name").innerHTML(user.name);
            $("#sex").innerHTML(user.sex);
            $("#mobile").innerHTML(user.mobile);
            $("#birthday").innerHTML(user.birthday);
            $("#folk").innerHTML(user.folk);
            $("#height").innerHTML(user.height);
            $("#weight").innerHTML(user.weight);
            $("#education").innerHTML(user.education);
            $("#university").innerHTML(user.university);
            $("#housingConditions").innerHTML(user.housingConditions);
            $("#child").innerHTML(user.child);
            $("#department").innerHTML(user.department);
            $("#originalProvince").innerHTML(user.originalProvince);
            $("#originalCity").innerHTML(user.originalCity);
            $("#currentProvince").innerHTML(user.currentProvince);
            $("#currentCity").innerHTML(user.currentCity);
            $("#hobby").innerHTML(user.hobby);
            $("#lifeAttitude").innerHTML(user.lifeAttitude);
            $("#headAddress").innerHTML(user.headAddress);
            $("#createTime").innerHTML(user.createTime);
            $("#lastLoginTime").innerHTML(user.lastLoginTime);
            $("#status").innerHTML(user.status);

        }
    })


});