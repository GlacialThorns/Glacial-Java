package org.deziras.function;

import org.deziras.Tuple4;

/**
 * Represents a function with 4 arguments.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 * @param <T3> argument 3 of the function
 * @param <T4> argument 4 of the function
 * @param <R>  return base of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function4<T1, T2, T3, T4, R>
        extends CheckedFunction4<T1, T2, T3, T4, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t1 function argument 1
     * @param t2 function argument 2
     * @param t3 function argument 3
     * @param t4 function argument 4
     *
     * @return the function result
     */
    R invoke(T1 t1, T2 t2, T3 t3, T4 t4);

    /**
     * Creates a tupled version of this function: instead of 4 arguments,
     * it accepts a single {@link org.deziras.Tuple4} argument.
     */
    default Function1<Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4>, R> tupled() {
        return t -> invoke(t.$1, t.$2, t.$3, t.$4);
    }
}
