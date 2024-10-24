package com.panpan.mybatisplus.utils;

/**
 * @author panpan
 * @create 2024-10-24-上午 11:26
 */

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 代码生成器
 */
public class MyFastAutoGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/mybatis-plus?characterEncoding=utf-8&serverTimezone=GMT%2B8"
                        , "root", "root")
                .globalConfig(builder -> {
                    builder.author("panpan") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("F://APPs//WorkSpace//java//mybatisPlus//src//main//java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.panpan.mybatisplus") // 设置父包名
//                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "F://APPs//WorkSpace//java//mybatisPlus//target")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user"); // 设置需要生成的表名
                            //.addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}


