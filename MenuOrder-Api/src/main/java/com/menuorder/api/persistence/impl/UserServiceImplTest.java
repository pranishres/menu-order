package com.menuorder.api.persistence.impl;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.menuorder.api.persistence.entity.User;

public class UserServiceImplTest {

	UserServiceImpl userServiceImpl;
	User user;
	
	// Will be executed before any test and only once for one test case
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	// Runs before method execution
	@Before
	public void setUp() throws Exception {
		userServiceImpl = new UserServiceImpl();
		user = new User();
	}
	
	// Runs after method execution
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSaveOrUpdate() {
		user.setFirstName("PRanish");
		user.setLastName("Shrestha");
		user.setMiddleName("Maan");
		user.setUsername("pranish");
		user.setPassword("asdf");

		userServiceImpl.saveOrUpdate(user);
		
		System.out.println( "Username  : " + user);
		
	}
	
	@Test
	public void testFindById(){
	}
	

}
