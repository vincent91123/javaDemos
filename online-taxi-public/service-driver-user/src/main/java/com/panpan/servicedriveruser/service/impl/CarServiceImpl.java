package com.panpan.servicedriveruser.service.impl;

import com.panpan.internalcommon.dto.Car;
import com.panpan.servicedriveruser.mapper.CarMapper;
import com.panpan.servicedriveruser.service.ICarService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author panpan
 * @since 2024-10-18
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements ICarService {

}
