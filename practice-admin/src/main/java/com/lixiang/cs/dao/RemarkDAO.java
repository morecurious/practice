package com.lixiang.cs.dao;

import com.lixiang.cs.model.Remark;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 2016/4/21.
 */
@Repository
public interface RemarkDAO {
   List<Remark> selectAll();
}
