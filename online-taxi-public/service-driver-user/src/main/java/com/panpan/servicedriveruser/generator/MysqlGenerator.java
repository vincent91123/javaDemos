package com.panpan.servicedriveruser.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 自动生成代码工具类
 */
public class MysqlGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/service-driver-user?characterEncoding=utf-8&serverTimezone=GMT%2B8",
                "root","root")
                .globalConfig(builder -> {
                    builder.author("panpan").fileOverride().outputDir("F:\\APPs\\WorkSpace\\java\\online-taxi-public\\service-driver-user\\src\\main\\java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.panpan.servicedriveruser").pathInfo(Collections.singletonMap(OutputFile.mapperXml,
                            "F:\\APPs\\WorkSpace\\java\\online-taxi-public\\service-driver-user\\src\\main\\java\\com\\panpan\\servicedriveruser\\mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("car");//("driver_user_work_status");

                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
