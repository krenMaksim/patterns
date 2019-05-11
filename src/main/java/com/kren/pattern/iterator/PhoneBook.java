package com.kren.pattern.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class PhoneBook implements Iterable<String> {

    private List<String> phoneNumbers = Stream.of("111-111-111", "222-222-222", "333-333-333")
                                              .collect(Collectors.toList());

    @Override
    public Iterator<String> iterator() {
        return new PhoneBookItereator();
    }

    private class PhoneBookItereator implements Iterator<String> {
        private int currentNumberIndex;

        @Override
        public boolean hasNext() {
            return currentNumberIndex < phoneNumbers.size() ? true : false;
        }

        @Override
        public String next() {
            return phoneNumbers.get(currentNumberIndex++);
        }

    }
}