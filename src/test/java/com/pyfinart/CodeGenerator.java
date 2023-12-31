package com.pyfinart;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class CodeGenerator {

    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/g_art?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&characterEncoding=utf-8";
        String username = "root";
        String password = "12345678";
        String moduleName = "sys";
        String mapperPath = "/Users/yhj19/developer/MY_Java/gart/gart/src/main/resources/mapper/"+moduleName;
        String tableNames = "tb_profile_item,tb_profile_user,tb_user_actions,tb_user_collection,tb_user_listing";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("Levi") // 设置作者
                            // .enableSwagger() // 开启 swagger 模式
                            // .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/yhj19/developer/MY_Java/gart/gart/src/main/java"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("com.pyfinart") // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tableNames) // 设置需要生成的表名
                            .addTablePrefix("tb_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
