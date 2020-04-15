package observer.java_support;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Observer implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Property " + evt.getPropertyName() +
            " has changed. Old value: " + evt.getOldValue() +
            " New value: " + evt.getNewValue());
    }
}
