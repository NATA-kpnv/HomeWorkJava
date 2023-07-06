package controlTest2.api;

import java.time.LocalDateTime;

@FunctionalInterface
public  interface OrderStage<T, U> {
    String execute(T t, U u);

}
