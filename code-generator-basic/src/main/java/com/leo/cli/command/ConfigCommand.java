package com.leo.cli.command;

import com.leo.model.MainTemplateConfig;
import picocli.CommandLine.Command;
import cn.hutool.core.util.ReflectUtil;

import java.lang.reflect.Field;

@Command(name = "config", description = "check argument info", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable{
    public void run(){
        System.out.println("check argument info:");
        Field[] fields = ReflectUtil.getFields(MainTemplateConfig.class);

        // iterate through each field and print
        for (Field field: fields){
            System.out.println("literal name: " + field.getName());
            System.out.println("literal type: " + field.getType());
            System.out.println("----");
        }
    }
}
