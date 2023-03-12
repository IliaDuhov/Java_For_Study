import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * One-element annotation
 */
@Retention(RetentionPolicy.RUNTIME)
/*
@Target()
ElementType.ANNOTATION_TYPE: применяется для определения другой аннотации
ElementType.CONSTRUCTOR: применяется для определения конструктора
ElementType.FIELD: применяется для определения поля, включая константы Enum
ElementType.LOCAL_VARIABLE: применяется для определения локальной переменной
ElementType.METHOD: применяется для определения метода
ElementType.MODULE: применяется для определения модуля (с Java 9)
ElementType.PACKAGE: применяется для определения пакета
ElementType.PARAMETER: применяется для определения параметра
ElementType.TYPE: применяется для определения класса, интерфейса (включая аннотируемый тип), Enum или record.
ElementType.TYPE_PARAMETER: применяется для определения типа параметра (с Java 8)
ElementType.TYPE_USE: применяется для определения используемого типа (с Java 8)
ElementType.RECORD_COMPONENT: ассоциируется с records как компонент записи (с Java 14)
*/
public @interface Testik {
    Class value();
    /*
    Properties could be:
    int, double, other primitive types
    String 
    Class
    Annotations
    Arrays (of everything mentioned)
    */
}
