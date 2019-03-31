package com.tank.test.dao;

import com.tank.test.entity.MyFile;

public interface FileDao {
     String getLatestVersion();
     MyFile uploadFile();

}
