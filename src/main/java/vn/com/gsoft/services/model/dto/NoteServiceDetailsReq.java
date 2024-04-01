package vn.com.gsoft.services.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.gsoft.services.entity.BaseEntity;
import vn.com.gsoft.services.model.system.BaseRequest;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class NoteServiceDetailsReq extends BaseRequest {

    private Integer idNoteDetailService;
    private Integer idNoteService;
    private Integer drugId;
    private BigDecimal amount;
    private BigDecimal retailOutPrice;
    private Integer recordStatusID;
    private String storeCode;
    private Integer createdById;
    private Date createdDate;
    private Integer updatedById;
    private Date updatedDate;
    private Boolean isModified;
    private Integer implementationRoomCode;
    private String indexDescription;
    private String result;
    private Boolean idStatus;
    private Integer idNoteDetail;
    private Integer countNumbers;
    private Integer lastCountNumbers;
    private String textDocument;
    private String resultImage1;
    private String resultImage2;
}

