package com.StrategicDesignPattern.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ControllerTest.class)
public class ControllerTest {

    Logger logger= LogManager.getLogger(ControllerTest.class);
    @Autowired
    private MockMvc mockMvc;
    private  Controller controller=new Controller();
    @BeforeEach
    void setup()
    {
       mockMvc= MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void  getDayTest() throws Exception {
     MvcResult mvcResult= mockMvc.perform(
              MockMvcRequestBuilders.get("/day/3")
      ).andExpect(status().isOk()).andReturn();
     logger.info(mvcResult.getResponse().getContentAsString());
    }
}
