package vn.com.gsoft.services.model.system;

import lombok.Data;


@Data
public class Settings {
    private Long id;
    private String key;
    private String value;
    private Boolean active;
    private String maNhaThuoc;
    private Long storeId;
}

