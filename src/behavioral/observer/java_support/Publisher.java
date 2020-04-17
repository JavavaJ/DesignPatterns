package behavioral.observer.java_support;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Publisher {

    private String myValue;

    PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void registerObserver(PropertyChangeListener observer) {
        propertyChangeSupport.addPropertyChangeListener(observer);
    }

    public void setValue(String newValue) {
        String oldValue = this.myValue;
        this.myValue = newValue;
        propertyChangeSupport.firePropertyChange("myValue", oldValue, newValue);
    }
}
