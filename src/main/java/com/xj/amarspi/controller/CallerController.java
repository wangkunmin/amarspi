package com.xj.amarspi.controller;

import com.xj.amarspi.service.CallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * CallerController 调用外部接口
  * @author wkm
  * @since 2018/8/2
  */
@RestController
@RequestMapping(value = "/caller")
public class CallerController {
    @Autowired
    private CallerService callerService;
}
