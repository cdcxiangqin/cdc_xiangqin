package com.cdc.blinddate.interfaces.resume.facade;

import com.cdc.blinddate.interfaces.resume.command.ResumeCommand;
import com.cdc.blinddate.interfaces.resume.facade.dto.BaseResumenDto;

/**
 * @Program: blinddate
 * @Description: 前端需要的方法
 * @Author: Mr.Hogan
 * @Create: 2018-08-06 15:30
 **/
public interface ResumeServiceFaced {

    BaseResumenDto showPersonalResumen(ResumeCommand resumeCommand);
}
