package io.github.thefrsh.dddcqrs.domain.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a domain rule
 *
 * @see io.github.thefrsh.dddcqrs.domain.Rule
 * @author Michal Broniewicz
 */
@Component
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface DomainRule {

}
