package com.mdeis.group4.observerpattern.shared;

import com.mdeis.group4.observerpattern.domain.Model;

public interface Observer {
    void notifyChange(Model model);
}
