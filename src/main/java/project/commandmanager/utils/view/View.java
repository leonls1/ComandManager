package project.commandmanager.utils.view;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class View {
    private ViewType viewType;
    private double width;
    private double height;
}
