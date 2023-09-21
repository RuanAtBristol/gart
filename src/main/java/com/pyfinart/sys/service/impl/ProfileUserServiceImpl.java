package com.pyfinart.sys.service.impl;

import com.pyfinart.sys.entity.ProfileUser;
import com.pyfinart.sys.mapper.ProfileUserMapper;
import com.pyfinart.sys.service.IProfileUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Levi
 * @since 2023-09-20
 */
@Service
public class ProfileUserServiceImpl extends ServiceImpl<ProfileUserMapper, ProfileUser> implements IProfileUserService {

}
