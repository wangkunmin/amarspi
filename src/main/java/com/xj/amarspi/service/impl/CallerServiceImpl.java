package com.xj.amarspi.service.impl;

import com.xj.amarspi.dao.CallerDao;
import com.xj.amarspi.service.CallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
  * CallerServiceImpl 
  * @author wkm
  * @since 2018/8/2
  */
@Service(value = "callerService")
public class CallerServiceImpl implements CallerService {
     @Autowired
     private CallerDao callerDao;

}
