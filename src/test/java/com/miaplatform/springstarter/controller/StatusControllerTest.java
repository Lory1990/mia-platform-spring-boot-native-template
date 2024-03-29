package com.miaplatform.springstarter.controller;

import com.miaplatform.springstarter.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = Application.class)
public class StatusControllerTest {
    @Autowired
    MockMvc mvc;

    @Test
    public void defaultReadinessRoute() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/-/ready"))
                .andExpect(status().isOk());
    }

    @Test
    public void defaultLivenessRoute() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/-/healthz"))
                .andExpect(status().isOk());
    }

    @Test
    public void defaultCheckUpRoute() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/-/check-up"))
                .andExpect(status().isOk());
    }
}
