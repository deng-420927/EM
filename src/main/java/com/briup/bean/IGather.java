package com.briup.bean;

import java.util.Collection;

/**
 * 
 * @ClassName:  IGather   
 * @Description:客户端采集模块
 * @author: DENG
 * @date:   2020年1月6日   
 *     
 * @Copyright: 2020 DENG All rights reserved.
 */
public interface IGather {
	
	Collection<BIDR> gather();
	
}
