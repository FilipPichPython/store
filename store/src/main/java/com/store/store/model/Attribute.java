package com.store.store.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attribute {

  @Id
  private String code;
  private String label_ItIt;
  private String label_EnGb;
  private String label_EnIe;
  private String label_PlPl;
  private String label_NlNl;
  private String label_NlBe;
  private String label_NbNo;
  private String label_FiFi;
  private String label_EnUs;
  private String label_EsEs;
  private String label_DeDe;
  private String label_DeCh;
  private String label_DeAt;
  private String label_DaDk;
  private String label_FrFr;
  private String label_SvSe;
  private String label_CsCz;
  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "attribute", cascade = {
          CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
  })
  private Set<Option> options = new HashSet<>();

}
