package com.kren.pattern.adapter.palyer.ttttttttttttttttttt;

import java.util.function.Supplier;

public abstract class UriBuilder {
    public static UriBuilder getBuilder(UriType typeByulder) {
        return typeByulder.getBuilder();
    }

    abstract public String build();

    // setters wich thow UnsupportedOperationException
    // ...

    public static enum UriType {
        GET_COUNT_URI(() -> new CountUriBuilder()),

        ALL_URI(() -> new AllUriBuilder());

        private Supplier<UriBuilder> supplier;

        private UriType(Supplier<UriBuilder> supplier) {
            this.supplier = supplier;
        }

        UriBuilder getBuilder(){
            return supplier.get();
        }
    }
}


class CountUriBuilder extends UriBuilder {

}


class AllUriBuilder extends UriBuilder {

}
