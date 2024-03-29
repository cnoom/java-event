package com.cnoom.collection;


import com.cnoom.base.Event1Arg;
import com.cnoom.collection.node.EventNode1Arg;

public class EventCollection1Arg<T> extends BaseEventCollection<EventNode1Arg<T>> implements Event1Arg<T> {

    @Override
    public void invoke(T t) {
        for (EventNode1Arg<T> tEventNode1Arg : getInvokeCollection()) {
            tEventNode1Arg.invoke(t);
        }
    }
}
