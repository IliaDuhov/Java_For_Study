import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * One-element annotation
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Testik {
    Class value();
    /*
    int, double, other primitive types
    String 
    Class
    Annotations
    Arrays (of everything mentioned)
    */
}
