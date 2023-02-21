package untitled.domain;

import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class VideoStreamingProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private String fileKey;
}
