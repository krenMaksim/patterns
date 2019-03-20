package com.kren.pattern.nullobject.custumer;

class CustomerNullObject extends Customer {

    CustomerNullObject() {}

    @Override
    public int getId() {
        return -1;
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return "NoName";
    }

    @Override
    public void setName(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "CustomerNullObject [id=" + getName() + ", name=" + getId() + "]";
    }
}
