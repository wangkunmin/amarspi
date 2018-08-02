package com.xj.amarspi.service.impl;

import com.xj.amarspi.dao.BeCallerDao;
import com.xj.amarspi.service.BeCallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 /**
  * BeCallerServiceImpl 
  * @author wkm
  * @since 2018/8/2
  */
@Service(value = "beCallerService")
public class BeCallerServiceImpl implements BeCallerService {
     @Autowired
     private BeCallerDao beCallerDao;

}
