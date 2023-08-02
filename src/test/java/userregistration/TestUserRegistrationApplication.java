package userregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestUserRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.from(UserRegistrationApplication::main).with(TestUserRegistrationApplication.class).run(args);
	}

}
