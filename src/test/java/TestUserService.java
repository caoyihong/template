import com.caoyihong.template.entity.UserInfo;
import com.caoyihong.template.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by caoyihong on 16-12-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestUserService {

    private static Logger logger = Logger.getLogger(TestUserService.class);
    @Resource
    private IUserService userService;

    @Test
    public void testInsertUser(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("曹操");
        userInfo.setPassword("123");
        userInfo.setTelephone("13128812643");
        userService.insertUser(userInfo);
    }
}
