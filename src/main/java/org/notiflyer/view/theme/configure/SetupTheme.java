package org.notiflyer.view.theme.configure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class SetupTheme {

    private void loadStyleProperties() {
        // load properties file from resources folder
        



    }

    public static void setupTheme() {
        // Get the UIDefaults object
        UIDefaults defaults = UIManager.getDefaults();

        // Get the set of keys
        Set<Object> keys = defaults.keySet();

        // Convert the set to a list
        List<Object> keyList = new ArrayList<>(keys);

        // Sort the list
        Collections.sort(keyList, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        // Print all the keys
        for (Object key : keyList) {
            System.out.println(key);
        }
    }
    
}
