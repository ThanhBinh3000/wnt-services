package vn.com.gsoft.services.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "NoteServiceDetails")
public class NoteServiceDetails extends BaseEntity {
    @Id
    @Column(name = "IdNoteDetailService")
    private Integer idNoteDetailService;
    @Column(name = "IdNoteService")
    private Integer idNoteService;
    @Column(name = "DrugId")
    private Integer drugId;
    @Column(name = "Amount")
    private BigDecimal amount;
    @Column(name = "RetailOutPrice")
    private BigDecimal retailOutPrice;
    @Column(name = "RecordStatusID")
    private Integer recordStatusID;
    @Column(name = "StoreCode")
    private String storeCode;
    @Column(name = "CreatedById")
    private Integer createdById;
    @Column(name = "CreatedDate")
    private Date createdDate;
    @Column(name = "UpdatedById")
    private Integer updatedById;
    @Column(name = "UpdatedDate")
    private Date updatedDate;
    @Column(name = "IsModified")
    private Boolean isModified;
    @Column(name = "ImplementationRoomCode")
    private Integer implementationRoomCode;
    @Column(name = "IndexDescription")
    private String indexDescription;
    @Column(name = "Result")
    private String result;
    @Column(name = "IdStatus")
    private Boolean idStatus;
    @Column(name = "IdNoteDetail")
    private Integer idNoteDetail;
    @Column(name = "CountNumbers")
    private Integer countNumbers;
    @Column(name = "LastCountNumbers")
    private Integer lastCountNumbers;
    @Column(name = "TextDocument")
    private String textDocument;
    @Column(name = "ResultImage1")
    private String resultImage1;
    @Column(name = "ResultImage2")
    private String resultImage2;
}

