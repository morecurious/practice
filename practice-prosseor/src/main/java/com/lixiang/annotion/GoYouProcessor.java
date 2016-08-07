package com.lixiang.annotion;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/**
 * Created by lixiang on 2016/8/6.
 */

public class GoYouProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for(Element annotatedElement :roundEnv.getElementsAnnotatedWith(GoYou.class)){

            GoYou goYou  = annotatedElement.getAnnotation(GoYou.class);
            String message = "annotation found in " + annotatedElement.getSimpleName();
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message);
            System.out.println("aaaaaaaa");
          /*  ExecutableElement m =(ExecutableElement) annotatedElement;
            TypeElement className = (TypeElement)m.getEnclosingElement();
            System.out.println(className);*/
        }

        return true;
    }
}
