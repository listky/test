package com.tank.test.update;

import com.tank.test.entity.MyFile;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class UpdateController {
    @RequestMapping("/go")
    public String test(){

        return "hhh";
    }

    @RequestMapping("/file")
    public MyFile file(){
        MyFile file = new MyFile();
        file.setFileName("AutoJS");
        file.setFilePath("/classpath/files");
        file.setFileVersion("1");
        return file;
    }
}
