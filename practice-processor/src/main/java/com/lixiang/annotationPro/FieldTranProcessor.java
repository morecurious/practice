package com.lixiang.annotationPro;

import com.google.auto.service.AutoService;
import com.lixiang.annotation.FieldTran;
import com.lixiang.annotation.GoYou;
import com.lixiang.main.testJavaPoet;
import com.sun.tools.internal.ws.processor.model.AbstractType;
import com.sun.tools.internal.ws.processor.modeler.wsdl.WSDLModelerBase;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by lixiang on 08/11/2016.
 */
@AutoService(Processor.class)
public class FieldTranProcessor extends AbstractProcessor{
    private Types typeUtils;
    private Elements elementUtils;
    private Filer filer;
    private Messager messager;


    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        typeUtils = processingEnv.getTypeUtils();
        elementUtils = processingEnv.getElementUtils();
        filer = processingEnv.getFiler();
        messager = processingEnv.getMessager();
    }

    @Override public Set<String> getSupportedAnnotationTypes() {
        Set<String> annotataions = new LinkedHashSet<String>();
        annotataions.add(FieldTran.class.getCanonicalName());
        return annotataions;
    }
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        for(Element annotatedElement :roundEnv.getElementsAnnotatedWith(FieldTran.class)){

            if(annotatedElement.getKind()== ElementKind.CLASS){
                TypeElement classElement = (TypeElement) annotatedElement;
                processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE,"annotation claa :"+
                classElement.getQualifiedName());

            }
            System.out.println("------FieldTran----------");
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
