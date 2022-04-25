package com.example.one.services;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTest {
	
	UserService userService;
	@BeforeEach
    void setUp() throws Exception {
		userService = new UserService();
    }

    @Test
    void userscountTest() {
      Assertions.assertEquals(3, UserService.getAllUsers().size());
    }

}
