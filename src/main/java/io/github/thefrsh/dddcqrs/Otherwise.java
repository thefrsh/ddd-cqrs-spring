package io.github.thefrsh.dddcqrs;

/**
 * Functional object that takes an action when the condition is false
 *
 * @author Michal Broniewicz
 */
public class Otherwise {

    private final boolean condition;

    public Otherwise(boolean condition) {

        this.condition = condition;
    }

    public void otherwise(Runnable action) {

        if(!condition) {
            action.run();
        }
    }
}
