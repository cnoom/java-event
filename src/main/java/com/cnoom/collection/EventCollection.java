package com.cnoom.collection;


import com.cnoom.base.Event;
import com.cnoom.collection.node.EventNode;

public class EventCollection extends BaseEventCollection<EventNode> implements Event {

    @Override
    public void invoke() {
        for (EventNode node : getInvokeCollection()) {
            node.invoke();
        }
    }
}
