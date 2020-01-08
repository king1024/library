package com.king.library.config.mybatis;

import com.baomidou.mybatisplus.core.incrementer.IKeyGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @date: 2020/1/6 21:31
 * @author: duanyong
 * @desc:我的主键生成策略
 */
@Slf4j
@Component
public class KingKeyGenerator implements IKeyGenerator {

    @Override
    public String executeSql(String incrementerName) {
        String str=UUID.randomUUID().toString().replaceAll("-","");
        log.error(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  key="+str);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  key="+str);
        return "select '" + str + "' from dual";
    }
}
