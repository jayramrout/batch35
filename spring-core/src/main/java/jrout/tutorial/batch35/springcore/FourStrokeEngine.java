package jrout.tutorial.batch35.springcore;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component("4se")
@Data
public class FourStrokeEngine implements IEngine {

    private String type = "Four Stroke Engine";

    @Override
    public String getEngineType() {
        return type;
    }
}
