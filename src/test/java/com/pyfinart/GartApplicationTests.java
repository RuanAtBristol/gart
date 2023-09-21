package com.pyfinart;

import com.pyfinart.sys.entity.ProfileItem;
import com.pyfinart.sys.mapper.ProfileItemMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.util.List;

@SpringBootTest
class GartApplicationTests {

    @Resource
    private ProfileItemMapper profileItemMapper;

    @Test
    void contextLoads() {
        List<ProfileItem> profileItems = profileItemMapper.selectList(null);
        profileItems.forEach(System.out::println);
    }

}
