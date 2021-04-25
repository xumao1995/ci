package com.spdb.ci.mapper;


import com.spdb.ci.bean.dto.RegionDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RegionMapperTest {
    @Resource
    private RegionMapper mapper;

    @Test
    public void test(){
        List<RegionDto> bos = mapper.findAll();
        System.out.println(bos);
    }


}