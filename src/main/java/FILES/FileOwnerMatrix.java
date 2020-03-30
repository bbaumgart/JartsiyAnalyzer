package FILES;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileOwnerMatrix {

    private String Location;
    private String DeltaGroup;
    private String Warranty;
    private String POC;

}
