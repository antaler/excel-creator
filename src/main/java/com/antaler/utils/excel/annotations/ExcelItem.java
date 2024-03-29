package com.antaler.utils.excel.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ExcelItem {
    String name() default "";
    boolean blank() default false;
    String logo() default "";
    String classPathLogo() default "";
    String headerColor() default "";
    String dataColor() default "";
}
