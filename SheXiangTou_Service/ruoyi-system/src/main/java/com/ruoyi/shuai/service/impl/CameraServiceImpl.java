package com.ruoyi.shuai.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shuai.mapper.CameraMapper;
import com.ruoyi.shuai.domain.Camera;
import com.ruoyi.shuai.service.ICameraService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 摄像头Service业务层处理
 * 
 * @author 辉哥
 * @date 2023-05-11
 */
@Service
public class CameraServiceImpl extends ServiceImpl<CameraMapper, Camera> implements ICameraService
{
    @Autowired
    private CameraMapper cameraMapper;

    /**
     * 查询摄像头
     * 
     * @param id 摄像头ID
     * @return 摄像头
     */
    @Override
    public Camera selectCameraById(Long id)
    {
        return cameraMapper.selectCameraById(id);
    }

    /**
     * 查询摄像头列表
     * 
     * @param camera 摄像头
     * @return 摄像头
     */
    @Override
    public List<Camera> selectCameraList(Camera camera)
    {
        return cameraMapper.selectCameraList(camera);
    }

    /**
     * 新增摄像头
     * 
     * @param camera 摄像头
     * @return 结果
     */
    @Override
    public int insertCamera(Camera camera)
    {
        camera.setCreateTime(DateUtils.getNowDate());
        return cameraMapper.insertCamera(camera);
    }

    /**
     * 修改摄像头
     * 
     * @param camera 摄像头
     * @return 结果
     */
    @Override
    public int updateCamera(Camera camera)
    {
        camera.setUpdateTime(DateUtils.getNowDate());
        return cameraMapper.updateCamera(camera);
    }

    /**
     * 批量删除摄像头
     * 
     * @param ids 需要删除的摄像头ID
     * @return 结果
     */
    @Override
    public int deleteCameraByIds(Long[] ids)
    {
        return cameraMapper.deleteCameraByIds(ids);
    }

    /**
     * 删除摄像头信息
     * 
     * @param id 摄像头ID
     * @return 结果
     */
    @Override
    public int deleteCameraById(Long id)
    {
        return cameraMapper.deleteCameraById(id);
    }
}
