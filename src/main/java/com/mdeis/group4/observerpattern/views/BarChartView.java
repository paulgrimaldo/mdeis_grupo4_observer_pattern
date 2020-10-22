package com.mdeis.group4.observerpattern.views;

import com.mdeis.group4.observerpattern.domain.Model;
import com.mdeis.group4.observerpattern.shared.Observer;

public class BarChartView implements Observer {

    public void display(Model model) {
        System.out.println();
        System.out.println("Bar Chart View 📊");
        System.out.println("|| MAX age: " + model.getMaxAge());
        System.out.println("|| MIN age: " + model.getMinAge());
    }

    @Override
    public void notifyChange(Model model) {
        this.display(model);
    }
}
