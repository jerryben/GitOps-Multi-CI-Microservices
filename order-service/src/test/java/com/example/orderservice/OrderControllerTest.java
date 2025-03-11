package com.example.orderservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetOrders() throws Exception {
        mockMvc.perform(get("/orders"))
               .andExpect(status().isOk());
    }

    @Test
    public void testCreateOrder() throws Exception {
        mockMvc.perform(post("/orders")
                .contentType("application/json")
                .content("{\"productName\": \"Laptop\", \"quantity\": 1}"))
               .andExpect(status().isOk());
    }
}
