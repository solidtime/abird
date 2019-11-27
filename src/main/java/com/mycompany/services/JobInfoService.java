package com.mycompany.services;

import com.mycompany.dao.JobInfoDao;
import com.mycompany.enitities.JobInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Soulelement99
 * @Date 2019/11/27-6:44
 */
@Service
public class JobInfoService {
    @Autowired
    JobInfoDao jobInfoDao;

    //根据id
    public JobInfo getJobInfoById(Integer id){
        return jobInfoDao.getJobInfoById(id);
    }

    public List<JobInfo> getJobInfos(){
        return jobInfoDao.getJobInfos();
    }

    public int insertJobInf(JobInfo jobInfo){
        return jobInfoDao.insertJobInfo(jobInfo);
    }

    public int updateJobInf(JobInfo jobInfo){
        return jobInfoDao.updateJobInfo(jobInfo);
    }

    public int deleteJobInf(Integer id){
        return jobInfoDao.deleteJobInfoById(id);
    }
}
