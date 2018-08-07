package com.cdc.blinddate.interfaces.resume;

import com.cdc.blinddate.interfaces.ApiPaths;
import com.cdc.blinddate.interfaces.user.facede.dto.TokenDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Program: blinddate
 * @Description: 用户资料接口
 * @Author: Mr.Hogan
 * @Create: 2018-08-06 15:28
 **/

@RestController
@RequestMapping(path = ApiPaths.API_CONTEXT_PATH)
public class RecumeResource {


//    @ApiOperation(value = "资料显示", notes = "", response = TokenDTO.class, httpMethod = "POST")
//    @RequestMapping(value = "/resume", method = POST, produces = APPLICATION_JSON_VALUE)
//    public

    @ApiOperation(value = "资料显示", notes = "", response = TokenDTO.class, httpMethod = "POST")
    @RequestMapping(value = "/hello", method = GET, produces = APPLICATION_JSON_VALUE)
    public String tiaoZhuan() {
        return "/success";
    }

}
