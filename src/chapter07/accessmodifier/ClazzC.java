package chapter07.accessmodifier;

import chapter07.lecture.ClazzA;

public class ClazzC extends ClazzA {
    public ClazzC () {
        super();
        this.field = "value";
        this.method();
    }
}