package com.ruoyi.shuai.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.shuai.domain.Camera;

import java.util.List;

/**
 * 摄像头Service接口
 *
 * @author 辉哥
 * @date 2023-05-11
 */
public interface ICameraService extends IService<Camera> {
    /**
     * 查询摄像头
     *
     * @param id 摄像头ID
     * @return 摄像头
     */
    public Camera selectCameraById(Long id);

    /**
     * 查询摄像头列表
     *
     * @param camera 摄像头
     * @return 摄像头集合
     */
    public List<Camera> selectCameraList(Camera camera);

    /**
     * 新增摄像头
     *
     * @param camera 摄像头
     * @return 结果
     */
    public int insertCamera(Camera camera);

    /**
     * 修改摄像头
     *
     * @param camera 摄像头
     * @return 结果
     */
    public int updateCamera(Camera camera);

    /**
     * 批量删除摄像头
     *
     * @param ids 需要删除的摄像头ID
     * @return 结果
     */
    public int deleteCameraByIds(Long[] ids);

    /**
     * 删除摄像头信息
     *
     * @param id 摄像头ID
     * @return 结果
     */
    public int deleteCameraById(Long id);
}
