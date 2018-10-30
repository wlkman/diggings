package cuixb.test.springboot.api.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RequestBean implements Serializable {
    private static final long serialVersionUID;

    static {
        serialVersionUID = -7978440699884679173L;
    }

    private String name;
    private String age;
    private List<Bank> bankList;
}