package com.ruoyi.shuai.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.shuai.domain.Camera;

/**
 * 摄像头Mapper接口
 *
 * @author 辉哥
 * @date 2023-05-11
 */
public interface CameraMapper extends BaseMapper<Camera>
{
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
     * 删除摄像头
     *
     * @param id 摄像头ID
     * @return 结果
     */
    public int deleteCameraById(Long id);

    /**
     * 批量删除摄像头
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCameraByIds(Long[] ids);
}
