package com.example.demo.Entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.Collection;

//  @Document("test_mongo_1_doc")       <-- 이거 쓰면 안됨(이름이 달라서)   <-- 하는 방법 찾아야 됨
@Data
@Entity
public class Test_Mongo_1 {
    @Id
    private int id;

    private String test_str;

    private Integer test_int;

//    @ManyToOne(targetEntity = Test_Mongo_2.class, fetch = FetchType.LAZY)
//    @JoinColumn(nullable = false)
//    private Test_Mongo_2 joinTest;
}
