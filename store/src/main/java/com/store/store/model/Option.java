package com.store.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Option {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;

  private String code;
  private String label_EsEs;
  private String label_NlNl;
  private String label_NlBe;
  private String label_NbNo;
  private String label_ItIt;
  private String label_FrFr;
  private String label_FiFi;
  private String label_EnUs;
  private String label_SvSe;
  private String label_EnIe;
  private String label_EnGb;
  private String label_DeDe;
  private String label_DeCh;
  private String label_DeAt;
  private String label_DaDk;
  private String label_CsCz;
  private String label_PlPl;
  @ManyToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
  })
  @JoinColumn(name = "fk_attribute")
  private Attribute attribute;
  private long sortOrder;


}
