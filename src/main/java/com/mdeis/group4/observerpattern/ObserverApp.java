package com.mdeis.group4.observerpattern;

import com.mdeis.group4.observerpattern.domain.Model;
import com.mdeis.group4.observerpattern.shared.Observer;
import com.mdeis.group4.observerpattern.views.BarChartView;
import com.mdeis.group4.observerpattern.views.PieChartView;
import com.mdeis.group4.observerpattern.views.TableView;

public class ObserverApp {

    public static void main(String[] args) {
        Model model = new Model(50, 10);
        Observer tableView = new TableView();
        Observer barChartView = new BarChartView();
        Observer pieChartView = new PieChartView();

        model.attach(tableView);
        model.attach(barChartView);
        model.attach(pieChartView);

        model.setMaxAge(100);
        model.setMinAge(10);
    }
}
