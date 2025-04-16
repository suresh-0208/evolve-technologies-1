package com.evolve.tech.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class HomeControllerTest {

    private final MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();

    @Test
    public void testAboutUs() throws Exception {
        mockMvc.perform(get("/about-us"))
                .andExpect(status().isOk());
    }

    @Test
    public void testCourses() throws Exception {
        mockMvc.perform(get("/courses"))
                .andExpect(status().isOk());
    }

    @Test
    public void testRegister() throws Exception {
        mockMvc.perform(get("/register"))
                .andExpect(status().isOk());
    }
}
