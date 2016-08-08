package com.lixiang.main;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;

/**
 * Created by lixiang on 2016/8/8.
 */
public class testJavaPoet {
    public static void main(String[] args) {
       // generateHelloWorld();
       // new HelloWorld().testMain();
    }



    public  void generateHelloWorld(){

        //方法
        MethodSpec mainMethod = MethodSpec.methodBuilder("testMain")
                .addModifiers(Modifier.PUBLIC)
                .addParameter(String[].class,"args")
                .addStatement("$T.out.println($S)",System.class,"Hello World")
                .build();

        //类名
        TypeSpec typeSpec = TypeSpec.classBuilder("HelloWorld")
                .addModifiers(Modifier.PUBLIC)
                .addMethod(mainMethod)
                .build();

        //包名，路径
        JavaFile javaFile = JavaFile.builder("com.lixiang.beans",typeSpec)
                .build();


        try {
            //生成文件
            File file = new File("BeanGenerator/src/main/java");
            javaFile.writeTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
