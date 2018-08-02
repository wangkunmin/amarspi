package com.xj.amarspi.controller;

import com.xj.amarspi.service.BeCallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * BeCallerController 提供调用给外部接口
  * @author wkm
  * @since 2018/8/2
  */
@RestController
@RequestMapping(value = "/beCaller")
public class BeCallerController {
    @Autowired
    private BeCallerService beCallerService;
}
