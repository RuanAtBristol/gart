package com.pyfinart.sys.service.impl;

import com.pyfinart.sys.entity.UserListing;
import com.pyfinart.sys.mapper.UserListingMapper;
import com.pyfinart.sys.service.IUserListingService;
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
public class UserListingServiceImpl extends ServiceImpl<UserListingMapper, UserListing> implements IUserListingService {

}
