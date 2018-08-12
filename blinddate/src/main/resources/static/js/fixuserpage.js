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
            $("#name").val(user.name);
            $("#username").val(user.username);
            $("#department").val(user.department);
            $("#height").val(user.height);
            $("#weight").val(user.weight);
            $("#constellation").val(user.constellation);
            $("#zmobile").val(user.mobile);
            $("#address").val(user.address);
            $("#university").val(user.university);
            $("#zheight").val(user.height);
            $("#marrystate").val(user.marrystate);
            $("#zodiac").val(user.zodiac);
            $("#zdepartment").val(user.department);
            $("#birthday").val(new Date(parseInt(user.birthday)).toLocaleString().substr(0,10));
            $("#age").val(user.age);
            $("#employeeNumber").val(user.employeeNumber);
            $("#WeChat").val(user.weChat);
            $("#education").val(user.education);
            $("#housingConditions").val(user.housingConditions);
            $("#sex").val(user.sex);
            $("#folk").val(user.folk);
            $("#zconstellation").val(user.constellation);
            $("#child").val(user.child);
            $("#hobbySport").val(user.hobbySport);
            $("#hobbyMusic").val(user.hobbyMusic);
            $("#hobbyVideo").val(user.hobbyVideo);
            $("#hobbyFood").val(user.hobbyFood);
            $("#hobbyPlace").val(user.hobbyPlace);
            $("#hobbyIdol").val(user.hobbyIdol);
            $("#hobbyPet").val(user.hobbyPet);
            $("#lifeSmoke").val(user.lifeSmoke);
            $("#lifeCook").val(user.lifeCook);
            $("#lifeDrink").val(user.lifeDrink);
            $("#lifeHousework").val(user.lifeHousework);
            $("#lifeDeposit").val(user.lifeDeposit);
            $("#lifeCar").val(user.lifeCar);
            $("#lifeBusy").val(user.lifeBusy);
            $("#marriageZodiacTaboo").val(user.marriageZodiacTaboo);
            $("#marriageConstellationTaboo").val(user.marriageConstellationTaboo);
            $("#marriageMarryTime").val(user.marriageMarryTime);
            $("#marriageWantChild").val(user.marriageWantChild);
            $("#marriageDatingSite").val(user.marriageDatingSite);
            $("#marriageEmotionalExperience").val(user.marriageEmotionalExperience);
            $("#marriageFamilyStatus").val(user.marriageFamilyStatus);
            $("#marriageParentsCondition").val(user.marriageParentsCondition);
            $("#marriageParentalEconomicStatus").val(user.marriageParentalEconomicStatus);
            $("#marriageSiblings").val(user.marriageSiblings);

        }
    });

    console.info("zhunbei");

    $("#fixsave").click(function () {
        console.info("请求fixsave");
        var fixdata = {"name":$("#name").val(),
                "username":$("#username").val(),
                "department":$("#department").val(),
                "height":$("#height").val(),
                "weight":$("#weight").val(),
                "constellation":$("#constellation").val(),
                "mobile":$("#zmobile").val(),
                "address":$("#address").val(),
                "university":$("#university").val(),
                // "height":$("#zheight").val(),
                "marrystate":$("#marrystate").val(),
                "zodiac":$("#zodiac").val(),
                // "department":$("#zdepartment").val(),
                // "birthday":$("#birthday").val(),
                "age":$("#age").val(),
                "employeeNumber":$("#employeeNumber").val(),
                "weChat":$("#WeChat").val(),
                "education":$("#education").val(),
                "housingConditions":$("#housingConditions").val(),
                "sex":$("#sex").val(),
                "folk":$("#folk").val(),
                // "constellation":$("#zconstellation").val(),
                "child":$("#child").val(),
                "hobbySport":$("#hobbySport").val(),
                "hobbyMusic":$("#hobbyMusic").val(),
                "hobbyVideo":$("#hobbyVideo").val(),
                "hobbyFood":$("#hobbyFood").val(),
                "hobbyPlace":$("#hobbyPlace").val(),
                "hobbyIdol":$("#hobbyIdol").val(),
                "hobbyPet":$("#hobbyPet").val(),
                "lifeSmoke":$("#lifeSmoke").val(),
                "lifeCook":$("#lifeCook").val(),
                "lifeDrink":$("#lifeDrink").val(),
                "lifeHousework":$("#lifeHousework").val(),
                "lifeDeposit":$("#lifeDeposit").val(),
                "lifeCar":$("#lifeCar").val(),
                "lifeBusy":$("#lifeBusy").val(),
                "marriageZodiacTaboo":$("#marriageZodiacTaboo").val(),
                "marriageConstellationTaboo":$("#marriageConstellationTaboo").val(),
                "marriageMarryTime":$("#marriageMarryTime").val(),
                "marriageWantChild":$("#marriageWantChild").val(),
                "marriageDatingSite":$("#marriageDatingSite").val(),
                "marriageEmotionalExperience":$("#marriageEmotionalExperience").val(),
                "marriageFamilyStatus":$("#marriageFamilyStatus").val(),
                "marriageParentsCondition":$("#marriageParentsCondition").val(),
                "marriageParentalEconomicStatus":$("#marriageParentalEconomicStatus").val(),
                "marriageSiblings":$("#marriageSiblings").val(),
            };

                $.ajax({
                    url:"/user/modifyUser",
                    type:"POST",
                    dataType:"json",
                    cache:false,
                    contentType: 'application/json;charset=utf-8',
                    async:false,
                    data: JSON.stringify(fixdata),
                    success:function(data){
                        top.location.href = "/userpage";
                    }
            })
        });

});