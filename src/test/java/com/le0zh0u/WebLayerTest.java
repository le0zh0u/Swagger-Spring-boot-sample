package com.le0zh0u;

import com.le0zh0u.controller.UserController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by zhouchunjie on 2017/11/16.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class WebLayerTest {

    @Autowired private MockMvc mockMvc;

    public void shouldReturnDefaultMessage() throws Exception {
    }
}
