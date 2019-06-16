package Homework6;

public @interface NewAnnotation {
    String name() default "User";
    String position() default "Developer";
    String organization() default "NULL";
}
