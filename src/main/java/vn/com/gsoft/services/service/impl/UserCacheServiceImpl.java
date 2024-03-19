package vn.com.gsoft.services.service.impl;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;
import vn.com.gsoft.services.constant.CachingConstant;
import vn.com.gsoft.services.service.UserCacheService;

@Service
@EnableCaching
public class UserCacheServiceImpl implements UserCacheService {
    @Override
    @CacheEvict(value = CachingConstant.USER)
    public void clearCacheByUsername(String username) {
    }
}
