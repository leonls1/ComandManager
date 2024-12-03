module proeject.commandmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jakarta.persistence;
    requires lombok;
    requires org.hibernate.orm.core;

    opens project.commandmanager to javafx.fxml;
    opens project.commandmanager.model.entities;
    opens project.commandmanager.model.persistence;
    opens project.commandmanager.controller;

    exports project.commandmanager;
}
