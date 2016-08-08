package com.lixiang.annotationPro;

import com.google.auto.service.AutoService;
import com.lixiang.annotation.GoYou;
import com.lixiang.main.testJavaPoet;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;


/**
 * Created by lixiang on 2016/8/6.
 */
@SupportedAnnotationTypes("com.lixiang.annotation.GoYou")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class GoYouProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for(Element annotatedElement :roundEnv.getElementsAnnotatedWith(GoYou.class)){

            if(annotatedElement.getKind()== ElementKind.CLASS){
                TypeElement classElement = (TypeElement) annotatedElement;
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"annotation claa :"+
                classElement.getQualifiedName());

            }
            new testJavaPoet().generateHelloWorld();
           /* com.lixiang.annotation.GoYou goYou  = annotatedElement.getAnnotation(com.lixiang.annotation.GoYou.class);
            String message = "annotation found in " + annotatedElement.getSimpleName();
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message);
            System.out.println("aaaaaaaa");*/
          /*  ExecutableElement m =(ExecutableElement) annotatedElement;
            TypeElement className = (TypeElement)m.getEnclosingElement();
            System.out.println(className);*/
        }

        return true;
    }
}
