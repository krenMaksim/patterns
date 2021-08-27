package com.kren.pattern.factory.method.generic.shape;

class Triangle extends Shape {

    private final double height;
    private final double weight;

    private Triangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double square() {
        return 0.5 * height * weight;
    }

    public static class Builder implements ShapeBuilder {

        private double height;
        private double weight;

        Builder() {}

        @Override
        public Shape build() {
            return new Triangle(this.height, this.weight);
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }
    }
}
