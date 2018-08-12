$(document).ready(function () {
    $.ajax({
        url:"/user/getOtherUser",
        type:"POST",
        dataType:"json",
        cache:false,
        contentType: 'application/json;charset=utf-8',
        async:false,
        data:"{}",
        success:function(data){
            // alert(data);
            var user = data.user;
            $("#name").text(user.name);
            $("#username").text(user.username);
            $("#department").text(user.department);
            $("#height").text(user.height);
            $("#weight").text(user.weight);
            $("#constellation").text(user.constellation);
            $("#zmobile").text(user.mobile);
            $("#address").text(user.address);
            $("#university").text(user.university);
            $("#zheight").text(user.height);
            $("#marrystate").text(user.marrystate);
            $("#zodiac").text(user.zodiac);
            $("#zdepartment").text(user.department);
            $("#birthday").text(new Date(parseInt(user.birthday)).toLocaleString().substr(0,10));
            $("#age").text(user.age);
            $("#employeeNumber").text(user.employeeNumber);
            $("#WeChat").text(user.weChat);
            $("#education").text(user.education);
            $("#housingConditions").text(user.housingConditions);
            $("#sex").text(user.sex);
            $("#folk").text(user.folk);
            $("#zconstellation").text(user.constellation);
            $("#child").text(user.child);
            $("#hobbySport").text(user.hobbySport);
            $("#hobbyMusic").text(user.hobbyMusic);
            $("#hobbyVideo").text(user.hobbyVideo);
            $("#hobbyFood").text(user.hobbyFood);
            $("#hobbyPlace").text(user.hobbyPlace);
            $("#hobbyIdol").text(user.hobbyIdol);
            $("#hobbyPet").text(user.hobbyPet);
            $("#lifeSmoke").text(user.lifeSmoke);
            $("#lifeCook").text(user.lifeCook);
            $("#lifeDrink").text(user.lifeDrink);
            $("#lifeHousework").text(user.lifeHousework);
            $("#lifeDeposit").text(user.lifeDeposit);
            $("#lifeCar").text(user.lifeCar);
            $("#lifeBusy").text(user.lifeBusy);
            $("#marriageZodiacTaboo").text(user.marriageZodiacTaboo);
            $("#marriageConstellationTaboo").text(user.marriageConstellationTaboo);
            $("#marriageMarryTime").text(user.marriageMarryTime);
            $("#marriageWantChild").text(user.marriageWantChild);
            $("#marriageDatingSite").text(user.marriageDatingSite);
            $("#marriageEmotionalExperience").text(user.marriageEmotionalExperience);
            $("#marriageFamilyStatus").text(user.marriageFamilyStatus);
            $("#marriageParentsCondition").text(user.marriageParentsCondition);
            $("#marriageParentalEconomicStatus").text(user.marriageParentalEconomicStatus);
            $("#marriageSiblings").text(user.marriageSiblings);
            $("#headpic").attr("src", user.headAddress);

        }
    })


});