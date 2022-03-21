package io.github.thefrsh.dddcqrs.application.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines an application command handler
 *
 * @author Michal Broniewicz
 */
@Component
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface ApplicationCommandHandler {

}
