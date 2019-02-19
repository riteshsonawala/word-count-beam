package org.apache.beam.examples;

import com.google.common.base.Preconditions;

public class DemoClass {

    public static void main(String[] args) {
        Preconditions.checkArgument(args.length>0);
    }
}
