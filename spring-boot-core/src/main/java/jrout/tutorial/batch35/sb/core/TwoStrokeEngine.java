package jrout.tutorial.batch35.sb.core;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TwoStrokeEngine implements IEngine {

    private String type = "Two Stroke Engine";

    @Override
    public String getEngineType() {
        return type;
    }
}
