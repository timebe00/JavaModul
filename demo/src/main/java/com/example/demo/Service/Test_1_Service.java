package com.example.demo.Service;

import com.example.demo.Entity.Test_Mongo_1;

import java.util.List;

public interface Test_1_Service {
    public void write(Test_Mongo_1 input_test) throws Exception;
    public List select(int select_num) throws Exception;
    public void update(Test_Mongo_1 update_test) throws Exception;
    public void delete(Test_Mongo_1 delecte_test) throws Exception;
//    public List join_test() throws Exception;
}
