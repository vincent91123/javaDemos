package com.panpan.servicedriveruser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.panpan.internalcommon.dto.DriverUser;
import com.panpan.internalcommon.dto.ResponseResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverUserMapper extends BaseMapper<DriverUser> {


//    public int selectDriverUserCountByCityCode(@Param("cityCode") String cityCode);

}