import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * One-element annotation
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Testik {
    Class value();
}
