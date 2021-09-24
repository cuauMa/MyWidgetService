package com.myorg;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class MyWidgetServiceStack extends Stack {
    public MyWidgetServiceStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public MyWidgetServiceStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        new WidgetService(this, "Widgets");
    }
}
