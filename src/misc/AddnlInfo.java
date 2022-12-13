package misc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddnlInfo {
    private int classVersionId = 1;
    private String category;
    private String subCategory;
    private String name;
    private String value;
    private String status;
}
