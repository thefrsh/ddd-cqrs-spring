package io.github.thefrsh.dddcqrs;

import java.util.function.Consumer;

/**
 * Functional object that takes an action when the condition is true
 *
 * @param   <T> the type of operand on which the action is to be performed
 * @author  Michal Broniewicz
 */
public class Then<T> {

    private final T operand;
    private final boolean condition;

    public Then(T operand, boolean condition) {

        this.operand = operand;
        this.condition = condition;
    }

    public Otherwise then(Consumer<T> consumer) {

        if(condition) {
            consumer.accept(operand);
        }
        return new Otherwise(condition);
    }
}
