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
            $("#name").innerHTML(user.name);
            $("#username").innerHTML(user.username);
            $("#department").innerHTML(user.department);
            $("#height").innerHTML(user.height);
            $("#weight").innerHTML(user.weight);
            $("#constellation").innerHTML(user.constellation);
            $("#zmobile").innerHTML(user.mobile);
            $("#address").innerHTML(user.address);
            $("#university").innerHTML(user.university);
            $("#zheight").innerHTML(user.height);
            $("#marrystate").innerHTML(user.marrystate);
            $("#zodiac").innerHTML(user.zodiac);
            $("#zdepartment").innerHTML(user.department);
            $("#birthday").innerHTML(user.birthday);
            $("#age").innerHTML(user.age);
            $("#number").innerHTML(user.number);
            $("#QQ").innerHTML(user.QQ);
            $("#education").innerHTML(user.education);
            $("#housingConditions").innerHTML(user.housingConditions);
            $("#sex").innerHTML(user.sex);
            $("#folk").innerHTML(user.folk);
            $("#zconstellation").innerHTML(user.constellation);
            $("#child").innerHTML(user.child);
            $("#hobbySport").innerHTML(user.hobbySport);
            $("#hobbyMusic").innerHTML(user.hobbyMusic);
            $("#hobbyVideo").innerHTML(user.hobbyVideo);
            $("#hobbyFood").innerHTML(user.hobbyFood);
            $("#hobbyPlace").innerHTML(user.hobbyPlace);
            $("#hobbyIdol").innerHTML(user.hobbyIdol);
            $("#hobbyPet").innerHTML(user.hobbyPet);
            $("#lifeSmoke").innerHTML(user.lifeSmoke);
            $("#lifeCook").innerHTML(user.lifeCook);
            $("#lifeDrink").innerHTML(user.lifeDrink);
            $("#lifeHousework").innerHTML(user.lifeHousework);
            $("#lifeDeposit").innerHTML(user.lifeDeposit);
            $("#lifeCar").innerHTML(user.lifeCar);
            $("#lifeBusy").innerHTML(user.lifeBusy);
            $("#marriageZodiacTaboo").innerHTML(user.marriageZodiacTaboo);
            $("#marriageConstellationTaboo").innerHTML(user.marriageConstellationTaboo);
            $("#marriageMarryTime").innerHTML(user.marriageMarryTime);
            $("#marriageWantChild").innerHTML(user.marriageWantChild);
            $("#marriageDatingSite").innerHTML(user.marriageDatingSite);
            $("#marriageEmotionalExperience").innerHTML(user.marriageEmotionalExperience);
            $("#marriageFamilyStatus").innerHTML(user.marriageFamilyStatus);
            $("#marriageParentsCondition").innerHTML(user.marriageParentsCondition);
            $("#marriageParentalEconomicStatus").innerHTML(user.marriageParentalEconomicStatus);
            $("#marriageSiblings").innerHTML(user.marriageSiblings);

        }
    })


});