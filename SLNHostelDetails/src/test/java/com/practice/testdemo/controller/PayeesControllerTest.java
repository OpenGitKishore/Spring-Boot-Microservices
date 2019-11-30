package com.practice.testdemo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@SpringBootTest
//@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class PayeesControllerTest {

    @InjectMocks
    private PayeesController payeesController;

    @Test
    public void testGetPayeesListSuccess() {

        payeesController.getBillerList();
        System.out.println("Test case passed");

    }
}
