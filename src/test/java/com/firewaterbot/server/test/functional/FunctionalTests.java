package com.firewaterbot.server.test.functional;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class FunctionalTests extends AbstractTestNGSpringContextTests {

}