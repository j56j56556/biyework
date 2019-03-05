package com.demo.service.imlp;

import com.demo.dao.StuMapper;
import com.demo.service.IStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuImpl implements IStu {

    @Autowired
    private StuMapper stuMapper;

    @Override
    public String select(int id) {
        return stuMapper.selectByPrimaryKey(id).getName();
    }
}
