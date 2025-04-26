package com.gevernova.javaeight.functionalinterface.numberimplementation;

@FunctionalInterface
interface TriFunction<numOne, numTwo, numThree, R> {
    R apply(numOne a, numTwo b, numThree c);
}
