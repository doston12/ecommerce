package sample.inteface;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import sample.controller.CreateProductTypeController;

public interface DispatcherController<T> {

    void setStage(Stage stage);

    void setData(ObservableList<T> list, T dto, int index);

    void setFilterField(JFXTextField filterField);

    void setMainBtns(JFXButton export,JFXButton deleteBtn,JFXButton brief_btn);
}
