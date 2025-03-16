package org.springframework.samples.system.service.userService;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"jpa", "hsqldb"})
class UserServiceJpaTests extends AbstractUserServiceTests {

}
