package com.lixiang.cs.service.impl;


import com.lixiang.cs.dao.RemarkDAO;
import com.lixiang.cs.model.Remark;
import com.lixiang.cs.service.RemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 2016/4/21.
 */
@Service
public class RemarkServiceImp implements RemarkService {

    @Autowired
    private RemarkDAO remarkDAO;

    @Override
    public List<Remark> selectAll() {
        return remarkDAO.selectAll();
    }
}
