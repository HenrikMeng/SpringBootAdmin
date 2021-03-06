package com.fortran.admin.modules.sys.dao;

import com.fortran.admin.modules.core.common.CrudDao;
import com.fortran.admin.modules.core.config.mybatis.annotation.MybatisDao;
import com.fortran.admin.modules.sys.domain.Log;

/**
 * @author: lin
 * @Date: 2016-08-04 Time: 9:48
 * @description:
 */
@MybatisDao
public interface LogDao extends CrudDao<Log> {


}
