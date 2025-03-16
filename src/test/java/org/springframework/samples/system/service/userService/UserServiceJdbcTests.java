package org.springframework.samples.system.service.userService;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"jdbc", "hsqldb"})
class UserServiceJdbcTests extends AbstractUserServiceTests {

}
