package com.mycompany.dao;

import com.mycompany.enitities.JobInfo;

import java.util.List;

/**
 * @Author Soulelement99
 * @Date 2019/11/27-1:33
 */
public interface JobInfoDao {
    //根据id获取JobInfo
    JobInfo getJobInfoById(Integer id);
    //获取所有JobInfo
    List<JobInfo> getJobInfos();
    //插入一条JobInfo记录
    int insertJobInfo(JobInfo jobInfo);
    //修改一条JobInfo记录
    int updateJobInfo(JobInfo jobInfo);
    //删除一条JobInfo记录
    int deleteJobInfoById(Integer id);
}
