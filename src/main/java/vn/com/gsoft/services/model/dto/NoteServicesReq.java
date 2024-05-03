package vn.com.gsoft.services.model.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.gsoft.services.entity.BaseEntity;
import vn.com.gsoft.services.model.system.BaseRequest;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class NoteServicesReq extends BaseRequest {
    private Long noteNumber;
    private String clinicalExamination;
    private String object;
    private Date noteDate;
    private Integer idCus;
    private String storeCode;
    private BigDecimal totalMoney;
    private String description;
    private Boolean isModified;
    private Integer idDoctor;
    private String barCode;
    private Boolean isDeb;
    private Integer idNoteMedical;
    private BigDecimal score;
    private BigDecimal preScore;
    private BigDecimal paymentScore;
    private BigDecimal paymentScoreAmount;
    private Integer performerId;
    private String templateDocument;
    private Boolean isLock;
}

