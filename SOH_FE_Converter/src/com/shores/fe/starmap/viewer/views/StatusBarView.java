
package com.shores.fe.starmap.viewer.views;

import com.shores.fe.starmap.viewer.interfaces.IView;
import com.shores.fe.starmap.viewer.utils.DialogUtils;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import static javafx.geometry.Orientation.VERTICAL;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Separator;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;
import org.controlsfx.control.StatusBar;
import org.controlsfx.glyphfont.FontAwesome;
import org.controlsfx.glyphfont.FontAwesome.Glyph;


public class StatusBarView implements IView{
    private StatusBar statusBar;
    private int itemCounter;
    private ProgressIndicator progressIndicator;
    private static StatusBarView instance = null;
    
    FontAwesome fontAwesome = new FontAwesome();

    private StatusBarView() {
        statusBar = new StatusBar();
        progressIndicator = new ProgressIndicator();
        
        statusBar.progressProperty().bindBidirectional(progressIndicator.progressProperty());
        
        //TODO : popover task
        Button buttonTasks = new Button();
        buttonTasks.setGraphic(fontAwesome.create(Glyph.TASKS).size(16).color(Color.DARKBLUE));
        buttonTasks.setTooltip(new Tooltip("View tasks history"));
        buttonTasks.setOnAction(onTaskButtonAction());
        statusBar.getRightItems().addAll(new Separator(VERTICAL), progressIndicator, buttonTasks);
    }

    public static StatusBarView getInstance() {
            if (instance == null) {
                    instance = new StatusBarView();
            }
            return instance;
    }

    @Override
    public Node getViewElement() {
        return statusBar;
    }
    
    public void setState(String text, Double value){
        statusBar.setText(text);
        statusBar.setProgress(value);
    }

    private void addItem(boolean left) {
        itemCounter++;
        Button button = new Button(Integer.toString(itemCounter));
        //button.setBackground(new Background(new BackgroundFill(Color.ORANGE,new CornerRadii(2), new Insets(4))));
        if (left) {
            statusBar.getLeftItems().add(button);
        } else {
            statusBar.getRightItems().add(button);
        }
    }

    private void addSeparator(boolean left) {
        if (left) {
            statusBar.getLeftItems().add(new Separator(VERTICAL));
        } else {
            statusBar.getRightItems().add(new Separator(VERTICAL));
        }
    }

    private void startTask() {
        Task<Void> task = new Task<Void>() {
            @Override protected Void call() throws Exception {
                updateMessage("First we sleep ....");

                Thread.sleep(2500);

                int max = 100000000;
                for (int i = 0; i < max; i++) {
                    updateMessage("Message " + i);
                    updateProgress(i, max);
                }

                updateProgress(0, 0);
                done();
                return null;
            }
        };
        
        statusBar.textProperty().bind(task.messageProperty());
        statusBar.progressProperty().bind(task.progressProperty());
        
        // remove bindings again
        task.setOnSucceeded(event -> {
            statusBar.textProperty().unbind();    
            statusBar.progressProperty().unbind();
        });

        new Thread(task).start();
    }

    private EventHandler<ActionEvent> onTaskButtonAction() {
        return new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                DialogUtils.notImplementedYetDialog();
            }
        };
    }

    @Override
    public void initUIComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUpComponentsLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEventHandler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
